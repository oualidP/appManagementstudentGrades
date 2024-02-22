package application;

public class etudiant {
	private String nom,CNE,prenom,filiere;
	public etudiant(String nom,String prenom,String CNE,String filiere) {
		this.nom=nom;
		this.prenom=prenom;
		this.CNE=CNE;
		this.filiere=filiere;
		
	}
    public String getCNE() {
		return CNE;
	}
    public String getFiliere() {
		return filiere;
	}
    public String getNom() {
		return nom;
	}
    public String getPrenom() {
		return prenom;
	}
    public void setCNE(String cNE) {
		CNE = cNE;
	}
    public void setFiliere(String filiere) {
		this.filiere = filiere;
	}public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
