package entites;

public class Personne {

	public String prenom;
	public String nom;
	public AdressePostale adresse;
	
	public Personne() {
		
	}
	
	public Personne(String prenom, String nm, AdressePostale p) {
		this.prenom = prenom;
		nom = nm;
		adresse = p;
	}

	@Override
	public String toString() {
		return prenom + " " + nom + " " + adresse;
	}
	
	
	
}
