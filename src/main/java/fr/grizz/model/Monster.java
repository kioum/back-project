package fr.grizz.model;

public class Monster {
	
	private int id;
	private String name;
	private Skill autoattack;
	private Skill skill;
	private Skill passive;
	private int pdv;
	private int vit;
	private int movement;
	private String rarete;
	
	public Monster(){}
	
	public Monster(int id, String name, Skill autoattack, Skill skill, Skill passive, int pdv, int vit, int movement, String rarete) {
		super();
		this.id = id;
		this.name = name;
		this.autoattack = autoattack;
		this.skill = skill;
		this.passive = passive;
		this.pdv = pdv;
		this.vit = vit;
		this.movement = movement;
		this.rarete = rarete;
	}
	
	public Monster(Monster m) {
		super();
		this.id = m.id;
		this.name = m.name;
		this.autoattack = m.autoattack;
		this.skill = m.skill;
		this.passive = m.passive;
		this.pdv = m.pdv;
		this.vit = m.vit;
		this.movement = m.movement;
		this.rarete = m.rarete;
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

	public Skill getAutoattack() {
		return autoattack;
	}

	public void setAutoattack(Skill autoattack) {
		this.autoattack = autoattack;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Skill getPassive() {
		return passive;
	}

	public void setPassive(Skill passive) {
		this.passive = passive;
	}

	public int getPdv() {
		return pdv;
	}

	public void setPdv(int pdv) {
		this.pdv = pdv;
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	public String getRarete() {
		return rarete;
	}

	public void setRarete(String rarete) {
		this.rarete = rarete;
	}
}
