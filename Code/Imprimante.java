import java.util.Scanner;

public class Imprimante extends AppareilElectronique{
	
	//attributs
	private float nivNoir,nivCouleur; //niveau d'encre en pourcentage
	
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
	
	//Mutateurs
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
	public void imprimer(int [] pages, int exemplaires, String orientation, String papier, boolean couleur, boolean rectoVerso){   //pages tableau des pages à imprimer
		
		int i=0,j=0;
		if (!getAllume()){ //si l'imprimante est éteinte
			System.out.println("Imprimante éteinte...");
		}
		else{
			if (   ((orientation!="Paysage")&&(orientation!="Portrait")) || ((papier!="A4")&&(papier!="A5"))  ){    //verifie que l'utilisateur entre les bons paramètres
				System.out.println("Erreur orientation ou type papier");
			}
			else{
				
				while (j<exemplaires){ //ne finit que quand le nombre d'exemplaire a été imprimé
					while (i<pages.length){
						if ((nivNoir<=2)||(nivCouleur<=2)){	//on suppose qu'une impression prend au maximum 2% du niveau d'encre
							System.out.println("Niveau d'encre trop faible, impossible d'imprimer...");
							i=pages.length; //arreter la boucle
							j=exemplaires; //tout arreter
						}
						else{ //toutes les conditions sont remplies pour imprimer
							
							if (rectoVerso){
								System.out.println("est en train d'imprimer la page (mode recto/verso) "+pages[i]+"..."); //affiche ce message chaque page
								//fait l'action d'imprimer en recto/verso;
							}
							else{
								System.out.println("est en train d'imprimer la page (mode sans recto/verso) "+pages[i]+"..."); //affiche ce message chaque page
								//fait l'action d'imprimer sans recto/verso;
							}
							
							if (couleur==true){
								this.nivNoir-=1;			//enleve 1% du niveau d'encre noire par page (à fixer)
								this.nivCouleur-=1;	      	//enleve 1% du niveau d'encre couleure par page (à fixer)
							}
							else{
								this.nivNoir-=2;		//enleve 2% car l'utilisateur a choisi sans couleur
							}
							
							if (nivNoir<10){
								if (nivNoir>2){
									System.out.println("Niveau d'encre noire bientôt épuisé");
								}
								else{
									System.out.println("Veuillez changer votre encre noire...");
									i=pages.length; //arreter la boucle
									j=exemplaires; //tout arreter
								}
							}
							
							if (nivCouleur<10){
								if (nivCouleur>2){
									System.out.println("Niveau d'encre couleure bientôt épuisé");
								}
								else{
									System.out.println("Veuillez changer votre encre couleure...");
									i=pages.length; //arreter la boucle
									j=exemplaires; //tout arreter
								}
							}
						}
						
						i++; //page suivante
					}
					i=0;
					j++; //exemplaire suivant			
				}
			}
		}
	}
	
	//deux procédures changerEncre car il faudrait savoir quelle cartouche l'utilisateur change
	
	public void changerEncreNoire(){
		Scanner scan = new Scanner(System.in);
		String rep="";
		if (!getAllume()){ //si l'imprimante est éteinte
			System.out.println("Imprimante éteinte...");
		}
		else{
			//fait l'action de mettre en évidence les cartouches pour la retirer facilement
			while (  !( (rep.equals("yes"))||(rep.equals("no")) )  ){	//attend une réponse yes ou non de l'utilisateur
				System.out.println("Cartouche noire changée ? (yes/no) : ");
				rep=scan.nextLine();  //demande la réponse à l'utilisateur
			}
			if (rep.equals("no")){
				System.out.println("Abandon...");
			}
			else{
				System.out.println("Cartouche noire changée !");
				this.nivNoir=100;
			}
		}
	}
	
	public void changerEncreCouleure(){
		Scanner scan = new Scanner(System.in);
		String rep="";
		if (!getAllume()){ //si l'imprimante est éteinte
			System.out.println("Imprimante éteinte...");
		}
		else{
			//fait l'action de mettre en évidence les cartouches pour la retirer facilement
			while (  !( (rep.equals("yes"))||(rep.equals("no")) )  ){
				System.out.println("Cartouche couleure changée ? (yes/no) : ");
				rep=scan.nextLine();	//demande la réponse à l'utilisateur
			}
			if (rep.equals("no")){
				System.out.println("Abandon...");
			}
			else{
				System.out.println("Cartouche couleure changée !");
				this.nivCouleur=100;
			}
		}
	}
			
	public String toString(){
		return super.toString()+"\nNiveau d'encre : Noir : "+nivNoir+"% Couleur: "+nivCouleur+"%";
	}
}
		
