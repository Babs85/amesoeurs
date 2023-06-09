package com.amesoeurs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.amesoeurs.model.Utilisateur;

@Repository("UtilisateurRepository")
public class UtilisateurRepositoryImpl implements UtilisateurRepository {

	// objet pour communiquer avec la BDD

	  @Autowired private JdbcTemplate jdbcTemplate;


	@Override
	public List<Utilisateur> getUtilisateurs() {

		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setPrenom("Amy Brake");
		List<Utilisateur> utilisateurs = new ArrayList<>();
		utilisateurs.add(utilisateur);
		return utilisateurs;
	}
}
