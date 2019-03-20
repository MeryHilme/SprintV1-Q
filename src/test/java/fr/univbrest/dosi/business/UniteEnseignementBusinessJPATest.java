package fr.univbrest.dosi.business;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Test;

import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.bean.UniteEnseignementPK;
import fr.univbrest.dosi.repository.UniteEnseignementRepository;


public class UniteEnseignementBusinessJPATest {

	UniteEnseignementBusinessJPA elementConstitutifBusinessJPA;
	
	@Test
	public void doitCreerUnUniteEnseignement() {
		UniteEnseignementRepository repos = new UniteEnseignementRepositoryList();
		elementConstitutifBusinessJPA = new UniteEnseignementBusinessJPA(repos);
		UniteEnseignementPK UNpk = new UniteEnseignementPK("M2DOSI","ISI");
		UniteEnseignement UN = new UniteEnseignement(UNpk);
		elementConstitutifBusinessJPA.creerUniteEnseignement(UN);
		assertThat(repos.count()).isEqualTo(1);

	}
	
	@Test
	public void doitSuppUnUniteEnseignement() {
		UniteEnseignementRepository repos = new UniteEnseignementRepositoryList();
		elementConstitutifBusinessJPA = new UniteEnseignementBusinessJPA(repos);
		UniteEnseignementPK UEpk = new UniteEnseignementPK("M2DOSI","ISI");
		UniteEnseignement UE = new UniteEnseignement(UEpk);
		elementConstitutifBusinessJPA.creerUniteEnseignement(UE);
		elementConstitutifBusinessJPA.supprimerUniteEnseignement(UE);
		assertThat(repos.count()).isEqualTo(0);

	}
	
	@Test
	public void doitChercherUniteEnseignementSemester() {
		UniteEnseignementRepository repos = new UniteEnseignementRepositoryList();
		elementConstitutifBusinessJPA = new UniteEnseignementBusinessJPA(repos);
		UniteEnseignementPK UEpk = new UniteEnseignementPK("M2DOSI","ISI");
		UniteEnseignement UE = new UniteEnseignement(UEpk,"9");
		elementConstitutifBusinessJPA.creerUniteEnseignement(UE);
		List<UniteEnseignement> resultat = elementConstitutifBusinessJPA.rechercheUniteEnseignementParSemestre("9");
		
		assertThat(resultat.get(0).getSemestre()).isEqualTo("9");

	}
	
}

class UniteEnseignementRepositoryList implements fr.univbrest.dosi.repository.UniteEnseignementRepository {

	private List<UniteEnseignement> data;

	public UniteEnseignementRepositoryList() {
		data = Lists.newArrayList();
	}
	
	@Override
	public long count() {
		return data.size();
	}

	@Override
	public void delete(UniteEnseignementPK arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UniteEnseignement UE) {
		data.remove(UE);
		
	}

	@Override
	public void delete(Iterable<? extends UniteEnseignement> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(UniteEnseignementPK arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<UniteEnseignement> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UniteEnseignement> findAll(Iterable<UniteEnseignementPK> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UniteEnseignement findOne(UniteEnseignementPK arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UniteEnseignement> S save(S entity) {
		data.add(entity);
		return entity;
	}

	@Override
	public <S extends UniteEnseignement> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UniteEnseignement> findBySemestre(String semestre) {
		List<UniteEnseignement> liste=Lists.newArrayList();
		for(UniteEnseignement c : data) {
			if(c.getSemestre() == semestre) {
				liste.add(c);
			}
		}
		return liste;
	}

	@Override
	public List<UniteEnseignement> findByEnseignant(long noEnseignant) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<UniteEnseignement> findByFormation(String codeFormation) {
		List<UniteEnseignement> liste=Lists.newArrayList();
		for(UniteEnseignement c : data) {
			if(c.getFormation().getCodeFormation() == codeFormation) {
				liste.add(c);
			}
		}
		return liste;
	}

	
}

