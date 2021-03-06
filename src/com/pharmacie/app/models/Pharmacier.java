package com.pharmacie.app.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Pharmacier extends Person {

	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Pharmacier> listObj = new ArrayList<Pharmacier>();
	
	public Pharmacier(int identifiant,String nomComplet,String phone,String email) {
		super(identifiant, nomComplet,phone,email);
		// TODO Auto-generated constructor stub
	}
	

	//Ajouter des Pharmaciers :
	public static void AjouterFamacier() {
		System.out.println("Enter Pharmacier Identifiant :");
		int phaIdentifiant = scanner.nextInt();
		
		System.out.println("Enter Pharmacier Nom Complet :");
		String phaNom = scanner.next();
		
		System.out.println("Enter Pharmacier Numero de telephone :");
		String phaTelephone = scanner.next();
		
		System.out.println("Enter Pharmacier EMail :");
		String phaEmail = scanner.next();
		
		Pharmacier pha = new Pharmacier(phaIdentifiant,phaNom,phaTelephone,phaEmail);
		
		listObj.add(pha);
	}
	
	// Afficher tous les Pharmaciers :
	public static void AffichePharmaciers() {
		
		for(Object i : listObj) {
			System.out.println(i);
		}
	}
	
	//Modifier des Pharmaciers :
	public static void ModifierPharmacier() {
		
		System.out.println("Enter le nombre de Pharmacier a Modifier :");
		int newPharmacieId = scanner.nextInt() - 1;
		
		if (listObj.size() > newPharmacieId) {
			Pharmacier pha1 = listObj.get(newPharmacieId);
			int inp;
			
			do {
				System.out.println("##### SubMenu #####");
				System.out.println("1 - Modifier Nom Complet");
				System.out.println("2 - Modifier Numero de telephone");
				System.out.println("3 - Modifier Email");
				System.out.println("4 - Sortie");
				
				System.out.println("Enter un nombre :");
				inp = scanner.nextInt();
	
				switch(inp) {
					case 1 :
						System.out.println("Entrer Nouveau nom du Pharmacier :");
						String phatNom = scanner.next();
						pha1.setNomComplet(phatNom);
						listObj.set(newPharmacieId, pha1);
						break;
					case 2 :
						System.out.println("Enter Nouveau numero de Telephone");
						String phatTele = scanner.next();
						pha1.setNumeroTelephone(phatTele);
						listObj.set(newPharmacieId, pha1);
						break;
					case 3 :
						System.out.println("Enter Nouveau Email");
						String phatEmail = scanner.next();
						pha1.setEmail(phatEmail);
						listObj.set(newPharmacieId, pha1);
					default :
						System.out.println("Le programme est arret�");
				}
				
			} while (inp != 4);
		} else {
			System.out.println("L'index que vous avez entr� n'existe pas");
		}
	}

	// Supprimer Pharmacier selon l'index d' Array
	public static void SupprimerPharmacier() {
		System.out.println("Entrer le Nombre de ligne a Supprimer");
		int supp = scanner.nextInt() - 1;
		listObj.remove(supp);
	}
	
	//Recherche selon index du Pharmacier
	public static void RecherchPharmacier() {
		System.out.println("Entrer la position a Rechercher");
		int searchkey = scanner.nextInt() - 1;
		Pharmacier pharmacier = listObj.get(searchkey);
		System.out.println(pharmacier.toString());
	}
}

