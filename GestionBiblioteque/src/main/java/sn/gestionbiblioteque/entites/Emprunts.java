package sn.gestionbiblioteque.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Emprunts implements Serializable{

	@Id @GeneratedValue
	private Long idEmprunt;
	private Date dateEmprunts;
	private Date dateRetours;
	@ManyToOne
	private ExemplaireLivres exemplaireLivres;
	@ManyToOne
	private Usages usages;
	
	public Emprunts(Date dateEmprunts, Date dateRetours, ExemplaireLivres exemplaireLivres, Usages usages) {
		super();
		this.dateEmprunts = dateEmprunts;
		this.dateRetours = dateRetours;
		this.exemplaireLivres = exemplaireLivres;
		this.usages = usages;
	}
	private boolean rendu;

	public boolean isRendu() {
		return rendu;
	}

	public void setRendu(boolean rendu) {
		this.rendu = rendu;
	}

	public Emprunts() {
		super();
	}

	public Long getIdEmprunt() {
		return idEmprunt;
	}

	public void setIdEmprunt(Long idEmprunt) {
		this.idEmprunt = idEmprunt;
	}

	public Date getDateEmprunts() {
		return dateEmprunts;
	}

	public void setDateEmprunts(Date dateEmprunts) {
		this.dateEmprunts = dateEmprunts;
	}

	public Date getDateRetours() {
		return dateRetours;
	}

	public void setDateRetours(Date dateRetours) {
		this.dateRetours = dateRetours;
	}

	public ExemplaireLivres getExemplaireLivres() {
		return exemplaireLivres;
	}

	public void setExemplaireLivres(ExemplaireLivres exemplaireLivres) {
		this.exemplaireLivres = exemplaireLivres;
	}

	public Usages getUsages() {
		return usages;
	}

	public void setUsages(Usages usages) {
		this.usages = usages;
	}
	
	
}
