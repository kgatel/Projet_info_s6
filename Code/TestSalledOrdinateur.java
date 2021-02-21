public class TestSalledOrdinateur {
	
	public static void main(String[] args) {
		SalledOrdinateur s1 = new SalledOrdinateur();
		System.out.println(s1.getTabOrdi(27));
		System.out.println(s1.getTabImp(2));
		System.out.println(s1.getTabProj(1));
		
		Utilisateur user = new Utilisateur("Kevin","GATEL","kgatel","INSA2021");
		Imprimante imp1 = new Imprimante("Imprimante INSA","FX456","HP","234.234.234.234",100,true,56,67);
		Projecteur p1 = new Projecteur("Projecteur INSA","YU3456","Epson","145.145.145.145",100,true);
		Ordinateur o1 = new Ordinateur("pc kevThibaut", "Zenbook","Asus","255.255.255.255",99,true,user,imp1,p1,false);
		
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
		

	}
	
}
