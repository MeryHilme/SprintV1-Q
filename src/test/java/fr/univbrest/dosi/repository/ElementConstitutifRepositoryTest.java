package fr.univbrest.dosi.repository;
import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.ElementConstitutifPK;


@RunWith(SpringJUnit4ClassRunner.class)
public class ElementConstitutifRepositoryTest {
	
	BigDecimal a = new BigDecimal(155); 
	
	@Autowired
	private ElementConstitutifRepository ElementConstitutifRepos;
	
	
	@Before
	public void setup() {
		
		ElementConstitutif ElementConstitutif = new ElementConstitutif(new ElementConstitutifPK("M2DOSI","codeUe","CodeUc"), "Toto", a, a,a);
		ElementConstitutif ElementConstitutif2 = new ElementConstitutif(new ElementConstitutifPK("M2DOSI","codeUe2","CodeUc2"), "Toto2", a, a,a);
		ElementConstitutifRepos.save(ElementConstitutif);
		ElementConstitutifRepos.save(ElementConstitutif2);
	}
	
	@Test
	public void LesElementsConstitutifs() {
		assertThat(ElementConstitutifRepos.count()).isEqualTo(2);
	}


	@Test
	public void RechercheParID() {
		ElementConstitutif elementConstitutif = ElementConstitutifRepos.findOne(new ElementConstitutifPK("codeF","codeUe","CodeUc"));
		assertThat(elementConstitutif.getDesignation()).matches("Toto");
	}	
	
}