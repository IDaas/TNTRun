package model;

import java.awt.Color;

public class Tile extends Element{

	public Tile(int x, int y , Color color) {
		super(x, y);
		this.setColor(color);
		if(color == color.black) {
			this.counter = 0;
		}
	}
	
	private int counter = 5;
	private boolean activated= false;
	
	
	
	
	
	
	public void reduce() {
		if(activated) {
			this.counter --;
			this.setColor(Color.red);
			this.setChanged();
			this.notifyObservers();
		}
		if(counter<=0)
			this.setColor(Color.black);
		
	}
	
	public int getCounter() {
		return this.counter;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	

}
