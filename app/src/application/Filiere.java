package application;

public class Filiere {
	private String id_filiere,nom_filiere,id_responsable;
	public Filiere(String id_filiere,String nom,String id_Res) {
		this.id_filiere=id_filiere;
		this.nom_filiere=nom;
		this.id_responsable=id_Res;
		
	}
	public String getId_filiere() {
		return id_filiere;
	}
	public String getId_responsable() {
		return id_responsable;
	}
	public String getNom_filiere() {
		return nom_filiere;
	}
	public void setId_filiere(String id_filiere) {
		this.id_filiere = id_filiere;
	}
	public void setId_responsable(String id_responsable) {
		this.id_responsable = id_responsable;
	}
	public void setNom_filiere(String nom_filiere) {
		this.nom_filiere = nom_filiere;
	}
	

}
