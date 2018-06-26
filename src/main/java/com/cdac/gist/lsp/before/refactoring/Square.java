package com.cdac.gist.lsp.before.refactoring;

public class Square extends Rectangle {

	private int width;
	private int height;

	@Override
	public void setWeight(int weight) {
		this.width = weight;
		this.height = weight;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
}
