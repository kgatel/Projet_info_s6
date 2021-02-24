import java.util.Scanner;


public class Main {
	
		public static void main(String[] args) {
			SalledOrdinateur salle = new SalledOrdinateur();
			char choix='z';
			char choix2;
			char choix3;
			int i,j;
			Scanner scan = new Scanner(System.in);
			String str;
			while (choix!='q'){ //on demande à l'utilisateur ce qu'il veut faire
				System.out.println("Que souhaitez vous faire ? tapez autre chose pour annuler");
				System.out.println("a : afficher la salle");
				System.out.println("b : ajouter un appareil");
				System.out.println("c : supprimer un appareil");
				System.out.println("d : utiliser un appareil");
				System.out.println("q : arréter le programme");
				str=scan.nextLine();
				choix=str.charAt(0);				// on récupére son choix
				
				switch(choix){				//en fonction du choix on va effectuer les actions correpsondantes
					
					case 'a':					//affiche la salle	
						System.out.println(salle);
						break;
						
					case 'b':					//ajouter un appareil
						System.out.println("Que souhaitez vous faire ? tapez autre chose pour annuler");
						System.out.println("a : ajouter un ordinateur");
						System.out.println("b : ajouter une imprimante");
						System.out.println("c : ajouter un projecteur");
						System.out.println("d : ajouter un routeur");
						str=scan.nextLine();
						choix2=str.charAt(0);		
						
						switch(choix2){
							
							case 'a':			//ajouter un ordinateur
							
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
							
							case 'b':		//ajouter une imprimante
								
								Imprimante imptemp = new Imprimante();
								System.out.println("quel est le nom de votre imprimante ?");
								str=scan.nextLine();
								imptemp.setNom(str);
								System.out.println("quel est le modèle de votre imprimante ?");
								str=scan.nextLine();
								imptemp.setModele(str);
								System.out.println("quel est la marque de votre imprimante ?");
								str=scan.nextLine();
								imptemp.setMarque(str);
								System.out.println("quel est l'adresse IP de votre imprimante ?");
								str=scan.nextLine();
								imptemp.setAdresseIP(str);
								salle.ajouterImp(imptemp);
								break;
							
							case 'c':		//ajouter un projecteur
							
								Projecteur projtemp = new Projecteur();
								System.out.println("quel est le nom de votre projecteur ?");
								str=scan.nextLine();
								projtemp.setNom(str);
								System.out.println("quel est le modèle de votre projecteur ?");
								str=scan.nextLine();
								projtemp.setModele(str);
								System.out.println("quel est la marque de votre projecteur ?");
								str=scan.nextLine();
								projtemp.setMarque(str);
								System.out.println("quel est l'adresse IP de votre projecteur ?");
								str=scan.nextLine();
								projtemp.setAdresseIP(str);
								salle.ajouterProj(projtemp);				
								break;
								
							case 'd':		//ajouter un routeur
								
								Routeur routemp = new Routeur();
								System.out.println("quel est le nom de votre routeur ?");
								str=scan.nextLine();
								routemp.setNom(str);
								System.out.println("quel est le modèle de votre routeur ?");
								str=scan.nextLine();
								routemp.setModele(str);
								System.out.println("quel est la marque de votre routeur ?");
								str=scan.nextLine();
								routemp.setMarque(str);
								System.out.println("quel est l'adresse IP de votre routeur ?");
								str=scan.nextLine();
								routemp.setAdresseIP(str);
								System.out.println("quel est le mot de passe du routeur ?");
								str=scan.nextLine();
								routemp.setMdp(str);
								salle.setRouteur(routemp);
								break;
						}
						break;
						
					case 'c':					//supprimer un appareil
					
						System.out.println("Que souhaitez vous faire ? tapez autre chose pour annuler");
						System.out.println("a : supprimer un ordinateur");
						System.out.println("b : supprimer une imprimante");
						System.out.println("c : supprimer un projecteur");
						System.out.println("d : supprimer un routeur");
						str=scan.nextLine();
						choix2=str.charAt(0);
						
						switch(choix2){
							
							case 'a':		//supprimer un ordinateur
								
								for (i=0;i<salle.getNbOrdi();i++){
									System.out.println("---------------------\n"+"Ordinateur "+(i+1)+"\n"+salle.getTabOrdi(i));
								}
								System.out.println("quel ordinateur voulez vous supprimer ?");
								j=scan.nextInt();
								salle.retirerOrdi(j-1);
								break;
							
							case 'b':		//supprimer une imprimante
								
								for (i=0;i<salle.getNbImp();i++){
									System.out.println("---------------------\n"+"Imprimante "+(i+1)+"\n"+salle.getTabImp(i));
								}
								System.out.println("quel imprimante voulez vous supprimer ?");
								j=scan.nextInt();
								salle.retirerImp(j-1);
								break;
							
							case 'c':		//supprimer un projecteur
							
								for (i=0;i<salle.getNbProj();i++){
									System.out.println("---------------------\n"+"Projecteur "+(i+1)+"\n"+salle.getTabProj(i));
								}
								System.out.println("quel projecteur voulez vous supprimer ?");
								j=scan.nextInt();
								salle.retirerProj(j-1);				
								break;
								
							case 'd':		//supprimer le routeur
								
								if (salle.getRouteur().getNom()!=""){
									Routeur routemp = new Routeur();
									routemp.setBatterie(0);
									salle.setRouteur(routemp);
								}
								else{
									System.out.println("Il n'y a déjà plus de routeur");
								} 
								break;
						}
						break;
						
					case 'd':					//utilisation d'un appareil
						
						System.out.println("Que souhaitez vous faire ? tapez autre chose pour annuler");
						System.out.println("a : utiliser un ordinateur");
						System.out.println("b : utiliser une imprimante");
						System.out.println("c : utiliser un projecteur");
						System.out.println("d : utiliser un routeur");
						str=scan.nextLine();
						choix2=str.charAt(0);
						
						switch(choix2){
							
							case 'a' :
								
								
								break;
								
							case 'b' :			//utilisation d'une imprimante
								
								if (salle.getTabImp(0).getNom()!=""){			//vérifie qu'il y a au moins une imprimante
									for (i=0;i<salle.getNbImp();i++){
										System.out.println("---------------------\n"+"Imprimante "+(i+1)+"\n"+salle.getTabImp(i));
									}
									System.out.println("quel imprimante voulez vous utiliser ?");
									j=scan.nextInt();
									j--;
									if ((j>=0)&&(j<salle.getNbImp())){			//vérifie que l'indice est correcte
										System.out.println("Que souhaitez vous faire ? tapez autre chose pour annuler");
										System.out.println("a : allumer l'imprimante");
										System.out.println("b : éteindre l'limprimante");
										System.out.println("c : changer l'encre de couleur");
										System.out.println("d : changer l'encre noir");
										str=scan.nextLine();
										choix3=str.charAt(0);
										
										switch(choix3){
											
											case 'a' :
											
												salle.getTabImp(j).allumer();
												break;
												
											case 'b' :
												
												salle.getTabImp(j).eteindre();
												break;
												
											case 'c' :
												
												salle.getTabImp(j).changerEncreCouleure();
												break;
												
											case 'd' :
												salle.getTabImp(j).changerEncreNoire();
												break;
										}
									}
									else{
										System.out.println("mauvais indice");
									}
								}
								else{
									System.out.println("Il n'y a pas d'imprimante");
								}
								break;
								
							case 'c' :			//utilisation d'un projecteur
								
								if (salle.getTabProj(0).getNom()!=""){			//vérifie qu'il y a au moins un Projecteur
									for (i=0;i<salle.getNbProj();i++){
										System.out.println("---------------------\n"+"Projecteur "+(i+1)+"\n"+salle.getTabProj(i));
									}
									System.out.println("quel Projecteur voulez vous utiliser ?");
									j=scan.nextInt();
									j--;
									if ((j>=0)&&(j<salle.getNbProj())){			//vérifie que l'indice est correcte
										System.out.println("Que souhaitez vous faire ? tapez autre chose pour annuler");
										System.out.println("a : allumer le projecteur");
										System.out.println("b : éteindre le projecteur");
										str=scan.nextLine();
										choix3=str.charAt(0);
										
										switch(choix3){
											
											case 'a' :
											
												salle.getTabProj(j).allumer();
												break;
												
											case 'b' :
											
												salle.getTabProj(j).eteindre();
												break;
											
										}
									}
									else{
										System.out.println("mauvais indice");
									}
								}
								else{
									System.out.println("Il n'y a pas de projecteur");
								}
								break;
								
							case 'd' :
								
								if (salle.getRouteur().getNom()!=""){			//vérifie qu'il y a un routeur
									System.out.println("Que souhaitez vous faire ? tapez autre chose pour annuler");
									System.out.println("a : allumer le routeur");
									System.out.println("b : éteindre le retour");
									System.out.println("c : diffuser le wifi");
									str=scan.nextLine();
									choix3=str.charAt(0);
									
									switch(choix3){
										
										case 'a' :
										
											salle.getRouteur().allumer();
											break;
											
										case 'b' :
											
											salle.getRouteur().eteindre();
											break;
											
										case 'c' :
											
											salle.getRouteur().diffuserWifi();
											break;
											
									}
								}
								else{
									System.out.println("Il n'y a pas de routeur");
								}
								break;
							
						}
							
						break;
				}
				
			}
				
		}
		
}
