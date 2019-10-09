package fr.grizz.service.arena;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.grizz.model.arena.Arena;
import fr.grizz.model.arena.Player;

@Service
public class ArenaService {
	
	private List<Player> playerSearchingArena;
	private List<Arena> arenaInGame;
	
	@Autowired
	private FieldService fieldService;

	/** 
	 * Search a arena, if userId not in pull of userId add him
	 * if 
	 * @param userId
	 * @param search
	 * @return True if a Arena enable else false
	 */
	public synchronized Boolean find(Player player, Boolean search) {
		if(!playerSearchingArena.isEmpty()) {
			createArena(player, playerSearchingArena.get(0));
			return true;
		}
			
		if(search && playerSearchingArena.get(player.getId()) == null) {
			playerSearchingArena.add(player);
		}
		
		return false;
	}
	
	public void createArena(Player player1, Player player2) {
		arenaInGame.add(new Arena(player1, player2, fieldService.findAField()));
	}
}
