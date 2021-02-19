public class Utilisateur extends Personne {
	
	//attribut
	private String login,mdp;
	
	//constructeurs
	public Utilisateur(){
		super();
		login="";
		mdp="";
	}
	
	public Utilisateur(String Prenom, String Nom, String Login, String Mdp){
		super(Prenom,Nom);
		login=Login;
		mdp=Mdp;
	}		
	
	//accesseur
	public String getLogin(){
		return this.login;
	}
	
	public String getMdp(){
		return this.mdp;
	}
	
	public void setLogin(String nouveauLogin){
		this.login=nouveauLogin;
	}
	
	public void setMdp(String nouveauMdp){
		this.mdp=nouveauMdp;
	}
	
	//toString
	public String toString(){
		return getPrenom()+" "+getNom()+"\nlogin : "+login+"\nmdp : "+mdp;
	}
		
}

