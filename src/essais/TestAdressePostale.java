package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale a1 = new AdressePostale(5, "rue du March�", 44100, "Nantes");		
		AdressePostale a2 = new AdressePostale(15, "place de la mairie", 34000, "Montpellier");
		
		System.out.println(a1);

	}

}
