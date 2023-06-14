package com.simminjeong.subway.entity;

public class Bread extends Ingredient {
	
	private int size;
//
//	public Bread(int size) {
//		super();
//		this.size = size;
//	}
	
	public Bread() {
		super();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

//1을 계속 넘겨서 하위에서 만들어라 
//해시맵을
//빵