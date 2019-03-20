package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Authentification;
import fr.univbrest.dosi.repository.AuthentificationRepository;

@Service
public class AuthentificationBusinessJPA implements AuthentificationBusiness {

	AuthentificationRepository authentificationRepository;
	
	public AuthentificationBusinessJPA(AuthentificationRepository repo){
		super();
		this.authentificationRepository = repo;
	}
	@Override
	public List<Authentification> recupererTousLesElementAuthentification() {
		return (List<Authentification>) authentificationRepository.findAll();
	}
	
	@Override
	public Authentification VerificationLoginConnection(String loginConnection,String motPasse,String role){
		return authentificationRepository.findByLoginConnection(loginConnection, motPasse, role);
	}
	
	public Authentification VerificationPseudoConnection(String pseudoConnection,String motPasse, String role){
		return authentificationRepository.findByPseudoConnection(pseudoConnection, motPasse, role);
	}

   
}
