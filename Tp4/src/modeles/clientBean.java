package modeles;

public class clientBean {
	    private String nom;
	    private String prenom;
	    private String adresse;
	    private int telephone;
	    private String email;
	    

	    public String getNom() {
			return nom;
		}

		public String getPrenom() {
			return prenom;
		}
		public String getAdresse() {
			return adresse;
		}
		public int getTelephone() {
			return telephone;
		}
		public String getEmail() {
			return email;
		}

		public void setNom(String nom) {
			this.nom=nom;
		}

		public void setPrenom(String prenom) {
			this.prenom=prenom;
		}
		public void setAdresse(String adresse) {
			this.adresse=adresse;
		}
		public void setTelephone(int telephone) {
			this.telephone=telephone;
		}
		public void setEmail(String email) {
			this.email=email;
		}
	

}
