package application;

public class matiereProf {
	private String cin,matiere,filiere;
	public matiereProf(String cin,String matiere,String filiere) {
		this.cin=cin;
		this.matiere=matiere;
		this.filiere=filiere;
	}
	public String getCin() {
		return cin;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filere) {
		this.filiere = filere;
	}

}
