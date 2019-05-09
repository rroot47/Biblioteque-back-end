package sn.gestionbiblioteque.sec;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import sn.gestionbiblioteque.dao.LivresRepository;
import sn.gestionbiblioteque.entites.Livres;

public class LivreService {
	@Autowired
	LivresRepository livreRepo;
	@PostMapping(value="ajoutLivre")
public Livres addLivre(@RequestBody Livres livre)
{
	return livreRepo.save(livre);
}
	@GetMapping(value="listeComplete")
	public List<Livres> listLivrs()
	{
		return livreRepo.findAll();
	}
	@GetMapping(value="rechercher")
	public Livres rechercher(@RequestParam("id") long id)
	{
		return livreRepo.findOne(id);
	}
	@DeleteMapping(value="supprimer")
	public void supprimer(@RequestParam("id") Long id)
	{
	  livreRepo.delete(id);
	}
	@PostMapping(value="updateLivre")
	public Livres updateLivre(@RequestBody Livres livre,@RequestParam("id") long key)
	{
		livre.setIdLivre(key);
		return livreRepo.save(livre);
	}
}
