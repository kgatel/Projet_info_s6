import java.util.Scanner;


public class Main {
	
		public static void main(String[] args) {
			SalledOrdinateur salle = new SalledOrdinateur();
			char choix='z';
			char choix2='z';
			char choix3='z';
			int i,j,k;
			Scanner scan = new Scanner(System.in);
			Scanner scanint = new Scanner(System.in);
			String str;
			while (choix!='q'){ //on demande à l'utilisateur ce qu'il veut faire
				System.out.println("Que souhaitez vous faire ? tapez autre chose pour annuler");
				System.out.println("a : afficher la salle");
				System.out.println("b : ajouter un appareil");
				System.out.println("c : supprimer un appareil");
				System.out.println("d : utiliser un appareil");
				System.out.println("e : ajouter un utilisateur");
				System.out.println("f : supprimer un utilisateur");
				System.out.println("q : arréter le programme");
				str= scan.nextLine();
				choix=str.charAt(0);				// on récupére son choix
				 
				
				switch(choix){				//en fonction du choix on va effectuer les actions correpsondantes
					
					case 'a':					//affiche la salle	
						System.out.println(salle);
						break;
						
					case 'b':					//ajouter un appareil
						
						while (choix2!='q'){
							System.out.println("Que souhaitez vous faire ? tapez q pour quitter");
							System.out.println("a : ajouter un ordinateur (il faut au préalable avoir une imprimante et un projecteur)");
							System.out.println("b : ajouter une imprimante");
							System.out.println("c : ajouter un projecteur");
							System.out.println("d : ajouter un routeur");
							str= scan.nextLine();
							choix2=str.charAt(0);		

							
							switch(choix2){
								
								case 'a':			//ajouter un ordinateur
								
									Ordinateur orditemp = new Ordinateur();
									String prenom,nom,login,mdp;
									System.out.println("quel est le nom de votre ordinateur ?");
									str= scan.nextLine();
									orditemp.setNom(str);
									System.out.println("quel est le modèle de votre ordinateur ?");
									str= scan.nextLine();
									orditemp.setModele(str);
									System.out.println("quel est la marque de votre ordinateur ?");
									str= scan.nextLine();
									orditemp.setMarque(str);
									System.out.println("quel est l'adresse IP de votre ordinateur ?");
									str= scan.nextLine();
									orditemp.setAdresseIP(str);
									for (i=0;i<salle.getNbImp();i++){
										System.out.println("---------------------\n"+"Imprimante "+(i+1)+"\n"+salle.getTabImp(i));
									}
									System.out.println("quel imprimante voulez vous reliez à l'ordinateur ?");
									j=scanint.nextInt();
									j--;
									orditemp.setImprimante(salle.getTabImp(j));
									for (i=0;i<salle.getNbProj();i++){
										System.out.println("---------------------\n"+"Projecteur "+(i+1)+"\n"+salle.getTabProj(i));
									}
									System.out.println("quel projecteur voulez vous reliez à l'ordinateur ?");
									j=scanint.nextInt();
									j--;
									orditemp.setProjecteur(salle.getTabProj(j));
									salle.ajouterOrdi(orditemp);
									break;
								
								case 'b':		//ajouter une imprimante
									
									Imprimante imptemp = new Imprimante();
									System.out.println("quel est le nom de votre imprimante ?");
									str= scan.nextLine();
									imptemp.setNom(str);
									System.out.println("quel est le modèle de votre imprimante ?");
									str= scan.nextLine();
									imptemp.setModele(str);
									System.out.println("quel est la marque de votre imprimante ?");
									str= scan.nextLine();
									imptemp.setMarque(str);
									System.out.println("quel est l'adresse IP de votre imprimante ?");
									str= scan.nextLine();
									imptemp.setAdresseIP(str);
									salle.ajouterImp(imptemp);
									break;
								
								case 'c':		//ajouter un projecteur
								
									Projecteur projtemp = new Projecteur();
									System.out.println("quel est le nom de votre projecteur ?");
									str= scan.nextLine();
									projtemp.setNom(str);
									System.out.println("quel est le modèle de votre projecteur ?");
									str= scan.nextLine();
									projtemp.setModele(str);
									System.out.println("quel est la marque de votre projecteur ?");
									str= scan.nextLine();
									projtemp.setMarque(str);
									System.out.println("quel est l'adresse IP de votre projecteur ?");
									str= scan.nextLine();
									projtemp.setAdresseIP(str);
									salle.ajouterProj(projtemp);				
									break;
									
								case 'd':		//ajouter un routeur
									
									Routeur routemp = new Routeur();
									System.out.println("quel est le nom de votre routeur ?");
									str= scan.nextLine();
									routemp.setNom(str);
									System.out.println("quel est le modèle de votre routeur ?");
									str= scan.nextLine();
									routemp.setModele(str);
									System.out.println("quel est la marque de votre routeur ?");
									str= scan.nextLine();
									routemp.setMarque(str);
									System.out.println("quel est l'adresse IP de votre routeur ?");
									str= scan.nextLine();
									routemp.setAdresseIP(str);
									System.out.println("quel est le mot de passe du routeur ?");
									str= scan.nextLine();
									routemp.setMdp(str);
									salle.setRouteur(routemp);
									break;
							}
						}
						choix2='z';
						break;
						
					case 'c':					//supprimer un appareil
						
						while (choix2!='q'){
							System.out.println("Que souhaitez vous faire ? tapez q pour quitter");
							System.out.println("a : supprimer un ordinateur");
							System.out.println("b : supprimer une imprimante");
							System.out.println("c : supprimer un projecteur");
							System.out.println("d : supprimer un routeur");
							str= scan.nextLine();
							choix2=str.charAt(0);
							 
							
							switch(choix2){
								
								case 'a':		//supprimer un ordinateur
									
									for (i=0;i<salle.getNbOrdi();i++){
										System.out.println("---------------------\n"+"Ordinateur "+(i+1)+"\n"+salle.getTabOrdi(i));
									}
									System.out.println("quel ordinateur voulez vous supprimer ?");
									j=scanint.nextInt();
									salle.retirerOrdi(j-1);
									break;
								
								case 'b':		//supprimer une imprimante
									
									for (i=0;i<salle.getNbImp();i++){
										System.out.println("---------------------\n"+"Imprimante "+(i+1)+"\n"+salle.getTabImp(i));
									}
									System.out.println("quel imprimante voulez vous supprimer ?");
									j=scanint.nextInt();
									salle.retirerImp(j-1);
									break;
								
								case 'c':		//supprimer un projecteur
								
									for (i=0;i<salle.getNbProj();i++){
										System.out.println("---------------------\n"+"Projecteur "+(i+1)+"\n"+salle.getTabProj(i));
									}
									System.out.println("quel projecteur voulez vous supprimer ?");
									j=scanint.nextInt();
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
						}
						break;
							
					case 'd':					//utilisation d'un appareil
						
						while (choix2!='q'){
							System.out.println("Que souhaitez vous faire ? tapez q pour quitter");
							System.out.println("a : utiliser un ordinateur");
							System.out.println("b : utiliser une imprimante");
							System.out.println("c : utiliser un projecteur");
							System.out.println("d : utiliser un routeur");
							str= scan.nextLine();
							choix2=str.charAt(0);
							 
							
							switch(choix2){
								
								case 'a' :			//utilisation d'un ordinateur
									
									if (salle.getTabOrdi(0).getNom()!=""){			//vérifie qu'il y a au moins un ordinateur
										for (i=0;i<salle.getNbOrdi();i++){
											System.out.println("---------------------\n"+"Ordinateur "+(i+1)+"\n"+salle.getTabOrdi(i));
										}
										System.out.println("quel ordinateur voulez vous utiliser ?");
										j=scanint.nextInt();
										j--;
										if ((j>=0)&&(j<salle.getNbOrdi())){			//vérifie que l'indice est correcte
											
											while (choix3!='q'){
												System.out.println("Que souhaitez vous faire ? tapez q pour quitter");
												System.out.println("a : allumer l'ordinateur");
												System.out.println("b : éteindre l'ordinateur");
												System.out.println("c : se connecter");
												System.out.println("d : se deconnecter");
												System.out.println("e : imprimer");
												System.out.println("f : projeter");
												System.out.println("g : Connexion Wifi");
												System.out.println("h : Moodle");								
												str= scan.nextLine();
												choix3=str.charAt(0);
												 
												
												switch(choix3){
													
													case 'a':
													
														salle.getTabOrdi(j).allumer();
														break;
													
													case 'b':
													
														salle.getTabOrdi(j).Eteindre();
														break;
														
													case 'c' :
														
														for (i=0;i<salle.getNbUser();i++){
															System.out.println("---------------------\n"+"Utilisateur "+(i+1)+"\n"+salle.getTabUser(i));
														}
														System.out.println("quel utilisateur voulez vous utiliser ?");
														k=scanint.nextInt();
														k--;
														salle.getTabOrdi(j).seConnecter(salle.getTabUser(k));
														break;
														
													case 'd':
														
														salle.getTabOrdi(j).seDeconnecter();
														break;
														
													case 'e':
														
														int exemplaires;
														String orientation,papier;
														boolean couleur,rectoverso;
														char choix4;
														int [] pages= {1,2};
														System.out.println("Combien d'exemplaires voulez vous imprimer ?");
														exemplaires=scanint.nextInt();
														System.out.println("quelle orientation voulez vous (Paysage ou Portrait) ?");
														orientation= scan.nextLine();
														System.out.println("quelle format voulez vous (A4 ou A5) ?");
														papier= scan.nextLine();
														System.out.println("Voulez vous imprimer en couleur o/n ?");
														str= scan.nextLine();
														choix4=str.charAt(0);
														 
														if (choix4=='o'){
															couleur=true;
														}
														else{
															couleur=false;
														}
														System.out.println("Voulez vous imprimer en recto-verso o/n ?");
														str= scan.nextLine();
														choix4=str.charAt(0);
														 
														if (choix4=='o'){
															rectoverso=true;
														}
														else{
															rectoverso=false;
														}
														salle.getTabOrdi(j).Imprimer(pages,exemplaires,orientation,papier,couleur,rectoverso);
														break;
														
														
													case 'f':
														
														salle.getTabOrdi(j).Projeter();
														break;
														
													case 'g':
													
														salle.getTabOrdi(j).connexionWifi(salle.getRouteur());
														break;
														
													case 'h':
													
														salle.getTabOrdi(j).Moodle();
														break;
												}
											}
										}
										else{
												System.out.println("Erreur d'indice");
											}
										}
										else{
											System.out.println("Il n'y a pas d'ordinateur");
										}
										
									break;
									
								case 'b' :			//utilisation d'une imprimante
									
									if (salle.getTabImp(0).getNom()!=""){			//vérifie qu'il y a au moins une imprimante
										for (i=0;i<salle.getNbImp();i++){
											System.out.println("---------------------\n"+"Imprimante "+(i+1)+"\n"+salle.getTabImp(i));
										}
										System.out.println("quel imprimante voulez vous utiliser ?");
										j=scanint.nextInt();
										j--;
										if ((j>=0)&&(j<salle.getNbImp())){			//vérifie que l'indice est correcte
											while (choix3!='q'){
												System.out.println("Que souhaitez vous faire ? tapez q pour quitter");
												System.out.println("a : allumer l'imprimante");
												System.out.println("b : éteindre l'imprimante");
												System.out.println("c : changer l'encre de couleur");
												System.out.println("d : changer l'encre noir");
												str= scan.nextLine();
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
										j=scanint.nextInt();
										j--;
										if ((j>=0)&&(j<salle.getNbProj())){			//vérifie que l'indice est correcte
											while (choix3!='q'){
												System.out.println("Que souhaitez vous faire ? tapez q pour quitter");
												System.out.println("a : allumer le projecteur");
												System.out.println("b : éteindre le projecteur");
												str= scan.nextLine();
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
										}
										else{
											System.out.println("mauvais indice");
										}
									}
									else{
										System.out.println("Il n'y a pas de projecteur");
									}
									break;
									
								case 'd' :					//utilisation d'un routeur
									
									if (salle.getRouteur().getNom()!=""){			//vérifie qu'il y a un routeur
										while (choix3!='q'){
											System.out.println("Que souhaitez vous faire ? tapez q pour quitter");
											System.out.println("a : allumer le routeur");
											System.out.println("b : éteindre le retour");
											System.out.println("c : diffuser le wifi");
											str= scan.nextLine();
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
									}
									else{
										System.out.println("Il n'y a pas de routeur");
									}
									break;
								
							}
						}		
						break;
				
				
					case 'e':				//ajout d'un utilisateur
					
						System.out.println("Voulez vous ajouter un élève (e) ou un professeur (p) ?");
						str= scan.nextLine();
						choix2=str.charAt(0);
						 
						if (choix2=='p'){
							Professeur usertemp = new Professeur();
							System.out.println("quel est le prénom de l'utilisateur ?");
							str= scan.nextLine();
							usertemp.setPrenom(str);
							System.out.println("quel est le nom de l'utilisateur ?");
							str= scan.nextLine();
							usertemp.setNom(str);
							System.out.println("quel est le login de l'utilisateur ?");
							str= scan.nextLine();
							usertemp.setLogin(str);
							System.out.println("quel est le Mot de passe de l'utilisateur ?");
							str= scan.nextLine();
							usertemp.setMdp(str);
							salle.ajouterUtilisateur(usertemp);
						}
						else{
							Eleve usertemp = new Eleve();
							System.out.println("quel est le prénom de l'utilisateur ?");
							str= scan.nextLine();
							usertemp.setPrenom(str);
							System.out.println("quel est le nom de l'utilisateur ?");
							str= scan.nextLine();
							usertemp.setNom(str);
							System.out.println("quel est le login de l'utilisateur ?");
							str= scan.nextLine();
							usertemp.setLogin(str);
							System.out.println("quel est le Mot de passe de l'utilisateur ?");
							str= scan.nextLine();
							usertemp.setMdp(str);
							salle.ajouterUtilisateur(usertemp);
						}
						
						break;
						
					case 'f':			//supprimer un utilisateur
					
						for (i=0;i<salle.getNbUser();i++){
							System.out.println("---------------------\n"+"Utilisateur "+(i+1)+"\n"+salle.getTabUser(i));
						}
						System.out.println("quel Utilisateur voulez vous supprimer ?");
						j=scanint.nextInt();
						salle.retirerUtilisateur(j-1);
						break;
				}
			}
				
		}
		
}
