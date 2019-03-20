package fr.univbrest.dosi.business;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


import java.math.BigDecimal;
import com.google.common.collect.Lists;
import java.util.stream.Collectors;
import org.junit.Before;
import org.junit.Test;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.ElementConstitutifPK;
import fr.univbrest.dosi.repository.ElementConstitutifRepository;

public class ElementConstitutifBusinessJPATest {
private ElementConstitutifBusinessJPA elementconstitutifBusiness;
	
	private ElementConstitutifRepository ElementConstitutifRepos;
	
	BigDecimal a = new BigDecimal(155);
    
	@Before
	public void setup() {
		
		ElementConstitutif ElementConstitutif1 = new ElementConstitutif(new ElementConstitutifPK("codeF","codeUe","CodeUc"), "Toto", a, a,a);
		ElementConstitutif ElementConstitutif2 = new ElementConstitutif(new ElementConstitutifPK("codeF2","codeUe2","CodeUc2"), "Toto2", a, a,a);
		
		List<ElementConstitutif> listeElementConstitutif = Lists.newArrayList();
		listeElementConstitutif.add(ElementConstitutif1);
		listeElementConstitutif.add(ElementConstitutif2);
		ElementConstitutifRepos = new ElementConstitutifRepositoryList(listeElementConstitutif);
		elementconstitutifBusiness = new ElementConstitutifBusinessJPA(ElementConstitutifRepos);
	}
	
	@Test
	public void creerElementConstitutif() {
		ElementConstitutif elementConstitutif = new ElementConstitutif(new ElementConstitutifPK("codeF3","codeUe3","CodeUc3"), "Toto3", a, a,a);
		elementconstitutifBusiness.creerElementConstitutif(elementConstitutif);
		assertThat(ElementConstitutifRepos.count()).isEqualTo(3);
	}
	
	@Test
	public void supprimerElementConstitutif() {
		ElementConstitutif elementConstitutif = new ElementConstitutif(new ElementConstitutifPK("codeF7","codeUe7","CodeUc7"), "Toto7", a, a,a);
		elementconstitutifBusiness.creerElementConstitutif(elementConstitutif);
		elementconstitutifBusiness.supprimerElementConstitutif(elementConstitutif);
		assertThat(ElementConstitutifRepos.count()).isEqualTo(2);
	}
	
	@Test
	public void recupererTousLesElementConstitutifs() {
		List<ElementConstitutif> list = elementconstitutifBusiness.recupererTousLesElementConstitutifs();
		assertThat(list).hasSize(2);
	}

	
	@Test
	public void recupererElementConstitutifParId() {
		ElementConstitutifPK id = new ElementConstitutifPK("codeF2","codeUe2","CodeUc2");
		ElementConstitutif elementConstitutif = elementconstitutifBusiness.recupererElementConstitutifParId(id);
		assertThat(elementConstitutif.getDesignation()).matches("Toto2");
	}
	
}


class ElementConstitutifRepositoryList implements ElementConstitutifRepository{

	List<ElementConstitutif> elementsconstitutifs;
	
	public ElementConstitutifRepositoryList(List<ElementConstitutif> elementsconstitutifs) {
		this.elementsconstitutifs = elementsconstitutifs;
	}

	@Override
	public long count() {
		return elementsconstitutifs.size();
	}

	@Override
	public void delete(ElementConstitutifPK arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ElementConstitutif entity) {
		if(elementsconstitutifs.remove(entity)) {
			System.out.println("Done/Suppression");
		}else {
			System.out.println("Not Done/Suppression");
		}
	}

	@Override
	public void delete(Iterable<? extends ElementConstitutif> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(ElementConstitutifPK arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<ElementConstitutif> findAll() {
		return elementsconstitutifs;
	}

	@Override
	public Iterable<ElementConstitutif> findAll(Iterable<ElementConstitutifPK> arg0) {
		
		return null;
	}

	@Override
	public ElementConstitutif findOne(ElementConstitutifPK arg0) {
		List<ElementConstitutif> datas=elementsconstitutifs.stream()
				.filter(element -> element.getId().equals(arg0))
				.collect(Collectors.toList());
		return datas.size() != 0? datas.get(0):null;
	}

	@Override
	public <S extends ElementConstitutif> S save(S entity) {
		elementsconstitutifs.add(entity);
		return entity;
	}

	@Override
	public <S extends ElementConstitutif> Iterable<S> save(Iterable<S> arg0) {

		return null;
	}

	
	
}

