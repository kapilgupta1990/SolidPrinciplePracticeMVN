package com.cdac.gist.ocp.after.refactoring;

public class SpecialPriceRule implements IPriceRule {

	@Override
	public boolean isMatch(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double calculatePrice(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return 0;
	}

}
