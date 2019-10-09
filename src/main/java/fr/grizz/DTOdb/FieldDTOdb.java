package fr.grizz.DTOdb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Field")
public class FieldDTOdb {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="width")
	private int width;
	@Column(name="height")
	private int height;
	
	/*
	 * squares define by ',' separate column and ';' separate line
	 */
	@Column(name="squares")
	private String squares;
	
	public FieldDTOdb(){}
	
	public FieldDTOdb(Integer id, String name, int width, int height, String squares) {
		this.id = id;
		this.name = name;
		this.width = width;
		this.height = height;
		this.squares = squares;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getSquares() {
		return squares;
	}

	public void setSquare(String squares) {
		this.squares = squares;
	}
}
