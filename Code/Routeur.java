import java.util.Scanner;

public class Routeur extends AppareilElectronique {
	
	//Attributs
	private String mdp;
	
	//constructeurs
	public Routeur(){
		super();
		mdp="";
	}
	
	public Routeur(String Nom, String Modele, String Marque, String AdresseIP, int Batterie, boolean Allume, String Mdp){
		super(Nom,Modele,Marque,AdresseIP,Batterie,Allume);
		mdp=Mdp;
	}
	
	//Accesseurs
	public String getMdp(){
		return this.mdp;
	}
	
	public void setMdp(String Mdp){
		this.mdp=Mdp;
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
			if (Mdp.equals(this.mdp)){
				System.out.println("Diffusion wifi...");
				//fait l'action de diffuser la wifi
			}
			else{
				System.out.println("Mdp incorrect impossible de diffuser wifi.");
			}
		}
	}
	
	public String toString(){
		return super.toString()+"\nMdp : "+this.mdp;  //le mdp est diffusé en public ici (peut-etre changer plus tard)
	}
	
}
