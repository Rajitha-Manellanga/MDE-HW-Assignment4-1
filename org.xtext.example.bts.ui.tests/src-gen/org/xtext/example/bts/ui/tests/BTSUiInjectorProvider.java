/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.bts.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.bts.ui.internal.BtsActivator;

public class BTSUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BtsActivator.getInstance().getInjector("org.xtext.example.bts.BTS");
	}

}
