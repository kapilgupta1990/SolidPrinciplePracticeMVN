package com.cdac.gist.lsp.before.refactoring;

public class AreaCalculator {
	public static int calculateAre(Square square) {
		System.out.println("Inside square");
		return square.getHeight() * square.getHeight();
	}

	public static int calculateAre(Rectangle rectangle) {
		System.out.println("Inside rectangel");

		return rectangle.getHeight() * rectangle.getWeight();
	}

}
