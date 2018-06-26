package com.cdac.gist.ocp.after.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<OrderItem> _items;
	private IPricingCalculator iPricingCalculator;

	public Cart() {
		_items = new ArrayList<>();
	}

	public List<OrderItem> get_items() {
		return _items;
	}

	public double getTotalAmpunt() {
		double totalAmount = 0.0;
		for (OrderItem orderItem : _items) {
			totalAmount = totalAmount + iPricingCalculator.calculatePrice(orderItem);
			// more rules are coming
		}
		return totalAmount;
	}
}
