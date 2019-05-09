package sn.gestionbiblioteque.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sn.gestionbiblioteque.dao.ExemplaireRepository;
import sn.gestionbiblioteque.dao.LivresRepository;
import sn.gestionbiblioteque.entites.ExemplaireLivres;
import sn.gestionbiblioteque.entites.Livres;

@RestController
public class ExempleController {
	@Autowired
	ExemplaireRepository exempleRepo;
	@Autowired
	LivresRepository livreRepo;
	@PostMapping(value="addExempalire")
public ExemplaireLivres addEx(@RequestBody ExemplaireLivres exemplaire,@RequestParam("livre")long livreId)
{
	Livres livre=livreRepo.findOne(livreId);
	if(livre==null)
		return null;
	exemplaire.setLivres(livre);
	return exempleRepo.save(exemplaire);
}
	@DeleteMapping(value="deleteExemplaire")
	public void deleteEx(@RequestParam("id") long id)
	{
		exempleRepo.delete(id);
	}
}
