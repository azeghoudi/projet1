package projetZelda.modele;

import javafx.beans.property.IntegerProperty;

public class Link {
	
	private IntegerProperty y;
	private IntegerProperty x;
	
	public Link() {
		
	}
	
	public IntegerProperty getXPro() {
		return this.x;
	}
	
	public int getX() {
		return this.x.get();
	}
	
	public void setXPro(int newX) {
		this.x.set(newX); 
	}
		
	public IntegerProperty getYPro() {
		return this.y;
	}
	
	public int getY() {
		return this.y.get();
	}
	
	public void setYPro(int newY) {
		this.y.set(newY); 
	}
	
}