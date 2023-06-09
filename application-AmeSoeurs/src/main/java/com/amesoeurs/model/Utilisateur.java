package com.amesoeurs.model;

import lombok.Data;

@Data
public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private String pseudo;
	private int age;
	private String sexe;
	private String adresse;
	private String pays;
	private String mail;
	private String motDePasse;
	private int telephone;

}
