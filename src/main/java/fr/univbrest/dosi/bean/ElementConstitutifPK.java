package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ELEMENT_CONSTITUTIF database table.
 * 
 */
@Embeddable
public class ElementConstitutifPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CODE_FORMATION")
	private String codeFormation;

	@Column(name="CODE_UE")
	private String codeUe;

	@Column(name="CODE_EC")
	private String codeEc;

	public ElementConstitutifPK() {
	}
	
	public ElementConstitutifPK(String codeFormation, String codeUE, String codeEc ) {
		this.codeFormation = codeFormation;
		this.codeUe = codeUe;
		this.codeEc = codeEc;
	} 
	
	public String getCodeFormation() {
		return this.codeFormation;
	}
	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}
	public String getCodeUe() {
		return this.codeUe;
	}
	public void setCodeUe(String codeUe) {
		this.codeUe = codeUe;
	}
	public String getCodeEc() {
		return this.codeEc;
	}
	public void setCodeEc(String codeEc) {
		this.codeEc = codeEc;
	}
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementConstitutifPK other = (ElementConstitutifPK) obj;
		if (codeFormation == null) {
			if (other.codeFormation != null)
				return false;
		} else if (!codeFormation.equals(other.codeFormation))
			return false;
		if (codeUe == null) {
			if (other.codeUe != null)
				return false;
		} else if (!codeUe.equals(other.codeUe))
			return false;
		if (codeEc == null) {
			if (other.codeEc != null)
				return false;
		} else if (!codeEc.equals(other.codeEc))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		
		hash = prime * hash + ((codeFormation == null) ? 0 : codeFormation.hashCode());
		hash = prime * hash + ((codeUe == null) ? 0 : codeUe.hashCode());
		hash = prime * hash + ((codeEc == null) ? 0 : codeEc.hashCode());
		return hash;
	}
}