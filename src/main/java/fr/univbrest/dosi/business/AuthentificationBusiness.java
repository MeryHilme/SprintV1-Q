package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Authentification;


public interface AuthentificationBusiness {
	public List<Authentification> recupererTousLesElementAuthentification();
	public Authentification VerificationLoginConnection(String loginConnection,String motPasse, String role);
	public Authentification VerificationPseudoConnection(String pseudoConnection,String motPasse, String role);
}
