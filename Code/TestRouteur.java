public class TestRouteur {

	public static void main(String[] args) {
		Routeur r1 = new Routeur();
		System.out.println(r1);	
		r1.setBatterie(50);	//un seul test du super suffit car déjà tester dans TestAppareilElectronique
		System.out.println("Batterie : " + r1.getBatterie() +"%");
		r1.setMdp("mot de passe de qualité");
		System.out.println("Mot de passe : " + r1.getMdp());
		System.out.println();
		System.out.println(r1);
		
		System.out.println();		
		
		Routeur r2 = new Routeur("Routeur de Robert","EB-X51","Epson","280.589.589.213",67,false,"INSA2021");
	 	System.out.println("Nom : " + r2.getNom());
		System.out.println("Modèle : " + r2.getModele());
		System.out.println("Marque : " + r2.getMarque());
		System.out.println("AdresseIP: " + r2.getAdresseIP());
		System.out.println("Batterie : " + r2.getBatterie()+"%");
		System.out.println("Etat : allumé ? " + r2.getAllume());
		System.out.println("Mdp : " + r2.getMdp());
		
		System.out.println();
		
		System.out.println(r2);
		
		//routeur encore éteint
		r2.diffuserWifi();
		
		//routeur allumé
		r2.allumer();
		r2.diffuserWifi();
	}
}
