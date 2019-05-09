package sn.gestionbiblioteque.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity
public class ExemplaireLivres implements Serializable{

	@Id @GeneratedValue
	private Long idExemplaire;
	private Date datedecreation;
	private String imprimerie;
	@ManyToOne
	@JsonIgnore
	private Livres livres;
	
	public ExemplaireLivres(Date datedecreation, String imprimerie, Livres livres) {
		super();
		this.datedecreation = datedecreation;
		this.imprimerie = imprimerie;
		this.livres = livres;
	}

	public ExemplaireLivres() {
		super();
	}

	public Long getIdExemplaire() {
		return idExemplaire;
	}

	public void setIdExemplaire(Long idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	public Date getDatedecreation() {
		return datedecreation;
	}

	public void setDatedecreation(Date datedecreation) {
		this.datedecreation = datedecreation;
	}

	public String getImprimerie() {
		return imprimerie;
	}

	public void setImprimerie(String imprimerie) {
		this.imprimerie = imprimerie;
	}

	public Livres getLivres() {
		return livres;
	}

	public void setLivres(Livres livres) {
		this.livres = livres;
	}
	
	
	
}
