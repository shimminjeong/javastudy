package com.simminjeong.baseballgame.entitiy;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private List<String> numberlist = new ArrayList<>();

	public Game(List<String> numberlist) {
		this.numberlist = numberlist;
	}

	public List<String> getNumberlist() {
		return numberlist;
	}

	public void setNumberlist(List<String> numberlist) {
		this.numberlist = numberlist;
	}
	
	

}
