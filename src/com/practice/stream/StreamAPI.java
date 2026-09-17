package com.practice.stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
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

	}
}
