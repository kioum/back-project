package fr.grizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.grizz.model.Monster;
import fr.grizz.service.MonsterService;

@RestController
@RequestMapping("/websocket/monster")
public class MonsterSocketController {
	@Autowired
	private MonsterService monsterService;

	@MessageMapping()
	@SendTo("/topic/monsters")
    public ResponseEntity<List<Monster>> getAllMonsters() {
        return new ResponseEntity<List<Monster>>(monsterService.getAll(), HttpStatus.OK);
    }
    
	@MessageMapping("/{userId}")
    public ResponseEntity<List<Monster>> getAllMonsters(@PathVariable int userId) {
    	return new ResponseEntity<List<Monster>>(monsterService.getAll(), HttpStatus.OK);
    }
}
