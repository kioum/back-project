package fr.grizz.model.arena;

import fr.grizz.model.Monster;

public class MonsterInArena extends Monster{
	
	private int x, y;
	private int pdvMax;
	private int movementMax;
	
	public MonsterInArena(Monster m) {
		super(m);
		this.x = -1;
		this.y = -1;
		this.pdvMax = m.getPdv();
		this.movementMax = m.getMovement();
	}
	
	public int getMovementMax() {
		return movementMax;
	}

	public void setMovementMax(int movementMax) {
		this.movementMax = movementMax;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPdvMax() {
		return pdvMax;
	}

	public void setPdvMax(int pdvMax) {
		this.pdvMax = pdvMax;
	}
	
}
