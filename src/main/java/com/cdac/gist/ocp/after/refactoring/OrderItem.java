package com.cdac.gist.ocp.after.refactoring;

public class OrderItem {

	private String sku;
	public int quantity;
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
