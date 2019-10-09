package fr.grizz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.grizz.DTOdb.MonsterDTOdb;
import fr.grizz.mapper.MonsterMapper;
import fr.grizz.model.Monster;
import fr.grizz.persistence.MonsterDAO;

@Service
public class MonsterService {
	
	@Autowired
	private MonsterDAO monsterDAO;
	
	public List<Monster> getAll(){
		List<MonsterDTOdb> listMonsterDTOdb = monsterDAO.findAll();
		return MonsterMapper.listMonsterDTOdbToMonster(listMonsterDTOdb);
	}
}
