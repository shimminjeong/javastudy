package com.simminjeong.subway.domain;

import java.util.ArrayList;
import java.util.List;

import com.simminjeong.subway.entity.Ingredient;
import com.simminjeong.subway.entity.Sandwitch;

public class Cook implements FoodRepository {

//	List<Bread> breads = new ArrayList<>();
//	List<Source> sources = new ArrayList<>();
//	List<Vegetable> vegetables = new ArrayList<>();

	Sandwitch sandwitch = new Sandwitch();

	@Override
	public void addIngredient(Sandwitch sandwitch) {
		sandwitch.set(sandwitch);

	}

	@Override
	public void updateIngredient(Sandwitch sandwitch) {
		sandwitch.
		
	}

	@Override
	public void printIngredient(Sandwitch sandwitch) {

	}

	@Override
	public void deleteIngredient(Sandwitch sandwitch) {

	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub

	}

}
