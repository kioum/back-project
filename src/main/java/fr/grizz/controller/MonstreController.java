package fr.grizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.grizz.model.Monstre;
import fr.grizz.service.MonstreService;

@RestController
@RequestMapping("/monstres")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MonstreController {
	@Autowired
	private MonstreService monstreService;

    @GetMapping()
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Monstre> sayHello() {
        return monstreService.getAll();
    }
}
