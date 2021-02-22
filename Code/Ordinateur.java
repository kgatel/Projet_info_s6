import java.util.Scanner;

public class Ordinateur extends AppareilElectronique {
	
	//attribut
	private Utilisateur user;
	private Imprimante imp;
	private Projecteur proj;
	private boolean internet;
	
	//constructeurs
	public Ordinateur(){
		super();
		user=new Utilisateur();
		imp=new Imprimante();
		proj=new Projecteur();
		internet=false;
	}
		
	public Ordinateur(String Nom, String Modele, String Marque, String AdresseIP, int Batterie, boolean Allume, Utilisateur user1, Imprimante imp1, Projecteur proj1, boolean co){
		super(Nom,Modele,Marque,AdresseIP,Batterie,Allume);
		this.user=user1;
		this.imp=imp1;
		this.proj=proj1;
		this.internet=co;
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
	
	public boolean getinternet(){
		return this.internet;
	}
	
	//Mutateurs
	public void setUtilisateur(Utilisateur user2){
		this.user=user2;
	}
	
	public void setImprimante(Imprimante imp2){
		this.imp=imp2;
	}
	
	public void setProjecteur(Projecteur proj2){
		this.proj=proj2;
	}
	
	public void setinternet(boolean int1){
		this.internet=int1;
	}
	
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
					//fait l'action de se internetr;
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
				//fait l'action de se déinternetr;
				this.user=new Utilisateur();
				System.out.println("Deconnexion...");
			}
		}
	}
	
	
	public void Eteindre(){
		//fait l'action de se déinternetr;
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
	
	public void connexionWifi(Routeur rout){
		if (!getAllume()){
			System.out.println("L'ordinateur est éteint connexion wifi impossible");
		}
		else{
			Utilisateur vide = new Utilisateur();
			if (this.user.Identite(vide)) System.out.println("Veuillez vous connecter avec votre login et votre mdp avant de vous connecter à internet");
			else{
				if (!rout.getInternet()){ //si le routeur n'est pas en train de diffuser internet
					System.out.println("Le Routeur ne diffuse actuellement pas internet");
				}
				else{
					String mdp;
					Scanner scan = new Scanner(System.in);
					System.out.println("Entrez le mot de passe du Routeur");
					mdp=scan.nextLine();
					if (!mdp.equals(rout.getMdp())){
						System.out.println("Mot de passe incorrect");
					}
					else{
						System.out.println("Connexion internet activée");
						this.internet=true;
					}
				}
			}
		}	
	}
	
	public void Moodle(){
		if (!getAllume()){
			System.out.println("L'ordinateur est éteint connexion Moodle impossible");
		}
		else{
			Utilisateur vide = new Utilisateur();
			if (this.user.Identite(vide)) System.out.println("Veuillez vous connecter avec votre login et votre mdp avant de vous connecter à Moodle");
			else{
				if (!internet){
				System.out.println("L'ordinateur n'est pas connecté à internet connexion moodle impossible");
				}
				else{
					if (this.user instanceof Professeur){
						System.out.println("Accès au moodle version Professeur...");
					}
					else{
						if (this.user instanceof Eleve){
							System.out.println("Accès au moodle version élève...");
						}
						else{
							System.out.println("Accès à Moodle impossible vous n'êtes ni un professeur ni un élève");
						}
					}
				}
			}
		}
	}

	public String toString(){
		return super.toString()+"\n\nUtilisateur\n"+user+"\n\nImprimante"+imp+"\n\nProjecteur"+proj+"\n";
	}
	
}
