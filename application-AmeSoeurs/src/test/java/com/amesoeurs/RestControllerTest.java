package com.amesoeurs;

import java.util.List;

import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.amesoeurs.model.Utilisateur;

public class RestControllerTest {

	@Test(timeout=3000)
	public void testGetUtilisateur() {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<Utilisateur>> utilisateursResponse = restTemplate.exchange(
				"http://localhost:8080/amesoeurs/utilisateurs", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Utilisateur>>() {
				});
		List<Utilisateur> utilisateurs = utilisateursResponse.getBody();

		for (Utilisateur utilisateur : utilisateurs) {
			System.out.println("utilisateur prenom: " + utilisateur.getPrenom());
		}
	}
}
