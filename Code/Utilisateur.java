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
	
	//Méthodes
	
	//permet de vérifier si deux utilisateurs sont égaux
	public boolean Identite(Utilisateur u1){
		if ( (getPrenom()==u1.getPrenom())&&(getNom()==u1.getNom())&&(this.login==u1.getLogin())&&(this.mdp==u1.getMdp()) ){
			return true;
		}
		else{
			return false;
		}
	}	
	
	//toString
	public String toString(){
		return super.toString()+"\nlogin : "+login+"\nmdp : "+mdp;
	}
}

