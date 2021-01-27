package essais;

import entites.AdressePostale;
import entites.Personne;
import entites.Pouet;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale a = new AdressePostale(15, "dans les bois", 22000, "Trefouin");
		
		Personne p1 = new Personne();
		Personne p2 = new Personne("Maître", "Lee", a);
		
		
	}

}
