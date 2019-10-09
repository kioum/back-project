package fr.grizz.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.grizz.DTOdb.MonsterDTOdb;

@Repository
public interface MonsterDAO extends JpaRepository<MonsterDTOdb, Integer> {
	
}