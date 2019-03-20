package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.business.UniteEnseignementBusiness;

@RestController
@RequestMapping("/uniteEnseignement")
public class UniteEnseignementController {
	
	private UniteEnseignementBusiness uniteEnseignementBusiness;
	
	public UniteEnseignementController(UniteEnseignementBusiness business){
		this.uniteEnseignementBusiness = business;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<UniteEnseignement> recupererTousLesUniteEnseignement(){
		return uniteEnseignementBusiness.recupererTousLesUniteEnseignement();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{semestre}")
	public List<UniteEnseignement> rechercheUniteEnseignementParSemestre(@PathVariable String semestre){
		return uniteEnseignementBusiness.rechercheUniteEnseignementParSemestre(semestre);
	}
    
	@RequestMapping(method=RequestMethod.GET, value="/Enseignant/{noEnseignant}")
	public List<UniteEnseignement> rechercheUniteEnseignementParNoEnseignant(@PathVariable("noEnseignant") long noEnseignant){
		return uniteEnseignementBusiness.rechercheUniteEnseignementParNoEnseignant(noEnseignant);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/Formation/{codeFormation}")
	public List<UniteEnseignement> rechercheUniteEnseignementParCodeFormation(@PathVariable("codeFormation") String codeFormation){
		return uniteEnseignementBusiness.rechercheUniteEnseignementParCodeFormation(codeFormation);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/creer")
	public UniteEnseignement creerUniteEnseignement(@RequestBody UniteEnseignement EU){
		return uniteEnseignementBusiness.creerUniteEnseignement(EU);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/supprimer")
	public void supprimerUniteEnseignement(@RequestBody UniteEnseignement EU){
		uniteEnseignementBusiness.supprimerUniteEnseignement(EU);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/supprimerPK")
	public void supprimerUniteEnseignementParUniteEnseignementPK(@RequestParam String codeUe, @RequestParam String codeFormation){
		uniteEnseignementBusiness.supprimerUniteEnseignementParUniteEnseignementPK(codeUe,codeFormation);
	}
	
}
