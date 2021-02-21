public class Projecteur extends AppareilElectronique {
	
	//même attributs que AppareilElectronique
	
	//constructeurs
	public Projecteur(){
		super();
	}
	
	public Projecteur(String Nom, String Modele, String Marque, String AdresseIP, int Batterie, boolean Allume){
		super(Nom,Modele,Marque,AdresseIP,Batterie,Allume);
	}
	
	//même accesseurs
	
	//Méthodes
	void projeter(){
		if (getAllume()==true){
			System.out.println("est en train de projeter...");
			//fait l'action de projeter
		}
		else{
			setAllume(true);
			System.out.println("Votre projecteur démarre");
		}
	}
	
	void arreterProjeter(){		//utile lorsqu'on a pas envie de partager son écran pendant une période de temps
		if (getAllume()==true){
			setAllume(false);
			System.out.println("arret projection...");
			//fait l'action de ne plus projeter
		}
		else{
			System.out.println("Votre projecteur est déjà éteint");
		}
	}

	//toString est la même que AppareilElectronique
	
}
