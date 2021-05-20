/*
 * generated by Xtext 2.25.0
 */
package com.intuit.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.intuit.dsl.ExpressionRuntimeModule;
import com.intuit.dsl.ExpressionStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ExpressionIdeSetup extends ExpressionStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ExpressionRuntimeModule(), new ExpressionIdeModule()));
	}
	
}
