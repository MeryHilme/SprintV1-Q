package fr.univbrest.dosi.business;
import java.util.List;

import fr.univbrest.dosi.bean.Qualificatif;

public interface QualificatifBusiness {
	List<Qualificatif> recupererTousLesQualificatif();
	Qualificatif rechercheQualificatifParId(int idQualificatif);
	Qualificatif creerQualificatif(Qualificatif qu);
	void supprimerQualificatif(Qualificatif qu);
	void  supprimerQualificatifParId(int idQualificatif);

}