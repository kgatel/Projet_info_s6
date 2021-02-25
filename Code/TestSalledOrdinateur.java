public class TestSalledOrdinateur {
	
	public static void main(String[] args) {
		SalledOrdinateur s1 = new SalledOrdinateur();
		System.out.println(s1);
		//System.out.println(s1.getTabOrdi(27));
		//System.out.println(s1.getTabImp(2));
		//System.out.println(s1.getTabProj(1));
		
		Eleve user1 = new Eleve("Kevin","GATEL","kgatel","INSA2021");
		Eleve user2 = new Eleve("Thibaut","ANDRE-GALLIS","tandregallis","INSA2021");
		Professeur user3 = new Professeur("Habib","ABDULRAB","habdulrab","INSA2021");
		Imprimante imp1 = new Imprimante("Imprimante INSA","FX456","HP","234.234.234.234",100,true,56,67);
		Projecteur p1 = new Projecteur("Projecteur INSA","YU3456","Epson","145.145.145.145",100,true);
		Ordinateur o1 = new Ordinateur("pc kev", "Zenbook","Asus","255.255.255.255",99,true,user1,imp1,p1,false);
		Ordinateur o2 = new Ordinateur("pc thibaut", "Zenbook","Asus","255.255.255.255",99,true,user2,imp1,p1,false);
		Ordinateur o3 = new Ordinateur("pc prof", "Zenbook","Asus","255.255.255.255",99,true,user3,imp1,p1,false);	
		
		//erreur indice
		s1.setTabOrdi(o1,31);
		s1.setTabImp(imp1,5);
		s1.setTabProj(p1,-1);
		
		//set
		s1.setTabOrdi(o1,15);
		s1.setTabImp(imp1,4);
		s1.setTabProj(p1,0);
		System.out.println(s1.getTabOrdi(15));
		System.out.println(s1.getTabImp(4));
		System.out.println(s1.getTabProj(0));
		
		Ordinateur [] tableaudOrdi = {o1,o2,o3};
		Imprimante [] tableauImp = {imp1};
		Projecteur [] tableauProj = {p1};
		Utilisateur [] tableauUser = {user1,user2,user3};
		Routeur rout = new Routeur("Routeur salle GM","TPLINK","HP","145.145.145.145",100,true,"INSA2021",true);
		
		SalledOrdinateur s2 = new SalledOrdinateur("Salle GM",tableaudOrdi,tableauImp,tableauProj,tableauUser,rout);
		
		//System.out.println(s2);
		
		//Méthodes
		s2.retirerOrdi(3);
		s2.retirerOrdi(2);
		s2.ajouterOrdi(o3);
		s2.retirerImp(0);
		s2.ajouterImp(imp1);
		s2.retirerProj(0);
		s2.ajouterProj(p1);
		
		System.out.println(s2);
	}
	
}
