package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.ElementConstitutifPK;
import fr.univbrest.dosi.repository.ElementConstitutifRepository;
@Service
public class ElementConstitutifBusinessJPA implements ElementConstitutifBusiness {
   
	
	ElementConstitutifRepository ElementConstitutifRepos;
	
	@Autowired
	public ElementConstitutifBusinessJPA(ElementConstitutifRepository ElementConstitutifRepos) {
		super();
		this.ElementConstitutifRepos = ElementConstitutifRepos;
	}
	
	@Override
	public ElementConstitutif creerElementConstitutif(ElementConstitutif elementconstitutif) {
		// TODO Auto-generated method stub
		return ElementConstitutifRepos.save(elementconstitutif);
	}

	@Override
	public void supprimerElementConstitutif(ElementConstitutif elementconstitutif) {
		ElementConstitutifRepos.delete(elementconstitutif);
		
	}

	@Override
	public void supprimerElementConstitutifParid(ElementConstitutifPK id) {
		ElementConstitutifRepos.delete(id);	
	}

	@Override
	public List<ElementConstitutif> recupererTousLesElementConstitutifs() {
		return (List<ElementConstitutif>) ElementConstitutifRepos.findAll();
	}

	@Override
	public ElementConstitutif recupererElementConstitutifParId(ElementConstitutifPK id) {
		return ElementConstitutifRepos.findOne(id);	
	}

}
