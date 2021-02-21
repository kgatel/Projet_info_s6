public class TestOrdinateur {

	public static void main(String[] args) {
		Ordinateur o1 = new Ordinateur();
		/*System.out.println(o1);

		Utilisateur user = new Utilisateur("Kevin","GATEL","kgatel","INSA2021");
		Imprimante imp1 = new Imprimante("Imprimante INSA","FX456","HP","234.234.234.234",100,true,56,67);
		Projecteur p1 = new Projecteur("Projecteur INSA","YU3456","Epson","145.145.145.145",100,true);
		Ordinateur o2 = new Ordinateur("pc kevThibaut", "Zenbook","Asus","255.255.255.255",99,true,user,imp1,p1,false);
		
		System.out.println(o2);
		
		Utilisateur vide = new Utilisateur();
		Professeur prof1 = new Professeur("Habib","Abdulrab","habdulrab","INSA2021");
		Eleve e1 = new Eleve("Thibaut","André-Gallis","tandregallis","INSA2021");
		o2.setUtilisateur(vide);
		System.out.println(o2.getUtilisateur());
		
		int [] page={2,7,9};
		
		//vous n'êtes pas connecté
		o2.Imprimer(page,2,"Portrait","A4",true,true);
		
		//Imprime en couleur sans problème
		o2.setUtilisateur(prof1);
		o2.Imprimer(page,2,"Portrait","A4",true,true);
		
		//Imprime en couleur interdit car élève
		o2.setUtilisateur(e1);
		o2.Imprimer(page,2,"Portrait","A4",true,true);
		o2.Imprimer(page,2,"Portrait","A4",false,false);
		
		o2.Eteindre();
		o2.allumer();
		o2.seConnecter(e1);
		//eleve ne peut pas projeter
		o2.Projeter();
		//déjà connecté
		o2.seConnecter(prof1);
		o2.seDeconnecter();
		o2.seConnecter(prof1);
		o2.Projeter();
				*/
		Ordinateur o3 = new Ordinateur();
		System.out.println(o1.equals(o3));
	}

}
