public class Imprimante extends AppareilElectronique{
	
	//attributs
	float nivNoir,nivCouleur; //niveau d'encre en pourcentage
	
	//constructeurs
	public Imprimante(){
		super();
		nivNoir=0;
		nivCouleur=0;
	}
	
	public Imprimante(String Nom, String Modele, String Marque, String AdresseIP, int Batterie, boolean Allume, float NivNoir, float NivCouleur){
		super(Nom,Modele,Marque,AdresseIP,Batterie,Allume);
		this.nivNoir=NivNoir;
		this.nivCouleur=NivCouleur;
	}
	
	//accesseur
	public float getNivNoir(){
		return this.nivNoir;
	}
	
	public float getNivCouleur(){
		return this.nivCouleur;
	}
	
	public void setNivNoir(float NivNoir){
		if ((NivNoir>=0)&&(NivNoir<=100)){	//vérifie qu'il s'agit bien d'un pourcentage
			this.nivNoir=NivNoir;
		}
		else{
			System.out.println("Niveau d'encre inconnu");
		}
	}
	
	public void setNivCouleur(float NivCouleur){
		if ((NivCouleur>=0)&&(NivCouleur<=100)){
			this.nivCouleur=NivCouleur;
		}
		else{
			System.out.println("Niveau d'encre inconnu");
		}
	}
	
	//Méthodes
	private void imprimer(int [] pages, int exemplaires, String orientation, String papier, boolean couleur, boolean restoVerso){   //pages tableau des pages à imprimer
		if (   ((orientation!="Paysage")&&(orientation!="Portrait")) || ((papier!="A4")&&(papier!="A5"))  ){    //verifie que l'utilisateur entre les bons paramètres
			System.out.println("Erreur orientation ou type papier");
		}
		else{
						if ((nivNoir<2)||(nivCouleur<2)){	//on suppose qu'une impression prend au maximum 2% du niveau d'encre
				System.out.println("Niveau d'encre trop faible, impossible d'imprimer...");
			}
			else{ //toutes les conditions sont remplies pour imprimer
				
				System.out.println("est en train d'imprimer...");
				//fait l'action d'imprimer
			
				this.nivNoir-=1;			//enleve 1% du niveau d'encre noire  (à fixer)
				this.nivCouleur-=1;	      	//enleve 1% du niveau d'encre couleure (à fixer)
				
				if (nivNoir<10){
					if (nivNoir>2){
						System.out.println("Niveau d'encre noire bientôt épuisé");
					}
					else{
						System.out.println("Veuillez changer votre encre noire...");
					}
				}
				
				if (nivCouleur<10){
					if (nivCouleur>2){
						System.out.println("Niveau d'encre couleure bientôt épuisé");
					}
					else{
						System.out.println("Veuillez changer votre encre couleure...");
					}
				}
			}
		}
	}
	
	//deux procédures changerEncre car il faudrait savoir quelle cartouche l'utilisateur change
	
	private void changerEncreNoire(){
		String rep="";
		//fait l'action de mettre en évidence les cartouches pour la retirer facilement
		while ((rep!="yes")&&(rep!="no")){
			System.out.println("Cartouche changée ? (yes/no) : ");
			//demander à l'utilisateur de rentrer sa réponse dans la variable rep;
		}
		if (rep=="no"){
			System.out.println("Abandon...");
		}
		else{
			System.out.println("Cartouche changée !");
			this.nivNoir=100;
		}
	}
	
	private void changerEncreCouleure(){
		String rep="";
		//fait l'action de mettre en évidence les cartouches pour la retirer facilement
		while ((rep!="yes")&&(rep!="no")){
			System.out.println("Cartouche changée ? (yes/no) : ");
			//demander à l'utilisateur de rentrer sa réponse dans la variable rep;
		}
		if (rep=="no"){
			System.out.println("Abandon...");
		}
		else{
			System.out.println("Cartouche changée !");
			this.nivCouleur=100;
		}
	}
			
}
		
