public class TestAppareilElectronique {

	public static void main(String[] args) {
		AppareilElectronique A1 = new AppareilElectronique();
		System.out.println(A1.toString());
        System.out.println("Nom : " + A1.getNom());
        System.out.println("Modèle : " + A1.getModele());
        System.out.println("Marque: " + A1.getMarque());
        System.out.println("adresseIP : " + A1.getAdresseIP());
        System.out.println("Batterie : " + A1.getBatterie());
        System.out.println("Allumé : " + A1.getAllume());
		A1.setNom("Pc kev");
		System.out.println("Nouveau nom : " + A1.getNom());
		A1.setModele("Zenbook");
		System.out.println("Nouveau Modèle : " + A1.getModele());
		A1.setMarque("Asus");
		System.out.println("Nouvelle Marque : " + A1.getMarque());
		A1.setAdresseIP("127.255.255.255");
		System.out.println("Nouvelle AdresseIP : " + A1.getAdresseIP());
		A1.setBatterie(40);
		System.out.println("Nouveau Batterie : " + A1.getBatterie()+"%");
		A1.setAllume(true);
		System.out.println("Nouvelle état : allumé ? " + A1.getAllume());
		
		//saut de ligne
		System.out.println();
		
		System.out.println(A1);
		
		//saut de ligne
		System.out.println();
		
		AppareilElectronique A2 = new AppareilElectronique("Michel", "Acer","Predator","191.255.255.255",70,true);
        System.out.println("Nom : " + A2.getNom());
        System.out.println("Modèle : " + A2.getModele());
        System.out.println("Marque : " + A2.getMarque());
        System.out.println("AdresseIP: " + A2.getAdresseIP());
        System.out.println("Batterie : " + A2.getBatterie()+"%");
        System.out.println("Etat : allumé ? " + A2.getAllume());
        
        //saut de ligne
		System.out.println();
		
		System.out.println(A2);
		
		 //saut de ligne
		System.out.println();
		
		//doit afficher deux messages d'erreur
		A1.setBatterie(120);
		A1.setBatterie(-2);
		A1.eteindre();
		//doit afficher false
		System.out.println(A1.getAllume());
		A1.allumer();
		//doit afficher true
		System.out.println(A1.getAllume());
		
		
		
		
	}
	
}
