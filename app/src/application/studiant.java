package application;

public class studiant {
  private String cne,nom,note,matiere;
  public studiant(String cne,String nom,String note ,String matiere) {
	  this.cne=cne;
	  this.matiere=matiere;
	  this.nom=nom;
	  this.note=note;
	  
  }
  public String getCne() {
	return cne;
}
  public String getMatiere() {
	return matiere;
}
  public String getNom() {
	return nom;
}
  public String getNote() {
	return note;
}
  public void setCne(String cne) {
	this.cne = cne;
}
  public void setMatiere(String matiere) {
	this.matiere = matiere;
}
  public void setNom(String nom) {
	this.nom = nom;
}
  public void setNote(String note) {
	this.note = note;
}
}
