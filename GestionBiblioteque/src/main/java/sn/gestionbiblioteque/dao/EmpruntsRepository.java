package sn.gestionbiblioteque.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.gestionbiblioteque.entites.Emprunts;


public interface EmpruntsRepository extends JpaRepository<Emprunts, Long> {
    @Query("select e from Emprunts e where e.dateEmprunts>:d")
	List<Emprunts> enCours(@Param("d")Date date);
    @Query("select e from Emprunts e order by e.idEmprunt DESC")
	List<Emprunts> histo();

}
