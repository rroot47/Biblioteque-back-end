package sn.gestionbiblioteque.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Usages implements Serializable {

	@Id @GeneratedValue
	private Long idUsages;
	private String nomUsages;
	private String prenomUsages;
	
	public Usages(String nomUsages, String prenomUsages) {
		super();
		this.nomUsages = nomUsages;
		this.prenomUsages = prenomUsages;
	}

	public Usages() {
		super();
	}

	public Long getIdUsages() {
		return idUsages;
	}

	public void setIdUsages(Long idUsages) {
		this.idUsages = idUsages;
	}

	public String getNomUsages() {
		return nomUsages;
	}

	public void setNomUsages(String nomUsages) {
		this.nomUsages = nomUsages;
	}

	public String getPrenomUsages() {
		return prenomUsages;
	}

	public void setPrenomUsages(String prenomUsages) {
		this.prenomUsages = prenomUsages;
	}
	
	
}
