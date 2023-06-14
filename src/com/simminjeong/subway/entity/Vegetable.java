package com.simminjeong.subway.entity;

public class Vegetable extends Ingredient {

	private int price;

	public Vegetable(String name, int price) {
		super(name);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "vegetable [price=" + price + "]";
	}

}
