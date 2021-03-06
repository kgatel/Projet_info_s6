import java.util.Scanner;

public class Routeur extends AppareilElectronique {
	
	//Attributs
	private String mdp;
	private boolean internet;
	
	//constructeurs
	public Routeur(){
		super();
		mdp="";
		internet=false;
	}
	
	public Routeur(String Nom, String Modele, String Marque, String AdresseIP, int Batterie, boolean Allume, String Mdp,boolean Internet){
		super(Nom,Modele,Marque,AdresseIP,Batterie,Allume);
		mdp=Mdp;
		internet=Internet;
	}
	
	//Accesseurs
	public String getMdp(){
		return this.mdp;
	}
	
	public boolean getInternet(){
		return this.internet;
	}
	
	//Mutateurs
	public void setMdp(String Mdp){
		this.mdp=Mdp;
	}
	
	public void setInternet(boolean Internet){
		this.internet=Internet;
	}
	
	//Méthodes
	void diffuserWifi(){
		Scanner scan = new Scanner(System.in);
		String Mdp;
		if (getAllume()==false){
			System.out.println("Veuillez allumer votre routeur");
		}
		else{
			System.out.println("Veuillez rentrer le mot de passe : ");
			Mdp = scan.nextLine();
			if (Mdp.equals(this.mdp)){		//(Mdp==this.mdp) ne marche pas
				System.out.println("Diffusion wifi...");
				//fait l'action de diffuser la wifi
				this.setInternet(true);
			}
			else{
				System.out.println("Mdp incorrect impossible de diffuser wifi.");
			}
		}
	}
	
	public String toString(){
		return "Routeur appareil\n"+super.toString()+"\nMdp : "+this.mdp+"\nInternet : "+this.internet;  //le mdp est diffusé en public ici (peut-etre changer plus tard)
	}
	
}
