package application;

public class matiere {
	private String id_matiere,nom_matiere,id_semestre,id_filiere;
	public matiere(String id_matiere,String nom_matiere,String id_semestre,String id_filiere) {
		this.id_matiere=id_matiere;
		this.nom_matiere=nom_matiere;
		this.id_semestre=id_semestre;
		this.id_filiere=id_filiere;
		
	}
	public void setNom_matiere(String nom_matiere) {
		this.nom_matiere = nom_matiere;
	}
	public void setId_semestre(String id_semestre) {
		this.id_semestre = id_semestre;
	}
	public void setId_matiere(String id_matiere) {
		this.id_matiere = id_matiere;
	}
	public void setId_filiere(String id_filiere) {
		this.id_filiere = id_filiere;
	}
	public String getNom_matiere() {
		return nom_matiere;
	}
	public String getId_semestre() {
		return id_semestre;
	}
	public String getId_matiere() {
		return id_matiere;
	}
	public String getId_filiere() {
		return id_filiere;
	}
	

}
