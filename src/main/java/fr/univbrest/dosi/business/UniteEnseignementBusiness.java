package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.UniteEnseignement;

public interface UniteEnseignementBusiness {
	List<UniteEnseignement> recupererTousLesUniteEnseignement();
	List<UniteEnseignement> rechercheUniteEnseignementParSemestre(String semestre);
	List<UniteEnseignement> rechercheUniteEnseignementParNoEnseignant(long noEnseignant);
	List<UniteEnseignement> rechercheUniteEnseignementParCodeFormation(String codeFormation);
	UniteEnseignement creerUniteEnseignement(UniteEnseignement EU);
	void supprimerUniteEnseignement(UniteEnseignement EU);
	void supprimerUniteEnseignementParUniteEnseignementPK(String CodeUe,String codeFormation);
}
