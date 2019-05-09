package sn.gestionbiblioteque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.gestionbiblioteque.entites.ExemplaireLivres;

public interface ExemplaireRepository  extends JpaRepository<ExemplaireLivres, Long>{

}
