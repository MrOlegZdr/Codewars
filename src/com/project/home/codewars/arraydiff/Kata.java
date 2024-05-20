package com.project.home.codewars.arraydiff;

import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Kata {

	public static int[] arrayDiff(int[] a, int[] b) {

		/*
		 * Your goal in this kata is to implement a difference function, which subtracts
		 * one list from another and returns the result.
		 * 
		 * It should remove all values from list a, which are present in list b keeping
		 * their order.
		 * 
		 * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2} If a value
		 * is present in b, all of its occurrences must be removed from the other:
		 * 
		 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
		 * 
		 */

		List<Integer> aAsList = new ArrayList<>();
		Set<Integer> bAsSet = new LinkedHashSet<>();

		// Populate list with elements from a
		for (int number : a) {
			aAsList.add(number);
		}

		// Create a set with no-repeating elements from b
		for (int number : b) {
			bAsSet.add(number);
		}

		aAsList.removeAll(bAsSet);

		a = new int[aAsList.size()];
		for (int i = 0; i < a.length; i++) {
			a[i] = aAsList.get(i);
		}

		return a;
	}

}