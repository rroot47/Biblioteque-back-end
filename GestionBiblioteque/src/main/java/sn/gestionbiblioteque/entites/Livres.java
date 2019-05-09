package sn.gestionbiblioteque.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Livres  implements Serializable{

	@Id @GeneratedValue
	private Long idLivre;
	private String nomLivre;
	private String auteurLivre;
	
	public Livres(String nomLivre, String auteurLivre) {
		super();
		this.nomLivre = nomLivre;
		this.auteurLivre = auteurLivre;
	}

	public Livres() {
		super();
	}

	public Long getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(Long idLivre) {
		this.idLivre = idLivre;
	}

	public String getNomLivre() {
		return nomLivre;
	}

	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}

	public String getAuteurLivre() {
		return auteurLivre;
	}

	public void setAuteurLivre(String auteurLivre) {
		this.auteurLivre = auteurLivre;
	}
	
	
	
}
