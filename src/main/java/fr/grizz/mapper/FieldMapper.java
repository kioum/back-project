package fr.grizz.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.grizz.DTOdb.FieldDTOdb;
import fr.grizz.model.Field;

public class FieldMapper {

	public static Field fieldDTOdbToField(FieldDTOdb fieldDTOdb) {
		if(fieldDTOdb != null) {
			return new Field(fieldDTOdb.getName(), fieldDTOdb.getWidth(), fieldDTOdb.getHeight(), generateSquaresdWithString(fieldDTOdb.getSquares()));
		}
		
		return null;
	}
	
	private static List<List<Integer>> generateSquaresdWithString(String stringSquares) {
		String[] result = Arrays.stream(stringSquares.split(";"))
				.toArray(String[]::new);
		
		List<List<Integer>> squares = new ArrayList<List<Integer>>();
		Arrays.stream(result).forEach((line) -> {
			List<Integer> newLine = new ArrayList<Integer>();
			Arrays.stream(line.split(",")).forEach((value) -> newLine.add(Integer.parseInt(value)));
			}
		);
		
		return squares;
	}
}
