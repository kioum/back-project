package fr.grizz.DTOdb;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Skill")
public class SkillDTOdb {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="cooldown")
	private int cooldown;
	@Column(name="zone")
	private String zone;
	@Column(name="scope")
	private int scope;
	@Column(name="damage")
	private int damage;
	@Column(name="boost_malus")
	private String boostMalus;

	public SkillDTOdb() { }

	public SkillDTOdb(int id, String name, int cooldown, String zone, int scope, int damage,
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
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
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
		SkillDTOdb other = (SkillDTOdb) obj;
		return Objects.equals(boostMalus, other.boostMalus) && cooldown == other.cooldown && damage == other.damage
				&& id == other.id && Objects.equals(name, other.name) && scope == other.scope
				&& Objects.equals(zone, other.zone);
	}

}
