package fr.grizz.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.grizz.DTOdb.SkillDTOdb;
import fr.grizz.mapper.SkillMapper;
import fr.grizz.model.Skill;
import fr.grizz.persistence.SkillDAO;

@Service
public class SkillService {
	
	@Autowired
	private SkillDAO skillDAO;
	
	public Skill findById(Integer id){
		Optional<SkillDTOdb> skillOpt = skillDAO.findById(id);
		if(skillOpt.isPresent()) {
			Skill skill = SkillMapper.skillDTOdbToSkill(skillOpt.get());
			descriptionGenerator(skill);
			return skill;
		}
		
		return new Skill();
	}
	
	private void descriptionGenerator(Skill skill) {
		String description = "";
		
		description += "Cooldown " + skill.getCooldown() + ", ";
		description += "Zone " + skill.getZone() + ", ";
		description += "Scope " + skill.getScope() + ", ";
		description += "Damage " + skill.getDamage() + ".";
		
		skill.setDescription(description);
	}
}
