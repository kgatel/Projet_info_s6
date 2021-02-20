public class TestProjecteur {

	public static void main(String[] args) {
		Projecteur p1 = new Projecteur();
		System.out.println(p1);	
		p1.setBatterie(50);	//un seul test du super suffit car déjà tester dans TestAppareilElectronique
		System.out.println("Batterie : " + p1.getBatterie() +"%");
		System.out.println();
		System.out.println(p1);
			
		System.out.println();
		p1.setAllume(true); //test de toutes les possibilités de projeter
		p1.projeter();
		System.out.println();	
		p1.setAllume(false);
		p1.projeter();	
		System.out.println();//test de toutes les possibilités de arreterprojeter
		p1.arreterProjeter();
		System.out.println();
		p1.arreterProjeter();
		
		System.out.println();		
		
		Projecteur p2 = new Projecteur("projecteur de Robert","EB-X51","Epson","280.589.589.213",67,false);
	 	System.out.println("Nom : " + p2.getNom());
		System.out.println("Modèle : " + p2.getModele());
		System.out.println("Marque : " + p2.getMarque());
		System.out.println("AdresseIP: " + p2.getAdresseIP());
		System.out.println("Batterie : " + p2.getBatterie()+"%");
		System.out.println("Etat : allumé ? " + p2.getAllume());
		
		System.out.println();
		
		System.out.println(p2);
	}
}
