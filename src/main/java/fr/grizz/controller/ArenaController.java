package fr.grizz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.grizz.model.arena.Player;
import fr.grizz.service.arena.ArenaService;

@RestController
public class ArenaController {
	
	@Autowired
	private ArenaService arenaService;
	
    @PostMapping("/find")
    public ResponseEntity<Boolean> find(@RequestParam("player") final Player player, @RequestParam("search") final Boolean search) {
		return new ResponseEntity<Boolean>(arenaService.find(player, search), HttpStatus.OK);
    }
}
