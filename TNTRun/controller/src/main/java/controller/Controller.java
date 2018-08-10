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
		System.out.println("Play");
		while(level.getPlayer().isAlive()){
		for (ITile tile : level.getMap()) {
			tile.reduce();
			
		}
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}










	
	
	
	
	

}
