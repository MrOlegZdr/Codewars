package com.project.home.codewars.eightiesKids2;

import java.util.Arrays;

public class CodewarStarterEightiesKids2 {

	public static void main(String[] args) {

		String resultShip = EightiesKids2.findSpaceship("...\n...\n..X\n...\n...\n...");
		System.out.println(resultShip);

		String[] resultSocksPunky = EightiesKids2.getSocks("Punky", new String[] { "red", "blue", "blue", "green" });
		String[] resultSocksHenry = EightiesKids2.getSocks("Henry", new String[] { "red", "blue", "blue", "green" });
		String[] resultSocks = EightiesKids2.getSocks("Punky", new String[] { "red", "red", "blue"});
		
		System.out.println(Arrays.toString(resultSocksPunky));
		System.out.println(Arrays.toString(resultSocksHenry));
		System.out.println(Arrays.toString(resultSocks));
		
	}

}
