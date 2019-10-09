package fr.grizz.service.arena;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.grizz.DTOdb.FieldDTOdb;
import fr.grizz.mapper.FieldMapper;
import fr.grizz.model.Field;
import fr.grizz.persistence.FieldDAO;

public class FieldService {
	@Autowired
	private FieldDAO fieldDAO;

	public Field findAField() {
		Optional<FieldDTOdb> fieldDTOdb = fieldDAO.findRandom();
		if(fieldDTOdb.isPresent()) {
			return FieldMapper.fieldDTOdbToField(fieldDTOdb.get());
		}
		
		return new Field(null, 0, 0, null);
	}

}
