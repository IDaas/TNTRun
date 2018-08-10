package model;

import java.awt.Color;

public class RedTile extends Element{

	public RedTile(int x, int y) {
		super(x, y);
		this.setColor(Color.red);
	}
	
	private int counter = 5;
	public int getCounter() {
		return this.counter;
	}
	
	public void reduce() {
		this.counter --;
		
	}
	
	

}
