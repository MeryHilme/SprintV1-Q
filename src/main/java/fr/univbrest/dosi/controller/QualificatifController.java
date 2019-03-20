package fr.univbrest.dosi.controller;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.business.QualificatifBusiness;
import fr.univbrest.dosi.repository.QualificatifRepository;

@RestController
@RequestMapping("/qualificatif")
public class QualificatifController {
	
	QualificatifRepository  qualificatifRepository;
	
	private QualificatifBusiness qualificationBusiness;
	
	public QualificatifController(QualificatifBusiness business){
		this.qualificationBusiness = business;
	}

	@RequestMapping(method=RequestMethod.GET)
	public List<Qualificatif> recupererTousLesQualificatif(){
		return qualificationBusiness.recupererTousLesQualificatif();
	}
	
    
	@RequestMapping(method=RequestMethod.GET, value="/{idQualificatif}")
	public Qualificatif rechercheQualificatifParId(@PathVariable("idQualificatif") int idQualificatif){
		return qualificationBusiness.rechercheQualificatifParId(idQualificatif);
	}

	
	@RequestMapping(method=RequestMethod.POST, value="/creerQualificatif")
	public Qualificatif creerQualificatif(@RequestBody Qualificatif qu){
		return qualificationBusiness.creerQualificatif(qu);
	}
	

	@RequestMapping(method=RequestMethod.DELETE, value="/supprimer")
	public void supprimerQualificatif(@RequestBody Qualificatif  qu){
		qualificationBusiness.supprimerQualificatif(qu);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{idQualificatif}")
	public void supprimerQualificatifParId(@PathVariable("idQualificatif") int idQualificatif)
	{
         qualificationBusiness.supprimerQualificatifParId(idQualificatif);
	}
}
	