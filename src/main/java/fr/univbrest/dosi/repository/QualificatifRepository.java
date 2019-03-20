package fr.univbrest.dosi.repository;
import org.springframework.data.repository.CrudRepository;


import fr.univbrest.dosi.bean.Qualificatif;


public interface QualificatifRepository extends CrudRepository<Qualificatif, Integer>{
	
	Qualificatif findByidQualificatif(int idQualificatif);
	

}