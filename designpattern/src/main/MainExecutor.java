package main;

import factorypattern.FactoryEx;

/**
 * Hello world!
 *
 */
public class MainExecutor {
	public static void main(String[] args) {
		execFactory(new FactoryEx());
	}

	private static final void execFactory(final FactoryEx fac) {
		System.out.println(fac.getGender("Glauco", "M"));
		System.out.println(fac.getGender("Maria", "F"));
	}
}
