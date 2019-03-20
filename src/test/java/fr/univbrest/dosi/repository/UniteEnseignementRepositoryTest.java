package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.bean.UniteEnseignementPK;

@RunWith(SpringJUnit4ClassRunner.class)
public class UniteEnseignementRepositoryTest {
	
	UniteEnseignementRepository uniteEnseignementRepository;
	
	@Before
	public void setup() {
		UniteEnseignementPK UNpk = new UniteEnseignementPK("M2DOSI","ISI");
		UniteEnseignement UN = new UniteEnseignement(UNpk);
		uniteEnseignementRepository.save(UN);
	}
	
	@Test
	public void doitCompterLesUniteEnseignement() {
		int resultat = (int) uniteEnseignementRepository.count();
		assertThat(resultat).isEqualTo(1);
	}
}
