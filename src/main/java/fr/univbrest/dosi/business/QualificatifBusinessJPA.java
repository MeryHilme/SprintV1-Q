package fr.univbrest.dosi.business;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repository.QualificatifRepository;



@Service
public class QualificatifBusinessJPA implements QualificatifBusiness{

	QualificatifRepository  qualificatifRepository;
	
	@Autowired
	public QualificatifBusinessJPA(QualificatifRepository repo){
		
		this.qualificatifRepository = repo;
	}
	
	
	@Override
	public List<Qualificatif> recupererTousLesQualificatif(){
		return (List<Qualificatif>) qualificatifRepository.findAll();
	}
	
	@Override
	public Qualificatif rechercheQualificatifParId(int idQualificatif){
		return qualificatifRepository.findByidQualificatif(idQualificatif);
	}
	
	@Override
	public Qualificatif creerQualificatif(Qualificatif qu){
		return qualificatifRepository.save(qu);
	}
	
	@Override
	public void supprimerQualificatif(Qualificatif qu){
		qualificatifRepository.delete(qu);
	}
	
	@Override
	public void supprimerQualificatifParId(int idQualificatif){
		qualificatifRepository.delete( idQualificatif);
	}
	
	
}
