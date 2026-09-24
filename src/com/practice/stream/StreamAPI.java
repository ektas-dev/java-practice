package com.practice.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {

		List<String> strings = List.of("one", "two", "three", "four");
		Function<String, Integer> toLength = String::length;
		Stream<Integer> ints = strings.stream().map(toLength);
		System.out.println(ints);

		List<Integer> lengths = strings.stream().map(String::length).toList();
		System.out.println(lengths);

		IntSummaryStatistics stats = strings.stream().mapToInt(String::length).summaryStatistics();
		System.out.println("stats = " + stats);

		// Creating Stream
		// From empty factory method
		Stream<String> estr = Stream.empty();
		List<String> eList = estr.toList();
		System.out.println(eList);

		// From varargs or array
		Stream<Integer> astr = Stream.of(1, 2, 3);
		List<Integer> aList = astr.toList();
		System.out.println(aList);

		String[] arr = { "one", "two", "three" };
		Stream<String> astr1 = Arrays.stream(arr);
		List<String> alist1 = astr1.collect(Collectors.toList());
		System.out.println(alist1);

	}
}
