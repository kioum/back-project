package fr.grizz.DTOdb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Monster")
public class MonsterDTOdb {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="nom")
	private String name;
	@Column(name="autoattack")
	private int autoattackId;
	@Column(name="skill")
	private int skillId;
	@Column(name="passive")
	private int passiveId;
	@Column(name="pdv")
	private int pdv;
	@Column(name="vit")
	private int vit;
	@Column(name="dep")
	private int dep;
	@Column(name="rarete")
	private String rarete;
	
	public MonsterDTOdb(){}
	
	public MonsterDTOdb(int id, String name, int autoattackId, int skillId, int passiveId, int pdv, int att, int def,
			int vit, int dep, String rarete) {
		super();
		this.id = id;
		this.name = name;
		this.autoattackId = autoattackId;
		this.skillId = skillId;
		this.passiveId = passiveId;
		this.pdv = pdv;
		this.vit = vit;
		this.dep = dep;
		this.rarete = rarete;
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

	public int getAutoattackId() {
		return autoattackId;
	}

	public void setAutoattackId(int autoattackId) {
		this.autoattackId = autoattackId;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public int getPassiveId() {
		return passiveId;
	}

	public void setPassiveId(int passiveId) {
		this.passiveId = passiveId;
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

	public int getDep() {
		return dep;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}

	public String getRarete() {
		return rarete;
	}

	public void setRarete(String rarete) {
		this.rarete = rarete;
	}
}
