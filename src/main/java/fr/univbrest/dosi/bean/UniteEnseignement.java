package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the UNITE_ENSEIGNEMENT database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="UniteEnseignement.findAll", query="SELECT u FROM UniteEnseignement u"),
	@NamedQuery(name="UniteEnseignement.findByEnseignant", query="SELECT u FROM UniteEnseignement u where u.enseignant.noEnseignant =?1")
,	@NamedQuery(name="UniteEnseignement.findByFormation", query="SELECT u FROM UniteEnseignement u where u.formation.codeFormation =?1")
})
@Table(name="unite_enseignement")
public class UniteEnseignement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UniteEnseignementPK id;

	private String description;

	private String designation;

	@Column(name="NBH_CM")
	private BigDecimal nbhCm;

	@Column(name="NBH_TD")
	private BigDecimal nbhTd;

	@Column(name="NBH_TP")
	private BigDecimal nbhTp;

	private String semestre;
	
	public UniteEnseignement(UniteEnseignementPK id, String semestre) {
		super();
		this.id = id;
		this.semestre = semestre;
	}

	//uni-directional many-to-one association to Enseignant
	@ManyToOne
	@JoinColumn(name="NO_ENSEIGNANT")
	private Enseignant enseignant;

	//uni-directional many-to-one association to Formation
	@ManyToOne
	@JoinColumn(name="CODE_FORMATION", insertable=false, updatable=false)
	private Formation formation;

	public UniteEnseignement() {
	}
	
	public UniteEnseignement(UniteEnseignementPK id) {
		super();
		this.id=id;
	}

	public UniteEnseignementPK getId() {
		return this.id;
	}

	public void setId(UniteEnseignementPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getNbhCm() {
		return this.nbhCm;
	}

	public void setNbhCm(BigDecimal nbhCm) {
		this.nbhCm = nbhCm;
	}

	public BigDecimal getNbhTd() {
		return this.nbhTd;
	}

	public void setNbhTd(BigDecimal nbhTd) {
		this.nbhTd = nbhTd;
	}

	public BigDecimal getNbhTp() {
		return this.nbhTp;
	}

	public void setNbhTp(BigDecimal nbhTp) {
		this.nbhTp = nbhTp;
	}

	public String getSemestre() {
		return this.semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Formation getFormation() {
		return this.formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

}