package com.simminjeong.baseballgame.entitiy;

import java.util.ArrayList;
import java.util.List;

public class Player extends Game {
	
	private int life;
  
	public Player(List<String> numberlist) {
		super(numberlist);
	}

	public Player(List<String> numberlist, int life) {
		super(numberlist);
		this.life = life;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	
}
