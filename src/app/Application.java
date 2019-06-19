package app;

public abstract class Application {

	static Soldat versus(Soldat soldat1,Soldat soldat2) {
		if (soldat1.arme.equals("épée") && soldat2.arme.equals("archer")) {
			return soldat1;
		}
		else if (soldat1.arme.equals("archer") && soldat2.arme.equals("bouclier")) {
			return soldat1;
		}
		else if (soldat1.arme.equals("bouclier") && soldat2.arme.equals("épée")) {
			return soldat1;
		}
		else if (soldat1.arme.equals(soldat2.arme) ) {
			return null;
		}
		else {
			return soldat2;
		}
	}
	
	public static void main(String[] args) {
//		String bouclier = "bouclier";			
//		String epee ="épée";
//		String arc ="arc";
//		
//		System.out.println(bouclier);
//		System.out.println(epee);
//		System.out.println(arc);
//
//		int nbExcilys =167;
//		String nb = "Nombre d'Exciliens : ";
//		System.out.println(nb + nbExcilys);
		
		Soldat leo = new Soldat("épée", "Leo");
		leo.afficheToi();
		
		Soldat jerem = new Soldat("archer", "jerem");
		jerem.afficheToi();
		
		Soldat mehdi = new Soldat("bouclier", "mehdi");
		mehdi.afficheToi();
		
		//tableau sold
		
		Soldat soldat1=jerem;
		Soldat soldat2=jerem;
		
		// pourchaque soldat dans tab
		// combattre less autres
		
		Soldat winner = versus(soldat1, soldat2);
		if (winner== null) {
			System.out.println("égalité");
		}
		else {
			System.out.println("winner :"+winner.nom);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}