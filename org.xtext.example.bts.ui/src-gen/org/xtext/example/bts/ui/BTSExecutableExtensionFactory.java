/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.bts.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.bts.ui.internal.BtsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BTSExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(BtsActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		BtsActivator activator = BtsActivator.getInstance();
		return activator != null ? activator.getInjector(BtsActivator.ORG_XTEXT_EXAMPLE_BTS_BTS) : null;
	}

}