package com.pharmacie.app.models;


import java.util.ArrayList;
import java.util.Scanner;

public class Client extends Person {
	
	private int badge;
	private String status;
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	static ArrayList<Client> listObj = new ArrayList<Client>();
	static Scanner scanner = new Scanner(System.in);

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}
	
	public Client(int identifiant,String nomComplet,String phone,String email,int badge,String status) {
		super(identifiant,nomComplet,phone,email);
		this.badge = badge;
		this.status = status;
		// TODO Auto-generated constructor stub
		
	}

	//Ajouter Nouveau Client
	public static void AjouterClient() {
		
		String clientStatus = "Client-normal";
		System.out.println("Entrer ID de Client :");
		int clientId = scanner.nextInt();
		
		System.out.println("Entrer le nom de Client :");
		String clientNom = scanner.next();
		
		System.out.println("Entrer le numero de Telephone de Client :");
		String clientTele = scanner.next();
		
		System.out.println("Entrer l'email de Client :");
		String clientEmail = scanner.next();
		
		System.out.println("Entrer le numero d'achat de pour chaque Produit :");
		int clientBadge = scanner.nextInt();
		
		
		if(clientBadge >= 3) {
			clientStatus = "Client-fidele";
		}
		
		Client client = new Client(clientId, clientNom, clientTele, clientEmail, clientBadge, clientStatus);
		
		listObj.add(client);
	}
	
	//Modifier un Client
	public static void ModificationClient() {
		
		System.out.println("Entrer le nombre de Client a Modifier");
		int ClientId = scanner.nextInt() - 1;
		
		if (listObj.size() > ClientId) {
			Client cli1 = listObj.get(ClientId);
			int inp;
		
		do {
			System.out.println("##### SubMenu #####");
			System.out.println("1 - Modifier Nom");
			System.out.println("2 - Modifier Numero de telephone");
			System.out.println("3 - Modifier Email");
			System.out.println("4 - Modifier Numero d'achats");
			System.out.println("5 - Sortie");
			
			System.out.println("Entrer un nombre");
			inp = scanner.nextInt();
			
			switch(inp) {
				case 1 :
					System.out.println("Entrer Nouveau nom du Client :");
					String cliNom = scanner.next();
					cli1.setNomComplet(cliNom);
					listObj.set(ClientId, cli1);
					break;
				case 2 :
					System.out.println("Entrer Nouveau Numero de telephone du Client :");
					String cliTele = scanner.next();
					cli1.setNumeroTelephone(cliTele);
					listObj.set(ClientId, cli1);
					
					break;
				case 3 :
					System.out.println("Entrer Nouveau Email du Client :");
					String cliEmail = scanner.next();
					cli1.setEmail(cliEmail);
					listObj.set(ClientId, cli1);
					break;
				case 4 :
					System.out.println("Entrer Nouveau Badge du Client :");
					int cliBadge = scanner.nextInt();
					cli1.setBadge(cliBadge);
					if(cliBadge >= 3) {
							cli1.setStatus("Client-fidele");
						} else {
							cli1.setStatus("Client-normal");
					}
					break;
				default :
					System.out.println("Le programme est arreté");
			}
		} while (inp != 5);
	}else {
		System.out.println("L'index que vous avez entré n'existe pas");
	}
}

	//Afficher liste des Clients
	public static void AfficheClient() {
		for(Object i : listObj) {
			System.out.println(i);
		}
	}
	
	// Supprimer Client selon l'index d' Array
	public static void SupprimerClient() {
		
		System.out.println("Entrer le Nombre de ligne a Supprimer");
		int supp = scanner.nextInt();
		listObj.remove(supp);
	}
	
	//Client fidèle
	public static void Clientfidele() {
		
	}

}

