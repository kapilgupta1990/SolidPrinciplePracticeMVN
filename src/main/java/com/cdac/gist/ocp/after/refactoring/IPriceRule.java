package com.cdac.gist.ocp.after.refactoring;

public interface IPriceRule {

	boolean isMatch(OrderItem orderItem);
	double calculatePrice(OrderItem orderItem);
}
