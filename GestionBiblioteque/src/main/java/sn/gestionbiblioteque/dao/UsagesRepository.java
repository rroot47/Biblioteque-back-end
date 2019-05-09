package sn.gestionbiblioteque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.gestionbiblioteque.entites.Usages;

public interface UsagesRepository extends JpaRepository<Usages, Long>{

}
