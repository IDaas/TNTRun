package controller;

import model.ILevel;
import model.ITile;
import view.IView;

public class Controller implements IController{
	
	public ILevel level;
	public IView view;
	
	

	public  Controller(ILevel level, IView view) {
		this.view= view;
		this.level=level;
	}
	
	
	
	
	
	
	
	
	
	public void play() {
		
		while(level.getPlayer().isAlive())
		for (ITile tile : level.getMap()) {
			tile.reduce();
			
		}
		
	}










	
	
	
	
	

}
