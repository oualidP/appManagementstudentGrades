package application;

public class AffFiliere {
	private String id_filiere,nom_filiere;
	public AffFiliere(String id_f,String nom_f) {
		this.id_filiere=id_f;
		this.nom_filiere=nom_f;
	}
	public String getId_filiere() {
		return id_filiere;
	}
	public void setNom_filiere(String nom_filiere) {
		this.nom_filiere = nom_filiere;
	}
	public void setId_filiere(String id_filiere) {
		this.id_filiere = id_filiere;
	}
	public String getNom_filiere() {
		return nom_filiere;
	}

}
