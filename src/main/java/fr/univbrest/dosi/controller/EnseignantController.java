package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Enseignant;
import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.business.EnseignantBusinessJPA;

@RestController
@RequestMapping("/enseignant")
public class EnseignantController {
	
	private EnseignantBusinessJPA enseignantBusinessJPA;

	public EnseignantController(EnseignantBusinessJPA enseignantBusinessJPA) {
		super();
		this.enseignantBusinessJPA = enseignantBusinessJPA;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/{nom}")
	public Enseignant recupererEnseignantParNom(@PathVariable String nom){
		return enseignantBusinessJPA.recupererEnseignantParNom(nom);

	}

	@RequestMapping(method=RequestMethod.GET)
	public List<Enseignant> recupererTousLesEnseignant(){
		return enseignantBusinessJPA.recupererTousLesEnseignant();}
	

}
