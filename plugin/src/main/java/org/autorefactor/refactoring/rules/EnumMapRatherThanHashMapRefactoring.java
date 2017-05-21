package org.autorefactor.refactoring.rules;

import static org.autorefactor.refactoring.ASTHelper.DO_NOT_VISIT_SUBTREE;
import static org.autorefactor.refactoring.ASTHelper.VISIT_SUBTREE;
import static org.autorefactor.refactoring.ASTHelper.arguments;
import static org.autorefactor.refactoring.ASTHelper.hasType;
import static org.autorefactor.refactoring.ASTHelper.instanceOf;

import java.util.List;

import org.autorefactor.refactoring.ASTBuilder;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeLiteral;

public final class EnumMapRatherThanHashMapRefactoring extends
AbstractEnumCollectionReplacementRefactoring {

	@Override
	public String getDescription() {
		return "Refactor implementation class HashMap -> EnumMap when key is a enum type";
	}

	@Override
	public String getName() {
		return "HashMap to EnumMap for enum keys";
	}

	@Override
	String getImplType() {
		return "java.util.HashMap";
	}

	@Override
	String getInterfaceType() {
		return "java.util.Map";
	}

	/**
	 * Replace given class instance creation with suitable EnumMap constructor. <br>
	 * <br>
	 * Replacement is not correct if HashMap constructor accepts map <br>
	 * other than EnumMap, because it throws
	 * <code>IllegalArgumentException</code> if map is empty,<br>
	 * and HashMap(Map) does not. Therefore, for correctness reasons, it should
	 * not be refactored. <br>
	 * 
	 * @see {@link java.util.EnumMap#EnumMap(java.util.Map)}
	 * @see {@link java.util.HashMap#HashMap(java.util.Map)}
	 */
	@Override
	boolean replace(ClassInstanceCreation cic, Type... types) {

		if (types == null || types.length < 2) {
			return VISIT_SUBTREE;
		}
		Type keyType = types[0];
		Type valueType = types[1];
		ASTBuilder b = ctx.getASTBuilder();
		List<Expression> arguments = arguments(cic);
		if (!arguments.isEmpty()
				&& isTargetType(arguments.get(0).resolveTypeBinding())
				&& !hasType(arguments.get(0).resolveTypeBinding(),
						"java.util.EnumMap")) {
			return VISIT_SUBTREE;
		}
		Expression newParam = resolveParameter(keyType, arguments);
		Type newType = b.genericType("EnumMap", b.copy(keyType),
				b.copy(valueType));
		// if there were no type args in original creation (diamond operator),
		// remove them from replacement
		if (typeArgs(cic.getType()).isEmpty()) {
			typeArgs(newType).clear();
		}

		ctx.getRefactorings().replace(cic, b.new0(newType, newParam));
		return DO_NOT_VISIT_SUBTREE;
	}

	/**
	 * Map parameter for HashMap constructor to EnumMap constructor.
	 * HashMap(Map) -> EnumMap(EnumMap) <br/>
	 * other HashMap constructors -> EnumMap(Class)
	 * 
	 * @return correct parameter for EnumMap constructor
	 */
	private Expression resolveParameter(Type keyType,
			List<Expression> originalArgs) {
		if (!originalArgs.isEmpty()
				&& instanceOf(originalArgs.get(0), "java.util.EnumMap")) {
			return ctx.getASTBuilder().copy(originalArgs.get(0));
		}
		TypeLiteral keyTypeLiteral = keyType.getAST().newTypeLiteral();
		keyTypeLiteral.setType(ctx.getASTBuilder().copy(keyType));
		return keyTypeLiteral;
	}
}