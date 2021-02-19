public class TestUtilisateur {

	public static void main(String[] args) {
		Utilisateur u1 = new Utilisateur();
		System.out.println(u1.toString());
        System.out.println("Nom : " + u1.getNom());
        System.out.println("Prenom : " + u1.getPrenom());
		u1.setNom("Dupont");
		System.out.println("Nouveau nom : " + u1.getNom());
		u1.setPrenom("Jean");
		System.out.println("Nouveau prenom : " + u1.getPrenom());
		u1.setLogin("jdupont");
		System.out.println("Nouveau Login : " + u1.getLogin());
		u1.setMdp("jaimelejava");
		System.out.println("Nouveau Mdp : " + u1.getMdp());
		
		//saut de ligne
		System.out.println();
		
		System.out.println(u1);
		
		//saut de ligne
		System.out.println();
		
		Utilisateur u2 = new Utilisateur("Bob", "Leponge","bleponge","javacoeur");
        System.out.println("Nom : " + u2.getNom());
        System.out.println("Prenom : " + u2.getPrenom());
        System.out.println("Login : " + u2.getLogin());
        System.out.println("Mdp: " + u2.getMdp());
        
        //saut de ligne
		System.out.println();
		
		System.out.println(u2);
	}

}
