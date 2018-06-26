package com.cdac.gist.lsp.before.refactoring;

public class Tester {

	public static void main(String[] args) {
		Rectangle rectangle=new Square();
		rectangle.setHeight(5);
		rectangle.setWeight(4);
		System.out.println(AreaCalculator.calculateAre(rectangle));
	}
}
