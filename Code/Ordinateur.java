public class Ordinateur extends AppareilElectronique {
	
	//attribut
	private Utilisateur user;
	private Imprimante imp;
	private projecteur proj;
	
	//constructeurs
	public Ordinateur(){
		super();
		user=new Utilisateur();
		imp=new Imprimante();
		proj=new Projecteur();
		}
		
	public Ordinateur(String Nom, String Modele, String Marque, String AdresseIP, int Batterie, boolean Allume, Utilisateur user1, Imprimante imp1, Projecteur proj1){
		super(Nom,Modele,Marque,AdresseIP,Batterie,Allume);
		this.user=user1;
		this.imp=imp1;
		this.proj=proj1;
		}
		
	//accesseurs
	public Utilisateur getUtilisateur(){
		return this.user;
	}
	
	public Imprimante getImprimante(){
		return this.imp;
	}
	
	public Projecteur getProjecteur(){
		return this.proj;
	}
	
	public void setUtilisateur(Utilisateur user2){
		this.user=user2;
	}
	
	public void setImprimante(Imprimante imp2){
		this.imp=imp2;
	}
	
	public void setProjecteur(Projecteur proj2){
		this.proj=proj2;
	}
	// rajouter des fonctions genre se connecter, se déconnecter à voir + la toString (en utilisant celles de Utilisateur imprimante et projecteur ?) + la classe Test
		//fgvhbjnk
	}
		
}

