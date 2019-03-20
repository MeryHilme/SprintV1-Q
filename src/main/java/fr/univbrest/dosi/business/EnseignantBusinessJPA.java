package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Enseignant;
import fr.univbrest.dosi.repository.EnseignantRepository;

@Service
public class EnseignantBusinessJPA implements EnseignantBusiness{
	
	private EnseignantRepository enseignantRepository;
	
	
	public EnseignantBusinessJPA(EnseignantRepository enseignantRepository) {
		super();
		this.enseignantRepository = enseignantRepository;
	}

	@Override
	public List<Enseignant> recupererTousLesEnseignant() {
		return (List<Enseignant>)enseignantRepository.findAll();
	}

	@Override
	public Enseignant recupererEnseignantParNom(String nom) {
		return enseignantRepository.findByNom(nom);
	}

}
