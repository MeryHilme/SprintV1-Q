package fr.univbrest.dosi.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="authentification")
@NamedQueries({
@NamedQuery(name="Authentification.findAll", query="SELECT a FROM Authentification a"),
@NamedQuery(name="Authentification.findByLoginConnection", query="SELECT a FROM Authentification a where a.loginConnection =?1 and a.motPasse=?2 and a.role=?3"),
@NamedQuery(name="Authentification.findByPseudoConnection", query="SELECT a FROM Authentification a where a.pseudoConnection =?1 and a.motPasse=?2 and a.role=?3")
})
public class Authentification implements Serializable {

	private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID_CONNECTION")
    private Integer idConnection;
    @Column(name = "ROLE")
    private String role;
    @Column(name = "LOGIN_CONNECTION")
    private String loginConnection;
    @Column(name = "PSEUDO_CONNECTION")
    private String pseudoConnection;
    @Column(name = "MOT_PASSE")
    private String motPasse;
    @JoinColumn(name = "NO_Etudiant", referencedColumnName = "NO_Etudiant")
    @ManyToOne
    private Etudiant noEtudiant;
    @JoinColumn(name = "NO_ENSEIGNANT", referencedColumnName = "NO_ENSEIGNANT")
    @ManyToOne
    private Enseignant noEnseignant;

    public Authentification() {
    }

    public Authentification(Integer idConnection) {
        this.idConnection = idConnection;
    }

    public Authentification(Integer idConnection, String role, String loginConnection) {
        this.idConnection = idConnection;
        this.role = role;
        this.loginConnection = loginConnection;
    }

    public Integer getIdConnection() {
        return idConnection;
    }

    public void setIdConnection(Integer idConnection) {
        this.idConnection = idConnection;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLoginConnection() {
        return loginConnection;
    }

    public void setLoginConnection(String loginConnection) {
        this.loginConnection = loginConnection;
    }

    public String getPseudoConnection() {
        return pseudoConnection;
    }

    public void setPseudoConnection(String pseudoConnection) {
        this.pseudoConnection = pseudoConnection;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public Etudiant getNoEtudiant() {
        return noEtudiant;
    }

    public void setNoEtudiant(Etudiant noEtudiant) {
        this.noEtudiant = noEtudiant;
    }

    public Enseignant getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Enseignant noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

 

 
    
}