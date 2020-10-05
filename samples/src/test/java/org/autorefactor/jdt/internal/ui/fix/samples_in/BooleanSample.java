/*
 * AutoRefactor - Eclipse plugin to automatically refactor Java code bases.
 *
 * Copyright (C) 2013-2015 Jean-Noël Rouvignac - initial API and implementation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program under LICENSE-GNUGPL.  If not, see
 * <http://www.gnu.org/licenses/>.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution under LICENSE-ECLIPSE, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.autorefactor.jdt.internal.ui.fix.samples_in;

import java.util.List;

public class BooleanSample {
    public boolean booleanPrimitive;
    public Boolean booleanWrapper;

    public void replaceIfByAssignment(boolean b) {
        boolean varToAssign;
        // Keep this comment
        if (b) {
            varToAssign = true;
        } else {
            varToAssign = false;
        }
    }

    public void replaceIfByOppositeAssignment(boolean b) {
        boolean varToAssign;
        // Keep this comment
        if (b) {
            varToAssign = false;
        } else {
            varToAssign = true;
        }
    }

    public boolean returnIfConditionBooleanPrimitive(boolean b) {
        // Keep this comment
        if (b) {
            return true;
        } else {
            return false;
        }
    }

    public boolean returnIfConditionBooleanPrimitive2(boolean b) {
        // Keep this comment
        if (b) {
            return false;
        } else {
            return true;
        }
    }

    public boolean returnIfConditionWithInfixExpressionBooleanPrimitive(int i) {
        // Keep this comment
        if (0 < i && i < 12) {
            return false;
        } else {
            return true;
        }
    }

    public boolean returnIfConditionWithInstanceofExpressionBooleanPrimitive(Object o) {
        // Keep this comment
        if (o instanceof String) {
            return false;
        } else {
            return true;
        }
    }

    public boolean returnIfConditionAddCurlyBraces(Object o) {
        // Keep this comment
        if (o instanceof Integer) {
            return true;
        } else if (o instanceof String) {
            return false;
        } else {
            return true;
        }
    }

    public boolean returnIfConditionThatRevertsInstanceofExpressionBooleanPrimitive(Object o) {
        // Keep this comment
        if (!(/* do not lose me */o instanceof String)) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean returnIfConditionBooleanObject(boolean b) {
        // Keep this comment
        if (b) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public Boolean returnIfConditionBooleanObject2(boolean b) {
        // Keep this comment
        if (b) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }
    }

    public boolean returnIfConditionMixedBoolean1(boolean b) {
        // Keep this comment
        if (b) {
            return Boolean.TRUE;
        } else {
            return false;
        }
    }

    public boolean returnIfConditionMixedBoolean2(boolean b) {
        // Keep this comment
        if (b) {
            return true;
        } else {
            return Boolean.FALSE;
        }
    }

    public boolean returnIfConditionBooleanPrimitive3(boolean b) {
        // Keep this comment
        if (b) {
            return true;
        }
        return false;
    }

    public boolean returnIfConditionBooleanPrimitive4(boolean b) {
        // Keep this comment
        if (b) {
            return false;
        }
        return true;
    }

    public boolean returnIfConditionBooleanObject3(boolean b) {
        // Keep this comment
        if (b) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public boolean returnIfConditionBooleanObject4(boolean b) {
        // Keep this comment
        if (b) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public boolean removeUselessTernaryOperatorWithBooleanPrimitive1(boolean isValid) {
        // Keep this comment
        boolean b = isValid ? true : false;
        return b;
    }

    public boolean removeUselessTernaryOperatorWithBooleanPrimitive2(boolean isValid) {
        // Keep this comment
        boolean b = isValid ? false : true;
        return b;
    }

    public Boolean removeUselessTernaryOperatorWithBooleanObject1(boolean isValid) {
        // Keep this comment
        Boolean b = isValid ? Boolean.TRUE : Boolean.FALSE;
        return b;
    }

    public Boolean removeUselessTernaryOperatorWithBooleanObject2(boolean isValid) {
        // Keep this comment
        Boolean b = isValid ? Boolean.FALSE : Boolean.TRUE;
        return b;
    }

    public boolean replaceTernaryOperatorByAndOperator(boolean bo1, boolean bo2) {
        // Keep this comment
        boolean b = bo1 ? bo2 : false;
        return b;
    }

    public boolean replaceTernaryOperatorByAndOperator2(boolean bo1, boolean bo2) {
        // Keep this comment
        boolean b = bo1 ? false : bo2;
        return b;
    }

    public boolean replaceTernaryOperatorByOrOperator(boolean bo1, boolean bo2) {
        // Keep this comment
        boolean b = bo1 ? true : bo2;
        return b;
    }

    public boolean replaceTernaryOperatorByOrOperator2(boolean bo1, boolean bo2) {
        // Keep this comment
        boolean b = bo1 ? bo2 : true;
        return b;
    }

    public Boolean replaceTernaryOperatorByAndOperatorWithObjectConstant(
            boolean bo1, boolean bo2) {
        // Keep this comment
        Boolean b = bo1 ? bo2 : Boolean.FALSE;
        return b;
    }

    public Boolean replaceTernaryOperatorByAndOperatorWithObjectConstant2(
            boolean bo1, boolean bo2) {
        // Keep this comment
        Boolean b = bo1 ? Boolean.FALSE : bo2;
        return b;
    }

    public Boolean replaceTernaryOperatorByOrOperatorWithObjectConstant(
            boolean bo1, boolean bo2) {
        // Keep this comment
        Boolean b = bo1 ? Boolean.TRUE : bo2;
        return b;
    }

    public Boolean replaceTernaryOperatorByOrOperatorWithObjectConstant2(
            boolean bo1, boolean bo2) {
        // Keep this comment
        Boolean b = bo1 ? bo2 : Boolean.TRUE;
        return b;
    }

    public Boolean replaceTernaryOperatorByAndOperatorWithObject(
            Boolean bo1, Boolean bo2) {
        // Keep this comment
        Boolean b = bo1 ? bo2 : false;
        return b;
    }

    public Boolean replaceTernaryOperatorByAndOperatorWithObject2(
            Boolean bo1, Boolean bo2) {
        // Keep this comment
        Boolean b = bo1 ? false : bo2;
        return b;
    }

    public Boolean replaceTernaryOperatorByOrOperatorWithObject(
            Boolean bo1, Boolean bo2) {
        // Keep this comment
        Boolean b = bo1 ? true : bo2;
        return b;
    }

    public Object replaceTernaryOperatorByOrOperatorWithObject2(
            Boolean bo1, Boolean bo2) {
        // Keep this comment
        Object b = bo1 ? bo2 : true;
        return b;
    }

    public Object doNotReplaceNonBooleanExpression(boolean isValid) {
        Object anything = isValid ? true : "false";
        return anything;
    }

    public void doNotReplacePossibleNullObject(Boolean bo1, Boolean bo2) {
        Boolean b = bo1 ? bo2 : Boolean.FALSE;
        b = bo1 ? Boolean.FALSE : bo2;
        b = bo1 ? Boolean.TRUE : bo2;
        b = bo1 ? bo2 : Boolean.TRUE;
    }

    public Boolean replaceTernaryOperatorByAndOperatorWithExpression(int number1, int number2) {
        // Keep this comment
        Boolean b = (number1 == 1) ? (number2 == 2) : Boolean.FALSE;
        return b;
    }

    public Boolean replaceTernaryOperatorByAndOperatorWithExpression2(int number1, int number2) {
        // Keep this comment
        Boolean b = (number1 == 1) ? Boolean.FALSE : (number2 == 2);
        return b;
    }

    public Boolean replaceTernaryOperatorByOrOperatorWithExpression(int number1, int number2) {
        // Keep this comment
        Boolean b = (number1 == 1) ? Boolean.TRUE : (number2 == 2);
        return b;
    }

    public Boolean replaceTernaryOperatorByOrOperatorWithExpression2(int number1, int number2) {
        // Keep this comment
        Boolean b = (number1 == 1) ? (number2 == 2) : Boolean.TRUE;
        return b;
    }

    public void doNotRemoveIfInBooleanPrimitiveAssignment1(boolean isValid) {
        boolean b = true;
        if (isValid) {
            b = false;
        } else {
            System.out.println();
        }
    }

    public void removeUselessIfInBooleanPrimitiveAssignment1(boolean isValid) {
        // Keep this comment
        boolean b = true;
        if (isValid) {
            b = false;
        }
    }

    public void removeUselessIfInBooleanPrimitiveAssignment2(boolean isValid) {
        // Keep this comment
        boolean b = false;
        if (isValid) {
            b = true;
        }
    }

    public void removeUselessIfInBooleanObjectAssignment1(boolean isValid) {
        // Keep this comment
        Boolean b = Boolean.TRUE;
        if (isValid) {
            b = Boolean.FALSE;
        }
    }

    public void removeUselessIfInBooleanObjectAssignment2(boolean isValid) {
        // Keep this comment
        boolean b = Boolean.FALSE;
        if (isValid) {
            b = Boolean.TRUE;
        }
    }

    public void removeUselessIfInBooleanPrimitiveAssignment3(boolean isValid,
            boolean b) {
        // Keep this comment
        b = true;
        if (isValid) {
            b = false;
        }
    }

    public void removeUselessIfInBooleanPrimitiveAssignment4(boolean isValid,
            boolean b) {
        // Keep this comment
        b = false;
        if (isValid) {
            b = true;
        }
    }

    public void doNotInlineAlreadyUsedVariable(boolean isValid) {
        boolean b = false;
        if (isValid || b) {
            b = true;
        }
    }

    public void removeUselessIfInBooleanPrimitiveAssignmentSearchFurtherAwayForPreviousSibling(
            boolean isValid, boolean b) {
        b = false;
        char c = 'a';
        byte by = 0;
        double d = 0.0;
        if (isValid) {
            b = true;
        }
    }

    public void removeUselessIfInBooleanObjectAssignment3(boolean isValid, Boolean b) {
        // Keep this comment
        b = Boolean.TRUE;
        if (isValid) {
            b = Boolean.FALSE;
        }
    }

    public void removeUselessIfInBooleanObjectAssignment4(boolean isValid, Boolean b) {
        // Keep this comment
        b = Boolean.FALSE;
        if (isValid) {
            b = Boolean.TRUE;
        }
    }

    public void removeUselessIfInBooleanPrimitiveAssignment5(boolean isValid) {
        // Keep this comment
        this.booleanPrimitive = Boolean.FALSE;
        if (isValid) {
            this.booleanPrimitive = Boolean.TRUE;
        }
    }

    public void removeUselessIfInBooleanObjectAssignment5(boolean isValid) {
        // Keep this comment
        this.booleanWrapper = Boolean.FALSE;
        if (isValid) {
            this.booleanWrapper = Boolean.TRUE;
        }
    }

    public void removeUselessIfInBooleanPrimitiveAssignment6(boolean isValid) {
        // Keep this comment
        booleanPrimitive = Boolean.FALSE;
        if (isValid) {
            booleanPrimitive = Boolean.TRUE;
        }
    }

    public void removeUselessIfInBooleanObjectAssignment6(boolean isValid) {
        // Keep this comment
        booleanWrapper = Boolean.FALSE;
        if (isValid) {
            booleanWrapper = Boolean.TRUE;
        }
    }

    public void removeUselessIfInBooleanObjectAssignment7(boolean isValid) {
        // Keep this comment
        BooleanSample.this.booleanWrapper = Boolean.FALSE;
        if (isValid) {
            BooleanSample.this.booleanWrapper = Boolean.TRUE;
        }
    }

    public boolean removeUselessIfInBooleanPrimitiveAssignment7(boolean isValid) {
        // Keep this comment
        if (isValid) {
            return aMethodThatReturnsBoolean();
        }
        return false;
    }

    public boolean removeUselessIfInBooleanPrimitiveAssignment8(boolean isValid) {
        // Keep this comment
        if (isValid) {
            return aMethodThatReturnsBoolean();
        }
        return true;
    }

    public boolean removeUselessIfInBooleanPrimitiveAssignment9(boolean isValid) {
        // Keep this comment
        if (isValid) {
            return false;
        }
        return aMethodThatReturnsBoolean();
    }

    public boolean removeUselessIfInBooleanPrimitiveAssignment10(boolean isValid) {
        // Keep this comment
        if (isValid) {
            return true;
        }
        return aMethodThatReturnsBoolean();
    }

    public boolean removeUselessIfWithBooleanObjectParameter1(Boolean isValid) {
        // Keep this comment
        if (isValid) {
            return aMethodThatReturnsBoolean();
        }
        return false;
    }

    public boolean removeUselessIfWithBooleanObjectParameter2(Boolean isValid) {
        // Keep this comment
        if (isValid) {
            return aMethodThatReturnsBoolean();
        }
        return true;
    }

    public boolean removeUselessIfWithBooleanObjectParameter3(Boolean isValid) {
        // Keep this comment
        if (isValid) {
            return false;
        }
        return aMethodThatReturnsBoolean();
    }

    public boolean removeUselessIfWithBooleanObjectParameter4(Boolean isValid) {
        // Keep this comment
        if (isValid) {
            return true;
        }
        return aMethodThatReturnsBoolean();
    }

    public void removeUselessTernaryOperatorWithBooleanPrimitive(boolean isValid) {
        aMethodThatAcceptsABoolean(isValid ? true : false);
        aMethodThatAcceptsABoolean(isValid ? false : true);
        aMethodThatAcceptsABoolean(isValid ? Boolean.TRUE : Boolean.FALSE);
        aMethodThatAcceptsABoolean(isValid ? Boolean.FALSE : Boolean.TRUE);
    }

    public void directlyPassBooleanPrimitiveAsParameter(boolean isValid) {
        // Keep this comment
        if (isValid) {
            aMethodThatAcceptsABoolean(true);
        } else {
            aMethodThatAcceptsABoolean(false);
        }
    }

    public void directlyPassBooleanExpressionAsParameter(int i) {
        // Keep this comment
        if (i > 0) {
            aMethodThatAcceptsABoolean(true);
        } else {
            aMethodThatAcceptsABoolean(false);
        }
    }

    public void mergeCodeInIfStatement(int i) {
        if (i % 2 == 0) {
            // Keep this comment
            if (i > 0) {
                aMethodThatAcceptsABoolean(true);
            } else {
                aMethodThatAcceptsABoolean(false);
            }
        }
    }

    public void mergeCodeInElseStatement(int i) {
        // Keep this comment
        if (i % 2 == 0) {
            System.out.println("i is even");
        } else if (i > 0) {
            aMethodThatAcceptsABoolean(true);
        } else {
            aMethodThatAcceptsABoolean(false);
        }
    }

    public void doNotDuplicateExpression(int i) {
        if (i > 0) {
            aMethodThatAcceptsABoolean(true);
            aMethodThatAcceptsABoolean(true);
        } else {
            aMethodThatAcceptsABoolean(false);
            aMethodThatAcceptsABoolean(false);
        }
    }

    public void directlyPassInvertedBooleanPrimitiveAsParameter(boolean isValid) {
        // Keep this comment
        if (isValid) {
            aMethodThatAcceptsABoolean(false);
        } else {
            aMethodThatAcceptsABoolean(true);
        }
    }

    public int directlyPassBooleanAmongOtherCode(boolean isValid) {
        // Keep this comment
        if (isValid) {
            aMethodThatAcceptsABoolean(true);
            if (aMethodThatReturnsBoolean()) {
                return 0;
            } else {
                return 10;
            }
        } else {
            aMethodThatAcceptsABoolean(false);
            if (aMethodThatReturnsBoolean())
                return 0;
            else
                return 10;
        }
    }

    public int directlyPassBooleanAmongOtherBoolean(boolean isValid, int i) {
        // Keep this comment
        if (isValid) {
            aMethodThatAcceptsABoolean(true);
            aMethodThatAcceptsABoolean(true);
            aMethodThatAcceptsABoolean(true);
            i++;
        } else {
            aMethodThatAcceptsABoolean(true);
            aMethodThatAcceptsABoolean(false);
            aMethodThatAcceptsABoolean(true);
            ++i;
        }
        return i;
    }

    public int directlyPassOppositeBoolean(boolean isValid) {
        // Keep this comment
        if (isValid) {
            aMethodThatAcceptsABoolean(true);
            aMethodThatAcceptsABoolean(false);
            if (aMethodThatReturnsBoolean()) {
                return 0;
            } else
                return 10;
        } else {
            aMethodThatAcceptsABoolean(false);
            aMethodThatAcceptsABoolean(true);
            if (aMethodThatReturnsBoolean())
                return 0;
            else {
                return 10;
            }
        }
    }

    public int directlyPassOppositeBoolean() {
        // Keep this comment
        if (this.booleanPrimitive) {
            aMethodThatAcceptsABoolean(true);
            aMethodThatAcceptsABoolean(false);
            if (aMethodThatReturnsBoolean()) {
                return 0;
            } else
                return 10;
        } else {
            aMethodThatAcceptsABoolean(false);
            aMethodThatAcceptsABoolean(true);
            if (aMethodThatReturnsBoolean())
                return 0;
            else {
                return 10;
            }
        }
    }

    public int refactorWithFollowingCode(boolean isValid) {
        // Keep this comment
        if (isValid) {
            aMethodThatAcceptsABoolean(false);
        } else {
            aMethodThatAcceptsABoolean(true);
        }
        return 42;
    }

    public int doNotRefactorWithNameConflict(boolean isValid) {
        if (isValid) {
            boolean b = true;
            aMethodThatAcceptsABoolean(b);
        } else {
            boolean b = false;
            aMethodThatAcceptsABoolean(b);
        }

        int b = 42;
        return b;
    }

    public void doNotMoveActiveExpression(List<Integer> modifiableList) {
        if (modifiableList.add(1)) {
            aMethodThatAcceptsABoolean(modifiableList.contains(1));
            aMethodThatAcceptsABoolean(true);
        } else {
            aMethodThatAcceptsABoolean(modifiableList.contains(1));
            aMethodThatAcceptsABoolean(false);
        }
    }

    public void removeUselessIfInBooleanPrimitiveExpression12(boolean isValid) {
        if (isValid) {
            aMethodThatAcceptsABoolean(true);
        } else {
            aMethodThatAcceptsABoolean(aMethodThatReturnsBoolean());
        }
        // FIXME This should be converted to aMethodThatAcceptsABoolean(isValid || aMethodThatReturnsBoolean());
    }

    public void removeUselessIfInBooleanPrimitiveExpression13(boolean isValid) {
        if (isValid) {
            aMethodThatAcceptsABoolean(false);
        } else {
            aMethodThatAcceptsABoolean(aMethodThatReturnsBoolean());
        }
        // FIXME This should be converted to aMethodThatAcceptsABoolean(!isValid && aMethodThatReturnsBoolean());
    }

    public void removeUselessIfInBooleanPrimitiveExpression14(boolean isValid) {
        if (isValid) {
            aMethodThatAcceptsABoolean(aMethodThatReturnsBoolean());
        } else {
            aMethodThatAcceptsABoolean(true);
        }
        // FIXME This should be converted to aMethodThatAcceptsABoolean(!isValid || aMethodThatReturnsBoolean());
    }

    public void removeUselessIfInBooleanPrimitiveExpression15(boolean isValid) {
        if (isValid) {
            aMethodThatAcceptsABoolean(aMethodThatReturnsBoolean());
        } else {
            aMethodThatAcceptsABoolean(false);
        }
        // FIXME This should be converted to aMethodThatAcceptsABoolean(isValid && aMethodThatReturnsBoolean());
    }

    public boolean invertConditionalExpression(int i, boolean res1, boolean res2) {
        // Keep this comment
        if (i == 0 ? res1 : res2) {
            return false;
        }
        return true;
    }

    public boolean invertAssignment(boolean b1, boolean b2) {
        // Keep this comment
        if (b1 = b2) {
            return false;
        }
        return true;
    }

    public boolean invertCast(Object o) {
        // Keep this comment
        if ((Boolean) o) {
            return false;
        }
        return true;
    }

    public boolean doNotRefactor(Object o) {
        if (o instanceof Double) {
            return ((Double) o).doubleValue() != 0;
        } else if (o instanceof Float) {
            return ((Float) o).floatValue() != 0;
        }
        return false;
    }

    public Boolean doNotThrowAnyException(boolean isValid) {
        class ClassWithBooleanField {
            Boolean b;
        }
        ClassWithBooleanField objWithBooleanField = new ClassWithBooleanField();
        return isValid ? objWithBooleanField.b : Boolean.TRUE;
    }

    protected boolean aMethodThatReturnsBoolean() {
        return false;
    }

    protected void aMethodThatAcceptsABoolean(boolean b) {
    }
}
