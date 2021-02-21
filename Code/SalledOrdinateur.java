public class SalledOrdinateur{
	
	//attributs
	private String nom;
	private Ordinateur [] TabOrdi;	//tableau d'ordinateur
	private Imprimante [] TabImp;	//tableau d'imprimante
	private Projecteur [] TabProj;  //tableau de projecteur
	
	
	//constructeurs
	public SalledOrdinateur(){
		int i;
		nom="";
		TabOrdi = new Ordinateur[30];	//30 max
		TabImp=new Imprimante[5];	//5 max
		TabProj=new Projecteur[3];	//3 projecteurs
		for (i=0; i<30; i++){
			TabOrdi[i]=new Ordinateur();
		}
		for (i=0; i<5; i++){
			TabImp[i]=new Imprimante();
		}
		for (i=0; i<3; i++){
			TabProj[i]=new Projecteur();
		}
	}

	public SalledOrdinateur(String nom, Ordinateur [] TabOrdi, Imprimante [] TabImp, Projecteur [] TabProj){
		this.nom=nom;
		this.TabOrdi=TabOrdi;
		this.TabImp=TabImp;
		this.TabProj=TabProj;
	}
	
	//accesseurs
	public String getNom(){
		return this.nom;
	}
	
	public Ordinateur getTabOrdi(int indice){
		Ordinateur ordi = new Ordinateur();
		if ((indice>=0)&&(indice<30)){
			return this.TabOrdi[indice];
		}
		else{
			System.out.println("Erreur indice");
			return ordi;
		}
	}
	
	public Imprimante getTabImp(int indice){
		Imprimante imprimante = new Imprimante();
		if ((indice>=0)&&(indice<5)){
			return this.TabImp[indice];
		}
		else{
			System.out.println("Erreur indice");
			return imprimante;
		}
	}
	
	public Projecteur getTabProj(int indice){
		Projecteur projecteur = new Projecteur();
		if ((indice>=0)&&(indice<3)){
			return this.TabProj[indice];
		}
		else{
			System.out.println("Erreur indice");
			return projecteur;
		}
	}
	
	public void setTabOrdi(Ordinateur ordi, int indice){
		if ((indice>=0)&&(indice<30)){
			this.TabOrdi[indice]=ordi;
		}
		else{
			System.out.println("Erreur indice");
		}
	}
	
	public void setTabImp(Imprimante imp, int indice){
		if ((indice>=0)&&(indice<5)){
			this.TabImp[indice]=imp;
		}
		else{
			System.out.println("Erreur indice");
		}
	}
	
	public void setTabProj(Projecteur proj, int indice){
		if ((indice>=0)&&(indice<3)){
			this.TabProj[indice]=proj;
		}
		else{
			System.out.println("Erreur indice");
		}
	}
	
	//Méthodes
	
}
