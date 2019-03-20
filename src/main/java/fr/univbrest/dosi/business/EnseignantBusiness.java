package fr.univbrest.dosi.business;

import java.util.List;


import fr.univbrest.dosi.bean.Enseignant;

public interface EnseignantBusiness {

	List <Enseignant> recupererTousLesEnseignant();
	Enseignant recupererEnseignantParNom(String nom);
}
