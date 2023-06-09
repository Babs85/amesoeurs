package com.amesoeurs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amesoeurs.model.Utilisateur;
import com.amesoeurs.service.UtilisateurService;

@Controller
public class UtilisateurController {

	@Autowired
	private UtilisateurService utilisateurService;

	@RequestMapping(value = "/utilisateurs", method = RequestMethod.GET)
	public @ResponseBody List<Utilisateur> getUtilisateurs() {
		return utilisateurService.getUtilisateurs();
	}



}
