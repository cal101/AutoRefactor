/*
 * AutoRefactor - Eclipse plugin to automatically refactor Java code bases.
 *
 * Copyright (C) 2016 Jean-Noël Rouvignac - initial API and implementation
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
package org.autorefactor.refactoring;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IPackageBinding;

class PackageBindingStub implements IPackageBinding {
	private final String packageName;

	PackageBindingStub(String packageName) {
		this.packageName= packageName;
	}

	/**
	 * Get the annotations.
	 *
	 * @return the annotations.
	 */
	@Override
	public IAnnotationBinding[] getAnnotations() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Get the Java element.
	 *
	 * @return the Java element.
	 */
	@Override
	public IJavaElement getJavaElement() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Get the key.
	 *
	 * @return the key.
	 */
	@Override
	public String getKey() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Get the kind.
	 *
	 * @return the kind.
	 */
	@Override
	public int getKind() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Get the modifiers.
	 *
	 * @return the modifiers.
	 */
	@Override
	public int getModifiers() {
		throw new UnsupportedOperationException();
	}

	/**
	 * True if it is deprecated.
	 *
	 * @return True if it is deprecated.
	 */
	@Override
	public boolean isDeprecated() {
		throw new UnsupportedOperationException();
	}

	/**
	 * True if it is equal.
	 *
	 * @return True if it is equal.
	 */
	@Override
	public boolean isEqualTo(IBinding arg0) {
		throw new UnsupportedOperationException();
	}

	/**
	 * True if it is recovered.
	 *
	 * @return True if it is recovered.
	 */
	@Override
	public boolean isRecovered() {
		throw new UnsupportedOperationException();
	}

	/**
	 * True if it is synthetic.
	 *
	 * @return True if it is synthetic.
	 */
	@Override
	public boolean isSynthetic() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getName() {
		return packageName;
	}

	/**
	 * Get the name components.
	 *
	 * @return the name components.
	 */
	@Override
	public String[] getNameComponents() {
		throw new UnsupportedOperationException();
	}

	/**
	 * True if it is unnamed.
	 *
	 * @return True if it is unnamed.
	 */
	@Override
	public boolean isUnnamed() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return packageName;
	}
}
