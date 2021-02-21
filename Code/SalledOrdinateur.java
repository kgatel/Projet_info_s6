public class SalledOrdinateur{
	
	//attributs
	private String nom;
	private int nbOrdi;
	private int nbImp;
	private int nbProj;
	final int nbOrdiMax = 30;	//constante
	final int nbImpMax = 5;	//constante
	final int nbProjMax = 3;	//constante
	
	private Ordinateur [] TabOrdi;	//tableau d'ordinateur
	private Imprimante [] TabImp;	//tableau d'imprimante
	private Projecteur [] TabProj;  //tableau de projecteur
	private Routeur Rout;
	
	
	//constructeurs
	public SalledOrdinateur(){
		int i;
		nom="";
		nbOrdi=0;
		nbImp=0;
		nbProj=0;
		TabOrdi = new Ordinateur[nbOrdiMax];	//nbOrdiMax max
		TabImp=new Imprimante[nbImpMax];	//nbImpMax max
		TabProj=new Projecteur[nbProjMax];	//nbProjMax projecteurs
		for (i=0; i<nbOrdiMax; i++){
			TabOrdi[i]=new Ordinateur();
		}
		for (i=0; i<nbImpMax; i++){
			TabImp[i]=new Imprimante();
		}
		for (i=0; i<nbProjMax; i++){
			TabProj[i]=new Projecteur();
		}
		Rout = new Routeur();
	}

	public SalledOrdinateur(String nom, Ordinateur [] TabOrdi, Imprimante [] TabImp, Projecteur [] TabProj, Routeur rout){
		int i=0;
		this.nom=nom;
		
		TabOrdi = new Ordinateur[nbOrdiMax];	//nbOrdiMax max
		TabImp=new Imprimante[nbImpMax];	//nbImpMax max
		TabProj=new Projecteur[nbProjMax];	//nbProjMax projecteurs
		
		if (TabOrdi.length<nbOrdiMax){
			this.nbOrdi=TabOrdi.length;
		}
		else{
			this.nbOrdi=nbOrdiMax;
		}
		while (i<nbOrdiMax){	//initialise tous les ordis déclarés, puis le reste des ordis sont vides
			if (i<nbOrdi){
				this.TabOrdi[i]=TabOrdi[i];
			}
			else{
				this.TabOrdi[i]=new Ordinateur();
			}
			i++;
		}
		i=0;	
			
		if (TabImp.length<nbImpMax){	//meme chose pour le tableau d'imprimante
			this.nbImp=TabImp.length;
		}
		else{
			this.nbImp=nbImpMax;
		}
		while (i<nbImpMax){
			if (i<nbImp){
				this.TabImp[i]=TabImp[i];
			}
			else{
				this.TabImp[i]=new Imprimante();
			}
			i++;
		}
		i=0;
		
		if (TabProj.length<nbProjMax){		//meme chose pour le tableau de projecteur
			this.nbProj=TabProj.length;
		}
		else{
			this.nbProj=nbProjMax;
		}
		while (i<nbProjMax){
			if (i<nbProj){
				this.TabProj[i]=TabProj[i];
			}
			else{
				this.TabProj[i]=new Projecteur();
			}
			i++;
		}
		this.Rout=rout;
	}
	
	//accesseurs
	public String getNom(){
		return this.nom;
	}
	
	public Ordinateur getTabOrdi(int indice){
		Ordinateur ordi = new Ordinateur();
		if ((indice>=0)&&(indice<nbOrdiMax)){
			return this.TabOrdi[indice];
		}
		else{
			System.out.println("Erreur indice");
			return ordi;
		}
	}
	
	public Imprimante getTabImp(int indice){
		Imprimante imprimante = new Imprimante();
		if ((indice>=0)&&(indice<nbImpMax)){
			return this.TabImp[indice];
		}
		else{
			System.out.println("Erreur indice");
			return imprimante;
		}
	}
	
	public Projecteur getTabProj(int indice){
		Projecteur projecteur = new Projecteur();
		if ((indice>=0)&&(indice<nbProjMax)){
			return this.TabProj[indice];
		}
		else{
			System.out.println("Erreur indice");
			return projecteur;
		}
	}
	
	public Routeur getRouteur(){
		return this.Rout;
	}
	
	public void setTabOrdi(Ordinateur ordi, int indice){
		if ((indice>=0)&&(indice<nbOrdiMax)){
			this.TabOrdi[indice]=ordi;
		}
		else{
			System.out.println("Erreur indice");
		}
	}
	
	public void setTabImp(Imprimante imp, int indice){
		if ((indice>=0)&&(indice<nbImpMax)){
			this.TabImp[indice]=imp;
		}
		else{
			System.out.println("Erreur indice");
		}
	}
	
	public void setTabProj(Projecteur proj, int indice){
		if ((indice>=0)&&(indice<nbProjMax)){
			this.TabProj[indice]=proj;
		}
		else{
			System.out.println("Erreur indice");
		}
	}
	
	public void setRouteur(Routeur rout){
		this.Rout=rout;
	}
	
	//Méthodes
	public void ajouterOrdi(Ordinateur ordi){
		if (nbOrdi<nbOrdiMax){
			TabOrdi[nbOrdi]=ordi;
			nbOrdi++;
			System.out.println("Ajout de l'ordinateur");
		}
		else{
			System.out.println("Nombre d'ordinateur max atteint, impossible d'en rajouter");
		}
	}
	
	
	public void retirerOrdi(Ordinateur ordi){};
	
	
}
