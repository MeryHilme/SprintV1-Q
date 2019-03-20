package fr.univbrest.dosi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Enseignant;

@Repository
public interface EnseignantRepository extends CrudRepository <Enseignant, Long> {
        
	Enseignant findByNom(String nom);
	
	
}
