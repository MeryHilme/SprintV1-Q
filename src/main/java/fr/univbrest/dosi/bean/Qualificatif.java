package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;





/**
 * The persistent class for the QUALIFICATIF database table.
 * 
 */

@Entity
@Table(name="qualificatif")
@NamedQueries({
@NamedQuery(name="Qualificatif.findAll", query="SELECT q FROM Qualificatif q"),
@NamedQuery(name="Qualificatif.findById", query="SELECT q FROM Qualificatif q where q.idQualificatif =?1")
})
public class Qualificatif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	/*@GeneratedValue(strategy = GenerationType.AUTO)*/
	@Column(name="ID_QUALIFICATIF", updatable = false, nullable = false)
	private int idQualificatif;

	public Qualificatif() {
	}

	@Column(name="MAXIMAL")
	private String maximal;

	@Column(name="MINIMAL")
	private String minimal;

	public int getIdQualificatif() {
		return idQualificatif;
	}

	public void setIdQualificatif(int idQualificatif) {
		this.idQualificatif = idQualificatif;
	}

	public String getMaximal() {
		return maximal;
	}

	public void setMaximal(String maximal) {
		this.maximal = maximal;
	}

	public String getMinimal() {
		return minimal;
	}

	public void setMinimal(String minimal) {
		this.minimal = minimal;
	}
	
	
	
}