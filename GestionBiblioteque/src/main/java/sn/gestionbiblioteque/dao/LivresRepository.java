package sn.gestionbiblioteque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.gestionbiblioteque.entites.Livres;

public interface LivresRepository  extends JpaRepository<Livres, Long>{

}
