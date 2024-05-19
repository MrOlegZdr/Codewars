package com.project.home.codewars.eightiesKids2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

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
		 * .......... .......... .......... .......X.. .......... .......... In this
		 * example: findSpaceship(map) => "[7, 2]" If you cannot find the spaceship, the
		 * result should be: "Spaceship lost forever."
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

	public static String[] getSocks(String name, String[] socks) {

		/*
		 * Punky loves wearing different colored socks, but Henry can't stand it.
		 * 
		 * Given an array of different colored socks, return a pair depending on who was
		 * picking them out.
		 * 
		 * Example:
		 * 
		 * getSocks("Punky", ["red","blue","blue","green"]) -> ["red", "blue"]
		 * 
		 * Note that Punky can have any two colored socks, in any order, as long as they
		 * are different and both exist. Henry always picks a matching pair.
		 * 
		 * If there is no possible combination of socks, return an empty array.
		 */

		String[] result = new String[0];

		if ((socks != null) && (socks.length > 1)) {
			result = new String[2];

			if (name.equalsIgnoreCase("Punky")) {
				result[0] = socks[0];
				result[1] = socks[1];
			} else if (name.equalsIgnoreCase("Henry")) {
				// Create and populate LinkedHashMap with the number of different socks
				LinkedHashMap<String, Integer> socksKind = new LinkedHashMap<>();
				for (String sock : socks) {
					if (!socksKind.containsKey(sock)) {
						socksKind.put(sock, 1);
					} else {
						socksKind.put(sock, socksKind.get(sock) + 1);
					}
				}
				Iterator<Map.Entry<String, Integer>> iterator = socksKind.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry<String, Integer> entry = iterator.next();
					if (entry.getValue() >= 2) {
						result[0] = entry.getKey();
						result[1] = entry.getKey();
						break;
					}
				}
			}

		}

		return result;
	}

}
