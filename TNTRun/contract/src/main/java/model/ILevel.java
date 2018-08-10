package model;

import java.util.ArrayList;

public interface ILevel {
	public ArrayList<ITile> getMap();
	public int getPixels();
	public int getWidth();
	public int getHeight();
	public IPlayer getPlayer();

}
