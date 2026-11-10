package com.practice.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TechnicalRoundDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);

		// Removing duplicate
		Set<Integer> newList = new HashSet<>();
		// using loop and a set
		for (int i : numbers) {
			newList.add(i);
		}
		System.out.println(newList);

		List<Integer> list = numbers.stream().distinct().toList();
		System.out.println(list);

		// Finding Duplicate
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for (int i : numbers2) {
			if (!set1.add(i)) {
				duplicate.add(i);
			}
		}
		System.out.println(duplicate);
		List<Integer> list2 = numbers.stream().filter(n -> Collections.frequency(numbers2, n) > 1).distinct()
				.collect(Collectors.toList());
		System.out.println(list2);

		List<Integer> duplicates = numbers.stream().distinct().filter(n -> Collections.frequency(numbers, n) > 1)
				.toList();

		System.out.println(duplicates);

	}
}
