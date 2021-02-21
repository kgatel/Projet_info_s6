public class TestImprimante {
	
	public static void main(String[] args) {
		Imprimante imp1 = new Imprimante();
		System.out.println(imp1);
		imp1.setNom("Imprimante Kev");	//tester un seul du super suffit car on sait que la suite marche dans TestAppareilElectronique
		imp1.setNivNoir(75);
		imp1.setNivCouleur(85);
		System.out.println(imp1);
		
		System.out.println();
		
		Imprimante imp2 = new Imprimante("Imprimante rapide thibaut","LX769","HP","280.589.589.589",100,true,99,98);
		System.out.println("Niveau Encre Noire : "+imp2.getNivNoir());
		System.out.println("Niveau Encre Couleure : "+imp2.getNivCouleur());
		System.out.println(imp2);
		
		int [] pages= {1,2};
		
		System.out.println();
		
		//imprimante éteinte
		imp1.imprimer(pages,1,"Paysage","A4",true,true);
		
		//doit imprimer
		imp1.allumer();
		imp1.imprimer(pages,1,"Paysage","A4",true,true);
			
		//doit afficher deux messages d'erreur
		imp1.imprimer(pages,1,"Paysage","A6",true,true);
		imp1.imprimer(pages,1,"Orientation","A4",true,true);
		
		//doit imprimer et afficher niveau encre noire faible
		imp1.setNivNoir(9);
		imp1.imprimer(pages,1,"Paysage","A4",true,true);
		//meme chose avec encre couleur
		imp1.setNivNoir(15);
		imp1.setNivCouleur(7);
		imp1.imprimer(pages,1,"Paysage","A4",true,true);
		
		//encre trop faible
		System.out.println();
		imp1.setNivNoir(2);
		imp1.imprimer(pages,1,"Paysage","A4",true,true);
		
		System.out.println();

		//bientot changer la cartouche noire
		imp1.setNivNoir(3);
		imp1.imprimer(pages,1,"Paysage","A4",true,true);
		
		System.out.println();

		//plusieurs exemplaires
		imp1.setNivCouleur(11);
		imp1.setNivNoir(15);
		System.out.println(imp1.getNivCouleur()+" "+imp1.getNivNoir());

		int [] page={2,7,9};
		imp1.imprimer(page,3,"Paysage","A4",false,true);	//3 exemplaires
		System.out.println(imp1.getNivCouleur()+" "+imp1.getNivNoir());
		
		imp1.changerEncreCouleure();
		imp1.changerEncreNoire();
		System.out.println(imp1);
		
	}
}
