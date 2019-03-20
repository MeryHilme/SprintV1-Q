package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.ElementConstitutifPK;

public interface ElementConstitutifBusiness {
	public ElementConstitutif creerElementConstitutif(ElementConstitutif elementconstitutif);
	public void supprimerElementConstitutif(ElementConstitutif elementconstitutif);
	public void supprimerElementConstitutifParid(ElementConstitutifPK id);
	public List<ElementConstitutif> recupererTousLesElementConstitutifs();
	public ElementConstitutif recupererElementConstitutifParId(ElementConstitutifPK id);
}
