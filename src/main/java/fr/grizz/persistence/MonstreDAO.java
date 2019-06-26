package fr.grizz.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.grizz.model.Monstre;

@Repository
public interface MonstreDAO extends JpaRepository<Monstre, Integer> {
	
}