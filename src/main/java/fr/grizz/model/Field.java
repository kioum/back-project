package fr.grizz.model;

import java.util.List;

public class Field {

	private String name;
	private int width;
	private int height;
	
	/*
	 * 0 : disable
	 * 1 : walkable Player 1
	 * 2 : spawn Player 1
	 * 3 : walkable Player 2
	 * 4 : spawn Player 2
	 * 5 : empty
	 */
	private List<List<Integer>> squares;
	
	public Field(String name, int width, int height, List<List<Integer>> squares) {
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

	public Integer getSquare(int x, int y) {
		return squares.get(x).get(y);
	}

	public void setSquare(int x, int y, int value) {
		squares.get(x).set(y, value);
	}

}
