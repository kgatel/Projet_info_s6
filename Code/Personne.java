public class Personne {
	
	//attribut
	private String prenom,nom;
	
	public Personne(){
		nom="";
		prenom="";
	}
	
	public Personne(String Prenom2, String Nom2){
		this.nom=Nom2;
		this.prenom=Prenom2;
	}		
		
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
		
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public void setPrenom(String prenom){
		this.prenom=prenom;
	}
	
	//toString
	public String toString(){
		return "Prenom : "+prenom+"\nNom : "+nom;
	}
	
}

