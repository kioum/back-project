package fr.grizz.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.grizz.DTOdb.SkillDTOdb;

@Repository
public interface SkillDAO extends JpaRepository<SkillDTOdb, Integer> {

}
