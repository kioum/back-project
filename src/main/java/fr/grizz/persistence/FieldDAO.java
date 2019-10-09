package fr.grizz.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.grizz.DTOdb.FieldDTOdb;

@Repository
public interface FieldDAO extends JpaRepository<FieldDTOdb, Integer> {
	@Query("SELECT * FROM field ORDER BY RAND();")
	Optional<FieldDTOdb> findRandom();
}