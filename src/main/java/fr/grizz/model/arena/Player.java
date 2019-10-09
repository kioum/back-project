package fr.grizz.model.arena;

import java.util.List;

import fr.grizz.model.Monster;

public class Player {
	private int id;
	private String name;
	private List<MonsterInArena> deckMonsters;
	
	public Player(int id, String name, List<Monster> deckMonsters) {
		this.id = id;
		this.name = name;
		deckMonsters.stream().forEach((monster) -> this.deckMonsters.add(new MonsterInArena(monster)));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MonsterInArena> getDeckMonsters() {
		return deckMonsters;
	}

	public void setDeckMonsters(List<MonsterInArena> deckMonsters) {
		this.deckMonsters = deckMonsters;
	}
	
}
