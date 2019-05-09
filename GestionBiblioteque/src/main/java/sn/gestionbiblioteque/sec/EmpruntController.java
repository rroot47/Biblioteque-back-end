package sn.gestionbiblioteque.sec;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sn.gestionbiblioteque.dao.EmpruntsRepository;
import sn.gestionbiblioteque.dao.ExemplaireRepository;
import sn.gestionbiblioteque.dao.UsagesRepository;
import sn.gestionbiblioteque.entites.Emprunts;
import sn.gestionbiblioteque.entites.ExemplaireLivres;
import sn.gestionbiblioteque.entites.Usages;

@RestController
public class EmpruntController {
	@Autowired
	ExemplaireRepository exemplaireRepo;
	@Autowired
	UsagesRepository usageRepo;
	@Autowired
	EmpruntsRepository empruntsRepo;
public Emprunts ajoutEmprunt(@RequestParam("exemplaire") long exemp,@RequestParam("usager") long usager)
{
	Usages us=usageRepo.findOne(usager);
	ExemplaireLivres ep=exemplaireRepo.findOne(exemp);
	Emprunts e=new  Emprunts();
	e.setUsages(us);
	e.setExemplaireLivres(ep);
	e.setDateEmprunts(new Date());
	e.setRendu(false);
	return empruntsRepo.save(e);
}
public void rendreLivre(@RequestParam("idEmprunt") long id)
{
	Emprunts e=empruntsRepo.findOne(id);
	e.setRendu(true);
	empruntsRepo.save(e);
}
public List<Emprunts> empruntEncours()
{
	return empruntsRepo.enCours(new Date());
}
public List<Emprunts> historiqueEmprunts()
{
	return empruntsRepo.histo();
}
}
