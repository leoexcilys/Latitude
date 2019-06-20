package app;

public abstract class Application {

	static Soldat versus(Soldat soldat1,Soldat soldat2) {
		if (soldat1.arme.nom.equals("épée") && soldat2.arme.nom.equals("archer")) {
			return soldat1;
		}
		else if (soldat1.arme.nom.equals("archer") && soldat2.arme.nom.equals("bouclier")) {
			return soldat1;
		}
		else if (soldat1.arme.nom.equals("bouclier") && soldat2.arme.nom.equals("épée")) {
			return soldat1;
		}
		else if (soldat1.arme.nom.equals(soldat2.arme.nom) ) {
			return null;
		}
		else {
			return soldat2;
		}
	}
	
	public static void main(String[] args) {
		Soldat leo = new Soldat( new Arme("épée") ,"Leo");
		Soldat jerem = new Soldat(new Arme("archer"), "jerem");
		Soldat mehdi = new Soldat(new Arme("bouclier"), "mehdi");
		
		//tableau sold
		System.out.println(leo.nom+" a "+leo.PV+" PV");
		System.out.println(jerem.nom+" a "+jerem.PV+" PV");
		System.out.println(mehdi.nom+" a "+mehdi.PV+" PV");
		System.out.println();
		
		// pourchaque soldat dans tab
		// combattre less autres
		
		
		Soldat[] soldats= {leo,mehdi,jerem, new Soldat(new Arme("épée"), "mat")};
		for(int i=0;i<soldats.length;i=i+1) {
			for(int j=0;j<soldats.length;j=j+1) {
				if (j!=i) {
					System.out.println(soldats[i].nom +" vs " +soldats[j].nom +":");
					Soldat winner = versus(soldats[i], soldats[j]);
					if (winner== null) {
						System.out.println("égalité");
					}
					else {
						System.out.println("winner :"+winner.nom+"\n");
					}
				}
			}
		}
	}    
}