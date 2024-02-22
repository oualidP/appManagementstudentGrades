package application;

public class professeur {
    private String nom,prenom,cin;
    public professeur(String nom,String prenom,String cin) {
    	this.nom=nom;
    	this.prenom=prenom;
    	this.cin=cin;
    	
    }
    public String getCin() {
		return cin;
	}
   
    public String getNom() {
		return nom;
	}
    public String getPrenom() {
		return prenom;
	}
    public void setCin(String cin) {
		this.cin = cin;
	}
    
    public void setNom(String nom) {
		this.nom = nom;
	}
    public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
