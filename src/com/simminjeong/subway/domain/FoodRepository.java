package com.simminjeong.subway.domain;

import com.simminjeong.subway.entity.Sandwitch;

public interface FoodRepository {
	
	void addIngredient(Sandwitch sandwitch);
	void updateIngredient(Sandwitch sandwitch);
	void printIngredient(Sandwitch sandwitch);
	void printMenu();
	void deleteIngredient(Sandwitch sandwitch);

}
