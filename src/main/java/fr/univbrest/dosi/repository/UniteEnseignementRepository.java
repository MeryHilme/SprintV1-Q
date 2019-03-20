package fr.univbrest.dosi.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.bean.UniteEnseignementPK;

@Repository
public interface UniteEnseignementRepository extends CrudRepository<UniteEnseignement, UniteEnseignementPK>{
	List<UniteEnseignement> findBySemestre(String semestre);
	List<UniteEnseignement> findByEnseignant(long noEnseignant);
	List<UniteEnseignement> findByFormation(String codeFormation);
}
