package Nivell_1_5;

import java.io.Serializable;

public class Producte implements Serializable{

	private String nom;
	private float preu;
	
	public Producte(String nom, float preu) {
		
		this.nom=nom;
		this.preu=preu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	public String toString() {
		return "Producte [nom=" + nom + ", preu=" + preu + "]";
	}
}

