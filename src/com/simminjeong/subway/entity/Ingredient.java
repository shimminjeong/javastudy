package com.simminjeong.subway.entity;

public abstract class Ingredient {
	String name;
	int cal;
	int price;
	
	public Ingredient() {
//		this.name = "";
//		this.cal = 0;
//		this.price = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", cal=" + cal + ", price=" + price + "]";
	}

}
