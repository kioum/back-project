package fr.grizz.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.grizz.DTOdb.MonsterDTOdb;
import fr.grizz.model.Monster;
import fr.grizz.service.SkillService;

@Component
public class MonsterMapper {

	private static SkillService skillService;
	
	@Autowired
	private MonsterMapper(SkillService skillService) {
		MonsterMapper.skillService = skillService;
	}

	public static List<Monster> listMonsterDTOdbToMonster(List<MonsterDTOdb> listMonsterDTOdb) {
		List<Monster> listMonster = new ArrayList<Monster>();

		listMonsterDTOdb.stream().forEach((monsterDTOdb) -> listMonster.add(monsterDTOdbToMonster(monsterDTOdb)));

		return listMonster;
	}

	public static Monster monsterDTOdbToMonster(MonsterDTOdb monsterDTOdb) {
		Monster monster = new Monster();

		if(monsterDTOdb != null) {
			monster.setId(monsterDTOdb.getId());
			monster.setName(monsterDTOdb.getName());
			monster.setAutoattack(skillService.findById(monsterDTOdb.getAutoattackId()));
			monster.setSkill(skillService.findById(monsterDTOdb.getSkillId()));
			monster.setPassive(skillService.findById(monsterDTOdb.getPassiveId()));
			monster.setPdv(monsterDTOdb.getPdv());
			monster.setVit(monsterDTOdb.getVit());
			monster.setMovement(monsterDTOdb.getDep());
			monster.setRarete(monsterDTOdb.getRarete());
		}

		return monster;
	}
}
