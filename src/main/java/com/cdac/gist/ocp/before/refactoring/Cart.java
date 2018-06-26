package com.cdac.gist.ocp.before.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<OrderItem> _items;

	public Cart() {
		_items = new ArrayList<>();
	}

	public List<OrderItem> get_items() {
		return _items;
	}

	public double getTotalAmpunt() {
		double totalAmount = 0.0;
		for (OrderItem orderItem : _items) {

			if (orderItem.getSku().startsWith("EACH")) {
				totalAmount=totalAmount+orderItem.quantity*5;

			} else if (orderItem.getSku().startsWith("WEIGHT")) {
				totalAmount=totalAmount+orderItem.quantity*4/1000;

			} else if (orderItem.getSku().startsWith("SPECIAL")) {
				totalAmount=totalAmount+orderItem.quantity*40;
			}
			// more rules are coming
		}
		return totalAmount;
	}
}
