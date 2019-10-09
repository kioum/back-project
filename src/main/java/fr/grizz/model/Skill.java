package fr.grizz.model;

import java.util.Objects;

import fr.grizz.util.Zone;

public class Skill {

	private int id;
	private String name;
	private int cooldown;
	private Zone zone;
	private int scope;
	private int damage;
	private String boostMalus;
	private String description;
	
	public Skill() { }
	
	public Skill(int id, String name, int cooldown, Zone zone, int scope, int damage,
			String boostMalus) {
		super();
		this.id = id;
		this.name = name;
		this.cooldown = cooldown;
		this.zone = zone;
		this.scope = scope;
		this.damage = damage;
		this.boostMalus = boostMalus;
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
	public int getCooldown() {
		return cooldown;
	}
	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public int getScope() {
		return scope;
	}
	public void setScope(int scope) {
		this.scope = scope;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public String getBoostMalus() {
		return boostMalus;
	}
	public void setBoostMalus(String boostMalus) {
		this.boostMalus = boostMalus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(boostMalus, cooldown, damage, id, name, scope, zone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skill other = (Skill) obj;
		return Objects.equals(boostMalus, other.boostMalus) && cooldown == other.cooldown && damage == other.damage
				&& id == other.id && Objects.equals(name, other.name) && scope == other.scope
				&& Objects.equals(zone, other.zone);
	}
	
}
