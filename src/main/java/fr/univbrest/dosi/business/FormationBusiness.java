package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Formation;

public interface FormationBusiness {
	
	List<Formation> recupererTousLesFormation();
	Formation rechercheFormationParID(String codeFormation);
	List<Formation> rechercheFormationParNom(String nomFormation);
	Formation creerFormation(Formation formation);
	void supprimerFormation(Formation formation);
	void supprimerFormationParid(String codeFormation);
}