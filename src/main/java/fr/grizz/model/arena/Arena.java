package fr.grizz.model.arena;

import fr.grizz.model.Field;

public class Arena {
	private Player player1;
	private Player player2;
	private Field field;
	
	public Arena(Player player1, Player player2, Field field) {
		this.player1 = player1;
		this.player2 = player2;
		this.field = field;
	}
	
	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}
}
