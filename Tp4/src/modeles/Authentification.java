package modeles;
public class Authentification {
	private String nom;
	private String prenom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Authentification() {
		
	}
	public Authentification(String nom, String prenom) {
		this.nom = "";
		this.prenom = "";
		
	}

}