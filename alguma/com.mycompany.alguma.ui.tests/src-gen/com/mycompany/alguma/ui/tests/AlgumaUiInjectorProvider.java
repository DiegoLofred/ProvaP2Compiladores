/*
 * generated by Xtext 2.31.0
 */
package com.mycompany.alguma.ui.tests;

import com.google.inject.Injector;
import com.mycompany.alguma.ui.internal.AlgumaActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class AlgumaUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AlgumaActivator.getInstance().getInjector("com.mycompany.alguma.Alguma");
	}

}