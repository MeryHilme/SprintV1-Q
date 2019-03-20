package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.ElementConstitutifPK;
import fr.univbrest.dosi.business.ElementConstitutifBusiness;



@RestController
@CrossOrigin
@RequestMapping("/elementsconstitutifs")
public class ElementConstitutifController {
	
	private ElementConstitutifBusiness elementconstitutifBusiness;
    
	@Autowired
	public ElementConstitutifController(ElementConstitutifBusiness elementconstitutifBusiness) {
		this.elementconstitutifBusiness = elementconstitutifBusiness;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void creerElementConstitutif(@RequestBody ElementConstitutif elementConstitutif) {
		elementconstitutifBusiness.creerElementConstitutif(elementConstitutif);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void supprimerElementConstitutif(@RequestBody ElementConstitutif elementConstitutif) {
		elementconstitutifBusiness.supprimerElementConstitutif(elementConstitutif);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{codeFormation}/{codeUe}/{codeEc}")
	public void supprimerElementConstitutifParid(@PathVariable String codeFormation, @PathVariable String codeUe, @PathVariable String codeEc) {
		ElementConstitutifPK elementconstitutifPK = new ElementConstitutifPK();
		elementconstitutifPK.setCodeFormation(codeFormation); 
		elementconstitutifPK.setCodeUe(codeUe);  
		elementconstitutifPK.setCodeEc(codeEc);
		elementconstitutifBusiness.supprimerElementConstitutifParid(elementconstitutifPK);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<ElementConstitutif> recupererTousLesElementConstitutifs() {
		return elementconstitutifBusiness.recupererTousLesElementConstitutifs();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{codeFormation}/{codeUe}/{codeEc}")
	public ElementConstitutif recupererElementConstitutifParId(@PathVariable String codeFormation, @PathVariable String codeUe, @PathVariable String codeEc) {
		ElementConstitutifPK elementConstitutifPk = new ElementConstitutifPK();
		elementConstitutifPk.setCodeFormation(codeFormation); 
		elementConstitutifPk.setCodeUe(codeUe);  
		elementConstitutifPk.setCodeEc(codeEc);
		return elementconstitutifBusiness.recupererElementConstitutifParId(elementConstitutifPk);
	}
	
	
}
