package com.project.home.codewars.eightiesKids2;

public class EightiesKids2 {

	public static String findSpaceship(String map) {

		/*
		 * Late last night in the Tanner household, ALF was repairing his spaceship so
		 * he might get back to Melmac. Unfortunately for him, he forgot to put on the
		 * parking brake, and the spaceship took off during repair. Now it's hovering in
		 * space.
		 * 
		 * ALF has the technology to bring the spaceship home if he can lock on to its
		 * location.
		 * 
		 * The map will be given in the form of a string with \n separating new lines.
		 * The bottom left of the map is [0, 0]. X is ALF's spaceship. Example map: 
		 * ..........
		 * ..........
		 * ..........
		 * .......X..
		 * ..........
		 * ..........
		 * In this example: findSpaceship(map) => "[7, 2]" If you cannot find the
		 * spaceship, the result should be: "Spaceship lost forever."
		 */

		if (map.contains("X")) {

			/*
			 * Coordinate X - is the difference between the ship's position (X) and the last
			 * line break position minus 1 (since we start counting from 0) Coordinate Y -
			 * is the quantity of line breakers after the ship's position
			 */

			int xPos = map.indexOf('X');
			String mapFromX = map.substring(xPos);
			String mapToX = map.substring(0, xPos);

			int coordY = mapFromX.length() - mapFromX.replace(String.valueOf('\n'), "").length();
			int coordX = (xPos - mapToX.lastIndexOf('\n')) - 1;

			return "[" + coordX + ", " + coordY + "]";
		} else {
			return "Spaceship lost forever.";
		}
	}

}
