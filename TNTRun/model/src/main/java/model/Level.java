package model;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Level {
	public Player player;
	private int width = 30;
	private int height = 20;
	private int pixels = 30;
	public Player getPlayer() {
		return player;
	}
	
	
	public Level() {
		this.generate();
		this.placePlayer();
		
	}


	private ArrayList<Element> map;
	
	
	public void generate() {
		setMap(new ArrayList<Element>());
		for(int posx = 0 ; posx < width ; posx ++) {
			for(int posy = 0 ; posy < height ; posy ++ ) {
				if(posx == 0 || posx == width-1 || posy == 0 || posy == height-1)
					getMap().add(new Tile(posx,posy,Color.black));
				else {
					Random rand = new Random();
					int  r = rand.nextInt(100);
					if(r>85) {
						getMap().add(new Tile(posx,posy,Color.black));
					}
					else {
						getMap().add(new Tile(posx,posy,Color.GRAY));
					}
					
					
				}
				
				
			}
		}
		
		
		
	}
	
	public void placePlayer() {
		boolean validate = false;
		do {
			Random rand = new Random();
			int  posx = rand.nextInt(width);
			rand = new Random();
			int  posy = rand.nextInt(height);
			
			for (Element element : getMap()) {
				if(posx == element.getX() && posy ==element.getY() && element.getColor()==Color.GRAY)
					validate=true;
					player = new Player(posx, posy,this);
			}
		}while(!validate);
		
		
		
	}

	public ArrayList<Element> getMap() {
		return map;
	}

	public void setMap(ArrayList<Element> map) {
		this.map = map;
	}

	public int getPixels() {
		return pixels;
	}

	public void setPixels(int pixels) {
		this.pixels = pixels;
	}
	
	
	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
}