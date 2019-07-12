package fr.grizz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Monstre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="nom")
	private String name;
	@Column(name="pdv")
	private int pdv;
	@Column(name="att")
	private int att;
	@Column(name="def")
	private int def;
	@Column(name="vit")
	private int vit;
	@Column(name="dep")
	private int dep;
	@Column(name="rarete")
	private String rarete;
	
	public Monstre(){}
	
	public Monstre(int id, String nom, int pdv, int att, int def, int vit, int dep, String rarete) {
		super();
		this.id = id;
		this.name = nom;
		this.pdv = pdv;
		this.att = att;
		this.def = def;
		this.vit = vit;
		this.dep = dep;
		this.rarete = rarete;
	}

	public int getPdv() {
		return pdv;
	}

	public int getAtt() {
		return att;
	}

	public int getDef() {
		return def;
	}

	public int getVit() {
		return vit;
	}

	public int getDep() {
		return dep;
	}

	public String getRarete() {
		return rarete;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
