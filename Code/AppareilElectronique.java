public class AppareilElectronique {
	
	//attribut
	private String nom,modele,marque,adresseIP;
	private int batterie;
	private boolean allume;  //true si l’appareil est allumé, false s’il est eteint
	
	//constructeurs
	public AppareilElectronique(){
		nom="";
		modele="";
		marque="";
		adresseIP="";
		batterie=0;
		allume=false;
	}
	
	public AppareilElectronique(String Nom, String Modele, String Marque, String AdresseIP, int Batterie, boolean Allume){
		this.nom=Nom;
		this.modele=Modele;
		this.marque=Marque;
		this.adresseIP=AdresseIP;
		this.batterie=Batterie;
		this.allume=Allume;
	}		
	
	//accesseurs
	public String getNom(){
		return nom;
	}
	
	public String getModele(){
		return modele;
	}
	
	public String getMarque(){
		return marque;
	}
	
	public String getAdresseIP(){
		return adresseIP;
	}
	
	public int getBatterie(){
		return batterie;
	}
	
	public boolean getAllume(){
		return allume;
	}
	
	public void setNom(String Nom){
		this.nom=Nom;
	}
	
	public void setModele(String Modele){
		this.modele=Modele;
	}
	
	public void setMarque(String Marque){
		this.marque=Marque;
	}
	
	public void setAdresseIP(String AdresseIP){
		this.adresseIP=AdresseIP;
	}
	
	public void setBatterie(int Batterie){
		if ((Batterie>=0)&&(Batterie<=100)){
			this.batterie=Batterie;
		}
		else{
			System.out.println("Niveau de batterie inexistant");
		}
	}
	
	public void setAllume(boolean Allume){
		this.allume=Allume;
	}	
	
	//Méthodes
	protected void allumer(){							//protected pour l'étendre aux classes supérieurs
		System.out.println("L'appareil s'allume...");
		//fait l'action d'allumer l'appareil;
		allume=true;
	}
	
	protected void eteindre(){
		System.out.println("L'appareil s'éteint...");
		//fait l'action d'éteindre l'appareil;
		allume=false;
	}
	
	//toString
	public String toString(){
		return "\nNom : "+nom+"\nMarque : "+marque+"\nModele : "+modele+"\nAdresse IP : "+adresseIP+"\nBatterie : "+batterie+"%\nAllumé : "+allume;  // '\n' saute une ligne
	}		
	
}

