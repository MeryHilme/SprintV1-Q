package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.business.FormationBusiness;

@RestController
@RequestMapping("/formations")
public class FormationController {
	private FormationBusiness formationBusiness;
	
	@Autowired
	public FormationController(FormationBusiness business) {
		this.formationBusiness = business;
	}
	

	@RequestMapping(method=RequestMethod.GET)
	public List<Formation> recupererTousLesFormations(){
		return formationBusiness.recupererTousLesFormation();}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/codeFormation/{codeFormation}")
	public Formation recupererFormationParID(@PathVariable String codeFormation) {
		return formationBusiness.rechercheFormationParID(codeFormation);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/nomFormation/{nomFormation}")
	public List<Formation> recupererFormationParNom(@PathVariable String nomFormation) {
		return formationBusiness.rechercheFormationParNom(nomFormation);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void creerFormation(@RequestBody Formation formation) {
		formationBusiness.creerFormation(formation);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void supprimerFormation(@RequestBody Formation formation) {
		formationBusiness.supprimerFormation(formation);
	}
	
}
