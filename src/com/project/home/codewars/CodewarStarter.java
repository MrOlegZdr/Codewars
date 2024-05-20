package com.project.home.codewars;

import java.util.Arrays;

import com.project.home.codewars.arraydiff.Kata;
import com.project.home.codewars.eightiesKids2.EightiesKids2;

public class CodewarStarter {

	public static void main(String[] args) {

		// Run findSpaceship
//		checkFindSpaceship();

		// Run checkSocks
//		checkSocks();

		// Run arrayDiff
		checkArrayDiff();
	}

	private static void checkFindSpaceship() {

		String resultShip = EightiesKids2.findSpaceship("...\n...\n..X\n...\n...\n...");
		System.out.println(resultShip);

	}

	private static void checkSocks() {

		String[] resultSocksPunky = EightiesKids2.getSocks("Punky", new String[] { "red", "blue", "blue", "green" });
		String[] resultSocksHenry = EightiesKids2.getSocks("Henry", new String[] { "red", "blue", "blue", "green" });
		String[] resultSocks = EightiesKids2.getSocks("Punky", new String[] { "red", "red", "blue" });

		System.out.println(Arrays.toString(resultSocksPunky));
		System.out.println(Arrays.toString(resultSocksHenry));
		System.out.println(Arrays.toString(resultSocks));

	}

	private static void checkArrayDiff() {

		int[] a = new int[] { 1, 2, 2, 2, 3 };
		int[] b = new int[] { 2, 4 };

		System.out.println(Arrays.toString(Kata.arrayDiff(a, b)));
	}

}
