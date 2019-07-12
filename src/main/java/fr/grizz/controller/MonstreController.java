package fr.grizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.grizz.model.Monstre;
import fr.grizz.service.MonstreService;

@RestController
@RequestMapping("/monstres")
public class MonstreController {
	@Autowired
	private MonstreService monstreService;

    @GetMapping()
    public List<Monstre> getAllMonsters() {
        return monstreService.getAll();
    }
    
    @GetMapping("/{userId}")
    public List<Monstre> getAllMonsters(@PathVariable int userId) {
        return monstreService.getAll();
    }
}
