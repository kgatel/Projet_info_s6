public class SalledOrdinateur{
	
	//attributs
	private String nom;
	private int nbOrdi;
	private int nbImp;
	private int nbProj;
	private int nbUser;
	final int nbOrdiMax = 30;	//constante
	final int nbImpMax = 5;	//constante
	final int nbProjMax = 3;	//constante
	final int nbUserMax = 10;	//constante
	
	private Ordinateur [] TabOrdi;	//tableau d'ordinateur
	private Imprimante [] TabImp;	//tableau d'imprimante
	private Projecteur [] TabProj;  //tableau de projecteur
	private Utilisateur [] TabUser; //tableau d'utilisateur
	private Routeur Rout;
	
	
	
	//constructeurs
	public SalledOrdinateur(){
		int i;
		nom="";
		nbOrdi=0;
		nbImp=0;
		nbProj=0;
		nbUser=0;
		TabOrdi = new Ordinateur[nbOrdiMax];	//nbOrdiMax max
		TabImp=new Imprimante[nbImpMax];	//nbImpMax max
		TabProj=new Projecteur[nbProjMax];	//nbProjMax projecteurs
		TabUser=new Utilisateur[nbUserMax];	//nbUserMax utilisateurs
		for (i=0; i<nbOrdiMax; i++){
			TabOrdi[i]=new Ordinateur();
		}
		for (i=0; i<nbImpMax; i++){
			TabImp[i]=new Imprimante();
		}
		for (i=0; i<nbProjMax; i++){
			TabProj[i]=new Projecteur();
		}
		for (i=0; i<nbUserMax; i++){
			TabUser[i]=new Utilisateur();
		}
		Rout = new Routeur();
	}

	public SalledOrdinateur(String nom, Ordinateur [] TabOrdi0, Imprimante [] TabImp0, Projecteur [] TabProj0, Utilisateur [] TabUser0, Routeur rout){
		int i=0;
		this.nom=nom;
		
		TabOrdi = new Ordinateur[nbOrdiMax];	//nbOrdiMax max
		TabImp=new Imprimante[nbImpMax];	//nbImpMax max
		TabProj=new Projecteur[nbProjMax];	//nbProjMax projecteurs
		TabUser= new Utilisateur[nbUserMax];	//nbUserMax utilisateurs
		
		if (TabOrdi0.length<nbOrdiMax){
			this.nbOrdi=TabOrdi0.length;
		}
		else{
			this.nbOrdi=nbOrdiMax;
		}
		
		while (i<nbOrdiMax){	//initialise tous les ordis déclarés, puis le reste des ordis sont vides
			if (i<nbOrdi){
				this.TabOrdi[i]=TabOrdi0[i];
			}
			else{
				this.TabOrdi[i]=new Ordinateur();
			}
			i++;
		}
		i=0;	
		
		if (TabImp0.length<nbImpMax){	//meme chose pour le tableau d'imprimante
			this.nbImp=TabImp0.length;
		}
		else{
			this.nbImp=nbImpMax;
		}
		while (i<nbImpMax){
			if (i<nbImp){
				this.TabImp[i]=TabImp0[i];
			}
			else{
				this.TabImp[i]=new Imprimante();
			}
			i++;
		}
		i=0;
		
		if (TabProj0.length<nbProjMax){		//meme chose pour le tableau de projecteur
			this.nbProj=TabProj0.length;
		}
		else{
			this.nbProj=nbProjMax;
		}
		while (i<nbProjMax){
			if (i<nbProj){
				this.TabProj[i]=TabProj0[i];
			}
			else{
				this.TabProj[i]=new Projecteur();
			}
			i++;
		}
		i=0;
		if (TabUser0.length<nbUserMax){		//meme chose pour le tableau de projecteur
			this.nbUser=TabUser0.length;
		}
		else{
			this.nbUser=nbUserMax;
		}
		while (i<nbUserMax){
			if (i<nbUser){
				this.TabUser[i]=TabUser0[i];
			}
			else{
				this.TabUser[i]=new Utilisateur();
			}
			i++;
		}
		this.Rout=rout;
	}
	
	//accesseurs
	public String getNom(){
		return this.nom;
	}
	
	public int getNbOrdi(){
		return nbOrdi;
	}
	
	public int getNbImp(){
		return nbImp;
	}
	
	public int getNbProj(){
		return nbProj;
	}	
	
	public int getNbUser(){
		return this.nbUser;
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
	
	public Utilisateur getTabUser(int indice){
		Utilisateur user = new Utilisateur();
		if ((indice>=0)&&(indice<nbUserMax)){
			return this.TabUser[indice];
		}
		else{
			System.out.println("Erreur indice");
			return user;
		}
	}
	
	public Routeur getRouteur(){
		return this.Rout;
	}
	
	//Mutateurs
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public void setNbOrdi(int nbOrdi){
		this.nbOrdi=nbOrdi;
	}
	
	public void setNbImp(int nbImp){
		this.nbImp=nbImp;
	}
	
	public void setNbProj(int nbProj){
		this.nbProj=nbProj;
	}
	
	public void setNbUser(int nbUser){
		this.nbUser=nbUser;
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
	
	public void setTabUser(Utilisateur user, int indice){
		if ((indice>=0)&&(indice<nbUserMax)){
			this.TabUser[indice]=user;
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
	
	public void retirerOrdi(int indice){
		int i;
		if (!((indice>=0)&&(indice<nbOrdi))){
			System.out.println("Impossible de retirer cet ordinateur indice incorrect");
		}
		else{
			System.out.println("Ordinateur retiré");
			for (i=indice;i<nbOrdi-1;i++){
				TabOrdi[i]=TabOrdi[i+1];
			}
			nbOrdi--;
			//TabOrdi[nbOrdi]=new Ordinateur();		//pas besoin de faire cet instruction car nbOrdi diminue de 1
		}
	}
	
	public void ajouterImp(Imprimante Imp){
		if (nbImp<nbImpMax){
			TabImp[nbImp]=Imp;
			nbImp++;
			System.out.println("Ajout de l'Imprimante");
		}
		else{
			System.out.println("Nombre d'Imprimante max atteint, impossible d'en rajouter");
		}
	}
		
	public void retirerImp(int indice){
		int i;
		if (!((indice>=0)&&(indice<nbImp))){
			System.out.println("Impossible de retirer cet Imprimante indice incorrect");
		}
		else{
			System.out.println("Imprimante retirée");
			for (i=indice;i<nbImp-1;i++){
				TabImp[i]=TabImp[i+1];
			}
			nbImp--;
			//TabImp[nbImp]=new Imprimante();		//pas besoin de faire cet instruction car nbImp diminue de 1
		}
	}
	
	public void ajouterProj(Projecteur Proj){
		if (nbProj<nbProjMax){
			TabProj[nbProj]=Proj;
			nbProj++;
			System.out.println("Ajout du Projecteur");
		}
		else{
			System.out.println("Nombre de Projecteur max atteint, impossible d'en rajouter");
		}
	}
	
	
	public void retirerProj(int indice){
		int i;
		if (!((indice>=0)&&(indice<nbProj))){
			System.out.println("Impossible de retirer ce projecteur indice incorrect");
		}
		else{
			System.out.println("Projecteur retiré");
			for (i=indice;i<nbProj-1;i++){
				TabProj[i]=TabProj[i+1];
			}
			nbProj--;
			//TabProj[nbProj]=new Projecteur();		//pas besoin de faire cet instruction car nbProj diminue de 1
		}
	}
	
	public void ajouterUtilisateur(Utilisateur user){
		if (nbUser<nbUserMax){
			TabUser[nbUser]=user;
			nbUser++;
			System.out.println("Ajout de l'utilisateur");
		}
		else{
			System.out.println("Nombre d'utilisateur max atteint, impossible d'en rajouter");
		}
	}
	
	
	public void retirerUtilisateur(int indice){
		int i;
		if (!((indice>=0)&&(indice<nbUser))){
			System.out.println("Impossible de retirer cet utilisateur indice incorrect");
		}
		else{
			System.out.println("utilisateur retiré");
			for (i=indice;i<nbUser-1;i++){
				TabUser[i]=TabUser[i+1];
			}
			nbUser--;
		}
	}
	
	public String toString(){
		String rep="";
		int i;
		rep+="\n*************** "+nom+" *****************\nNombre d'Ordinateur : "+nbOrdi+"\nNombre d'imprimante : "+nbImp+"\nNombre de projecteur : "+nbProj+"\n";
		for (i=0; i<nbUser;i++){
			rep+="---------------------\n";
			rep+="Utilisateur "+(i+1)+"\n"+TabUser[i];
		}
		for (i=0; i<nbOrdi;i++){
			rep+="---------------------\n";
			rep+="Ordinateur "+(i+1)+"\n"+TabOrdi[i];
		}
		for (i=0; i<nbImp;i++){
			rep+="\n---------------------";
			rep+="\nImprimante "+(i+1)+"\n"+TabImp[i];
		}
		for (i=0; i<nbProj;i++){
			rep+="\n---------------------";
			rep+="\nProjecteur "+(i+1)+"\n"+TabProj[i];
		}		
		rep+="\n---------------------\n"+Rout;
		rep+="\n********************************";
		return rep;
	}
	
}
