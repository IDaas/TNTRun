package model;

import java.awt.Color;

public class Player extends Element{
	private boolean alive = true;
	
	
	
	
	
	public Player(int x, int y) {
		super(x, y);
		this.setColor(Color.GREEN);
	}
	
	
	public void moveToXY(int x , int y) {
		this.x=x;
		this.y=y;
	}
	
	
	public void moveUP()    {this.moveToXY(x, y-1);}
	public void moveDOWN()  {this.moveToXY(x, y+1);}
	public void moveLEFT()  {this.moveToXY(x-1, y);}
	public void moveRIGHT() {this.moveToXY(x+1, y);}
	
	
	
	
	
	
	
	
	
	
	
	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	
	
	
	
	
	
	

}
