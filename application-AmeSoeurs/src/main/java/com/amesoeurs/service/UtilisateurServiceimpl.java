package com.amesoeurs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amesoeurs.model.Utilisateur;
import com.amesoeurs.repository.UtilisateurRepository;

@Service("UtilisateurService")
public class UtilisateurServiceimpl implements UtilisateurService {

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurRepository.getUtilisateurs();
	}

}
