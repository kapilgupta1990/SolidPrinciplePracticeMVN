package com.cdac.gist.ocp.after.refactoring;

public class EachPriceRule implements IPriceRule {

	@Override
	public boolean isMatch(OrderItem orderItem) {
		return orderItem.getSku().startsWith("EACH");
	}

	@Override
	public double calculatePrice(OrderItem orderItem) {
		return orderItem.quantity*5;
	}

}
