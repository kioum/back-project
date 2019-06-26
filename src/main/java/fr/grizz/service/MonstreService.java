package fr.grizz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.grizz.model.Monstre;
import fr.grizz.persistence.MonstreDAO;

@Service
public class MonstreService {
	
	@Autowired
	private MonstreDAO monstreDAO;
	
	public List<Monstre> getAll(){
		return monstreDAO.findAll();
	}
}
