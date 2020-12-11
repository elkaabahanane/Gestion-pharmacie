package com.pharmacie.app.models;

public class Person {
	private int identifiant;
	private String nomComplet;
	private String phone;
	private String email;
	
	public Person (int identifiant,String nomComplet,String phone,String email) {
		this.identifiant = identifiant;
		this.nomComplet = nomComplet;
		this.phone = phone;
		this.email = email;
	}
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public String getNumeroTelephone() {
		return phone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		this.phone = numeroTelephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Identifiant :"+ identifiant + "\n Nom Complet :"+ nomComplet + "\n Numero de telephone :" + phone +"\n Email :"+ email;
	}
	
}

