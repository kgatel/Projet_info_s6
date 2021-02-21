import java.util.Scanner;

public class Ordinateur extends AppareilElectronique {
	
	//attribut
	private Utilisateur user;
	private Imprimante imp;
	private Projecteur proj;
	
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
	
	//Méthodes	
	public void seConnecter(Utilisateur User){
		Scanner scan = new Scanner(System.in);
		String Login,Mdp;
		if (!getAllume()){
			System.out.println("Votre ordinateur est éteint.");
		}
		else{
			Utilisateur vide = new Utilisateur();
			if (!this.user.Identite(vide)){		//permet de voir si un utilisateur est connecté
				System.out.println("Vous êtes déjà connecté");
			}
			else{
				System.out.print("Login : ");
				Login = scan.nextLine();
				System.out.print("Mdp : ");
				Mdp = scan.nextLine();
				if ( (Login.equals(User.getLogin()))&&(Mdp.equals(User.getMdp())) ){
					this.user=User;
					//fait l'action de se connecter;
					System.out.println("Vous êtes connecté");
				}
				else{
					System.out.println("Login ou Mdp incorrect");
				}
			}
		}
	}
	
	public void seDeconnecter(){
		if (!getAllume()){
			System.out.println("Vous êtes déjà déconnecté");
		}
		else{
			Utilisateur vide = new Utilisateur();
			if (this.user.Identite(vide)){		//permet de voir si un utilisateur est connecté
				System.out.println("Vous êtes déjà déconnecté");
			}
			else{			
				//fait l'action de se déconnecter;
				this.user=new Utilisateur();
				System.out.println("Deconnexion...");
			}
		}
	}
	
	
	public void Eteindre(){
		//fait l'action de se déconnecter;
		this.user= new Utilisateur();
		//fait l'action d'éteindre l'appareil;
		super.eteindre();
	}
	
			
	
	public void Imprimer(int [] pages, int exemplaires, String orientation, String papier,boolean couleur, boolean rectoVerso){
		Scanner scan = new Scanner(System.in);
		String answer="";
		if (!getAllume()){
			System.out.println("Votre ordinateur est éteint");
		}
		else{
			Utilisateur vide = new Utilisateur();
			if (this.user.Identite(vide)) {		//permet de voir si un utilisateur est connecté
				System.out.println("Vous n'êtes pas connecté");
			}
			else{
				if (!imp.getAllume()){
					System.out.println("Votre imprimante n'est pas allumée");
				}
				else{
					if (!couleur){
						imp.imprimer(pages,exemplaires,orientation,papier,false,rectoVerso);
					}
					else{
						if (this.user instanceof Professeur){
							imp.imprimer(pages,exemplaires,orientation,papier,true,rectoVerso);
						}
						else{
							System.out.println("Seul les professeurs ont le droit d'imprimer en couleur !");
							while (  !( (answer.equals("oui"))||(answer.equals("non")) )  ){
								System.out.println("Voulez-vous imprimer en noir et blanc ? (oui/non)");
								answer = scan.nextLine();
							}
							if (answer.equals("oui")){
								imp.imprimer(pages,exemplaires,orientation,papier,false,rectoVerso);
							}
							else{
								System.out.println("Abandon...");
							}
						}				
					}
				}
			}
		}
	}
	
	public void Projeter(){
		if (!getAllume()){
			System.out.println("Impossible de projeter votre ordinateur est éteint");
		}
		else{
			Utilisateur vide = new Utilisateur();
			if (this.user.Identite(vide)) {		//permet de voir si un utilisateur est connecté
				System.out.println("Impossible de projeter vous n'êtes pas connecté");
			}
			else{
				if (!proj.getAllume()){
					System.out.println("Votre projecteur est éteint");
				}
				else{
					if (this.user instanceof Professeur){
						proj.projeter();
					}
					else{
						System.out.println("Seuls les professeurs ont le droit de projeter");
					}
				}
			}
		}
	}
	
	public String toString(){
		return "\n"+super.toString()+"\n\nUser :\n"+user+"\n\nImprimante :\n"+imp+"\n\nProjecteur :\n"+proj+"\n\n";
	}
	
}
