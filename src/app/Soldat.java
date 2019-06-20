package app;

public class Soldat {
	// ATTRIBUT (Caractéristiques)
	Arme arme;
	String nom;
	int PV;
	
	// CONSTRUCTEUR
	Soldat(Arme a, String b) {
		arme = a;
		nom= b;
		PV= 100;
	}
	
	// METHODS (comportement du soldat)
	public void afficheToi() {
		System.out.println("Soldat :");
		System.out.println("arme: " + arme);
		System.out.println("nom du soldat :" +nom);
		System.out.println("PV : 100");
		System.out.println();
	}
	
}
