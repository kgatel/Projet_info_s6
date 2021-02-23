import java.util.Scanner;


public class Main {
	
		public static void main(String[] args) {
			SalledOrdinateur salle = new SalledOrdinateur();
			char choix='z';
			char choix2;
			Scanner scan = new Scanner(System.in);
			String str;
			while (choix!='q'){ //on demande à l'utilisateur ce qu'il veut faire
				System.out.println("Que souhaitez vous faire ?");
				System.out.println("a : afficher la salle");
				System.out.println("b : ajouter un appareil");
				System.out.println("c : supprimer un appareil");
				System.out.println("d : utiliser un ordinateur");
				System.out.println("q : arréter le programme");
				str=scan.nextLine();
				choix=str.charAt(0);				// on récupére son choix
				
				switch(choix){				//en fonction du choix on va effectuer les actions correpsondantes
					
					case 'a':						
						System.out.println(salle);
						break;
						
					case 'b':
						System.out.println("Que souhaitez vous faire ?");
						System.out.println("a : ajouter un ordinateur");
						System.out.println("b : ajouter une imprimante");
						System.out.println("c : ajouter un projecteur");
						System.out.println("d : ajouter un routeur");
						str=scan.nextLine();
						choix2=str.charAt(0);		
						
						switch(choix2){
							
							case 'a':
							
								Ordinateur orditemp = new Ordinateur();
								System.out.println("quel est le nom de votre ordinateur ?");
								str=scan.nextLine();
								orditemp.setNom(str);
								System.out.println("quel est le modèle de votre ordinateur ?");
								str=scan.nextLine();
								orditemp.setModele(str);
								System.out.println("quel est la marque de votre ordinateur ?");
								str=scan.nextLine();
								orditemp.setMarque(str);
								System.out.println("quel est l'adresse IP de votre ordinateur ?");
								str=scan.nextLine();
								orditemp.setAdresseIP(str);
								salle.ajouterOrdi(orditemp);
								break;
							
							case 'b':
								
								break;
							
							case 'c':
							
								break;
								
							case 'd':	
							
									break;
						}

						
					case 'c':
					
						break;
						
					case 'd':
					
						break;
				}
				
			}
				
		}
		
}
