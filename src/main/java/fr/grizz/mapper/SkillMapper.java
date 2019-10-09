package fr.grizz.mapper;

import fr.grizz.DTOdb.SkillDTOdb;
import fr.grizz.model.Skill;
import fr.grizz.util.Zone;

public class SkillMapper {
	public static Skill skillDTOdbToSkill(SkillDTOdb skillDTOdb) {
		Skill skill = new Skill();
		skill.setId(skillDTOdb.getId());
		skill.setBoostMalus(skillDTOdb.getBoostMalus());
		skill.setCooldown(skillDTOdb.getCooldown());
		skill.setDamage(skillDTOdb.getDamage());
		skill.setName(skillDTOdb.getName());
		skill.setScope(skillDTOdb.getScope());
		skill.setZone(Zone.valueOf(skillDTOdb.getZone().toUpperCase()));
		
		return skill;
	}
}
