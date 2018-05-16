package projetZelda.modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Link {
	
	// Coordonnées de la position de Link
	private IntegerProperty x;
	private IntegerProperty y;
	private IntegerProperty vitesse;
	
	// TODO : initiliser la première position de Link et la vitesse
	public Link(int newX, int newY, int newVitesse) {
		this.x = new SimpleIntegerProperty(newX);
		this.y = new SimpleIntegerProperty(newY);
		this.vitesse = new SimpleIntegerProperty(newVitesse);
	}
	
	public int getX() {
		return this.x.getValue();
	}

	public void setX(int newX) {
		this.x.setValue(newX);  // erreur
	}
	
	public IntegerProperty xPro() {
		return this.x;
	}
	
	public int getY() {
		return this.y.getValue();
	}
	
	public void setY(int newY) {
		this.y.setValue(newY);  // erreur
	}
	
	public IntegerProperty yPro() {
		return this.y;
	}
	
	public int getVitesse() {
		return this.vitesse.getValue();
	}
	
	public void setVitesse(int v) {
		this.vitesse.setValue(v);  // erreur
	}
	
	public IntegerProperty vitessePro() {
		return this.vitesse;
	}

	
	// Déplacements
	
	public void deplacerDroite() {
		this.setX(this.getX() + this.getVitesse());
	}
	
	public void deplacerGauche() {
		this.setX(this.getX() - this.getVitesse());
	}
	
	public void deplacerHaut() {
		this.setY(this.getY() - this.getVitesse());
	}
	
	public void deplacerBas() {
		this.setY(this.getY() + this.getVitesse());
	}
	
}



