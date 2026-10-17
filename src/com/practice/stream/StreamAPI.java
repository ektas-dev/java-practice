package com.practice.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

		// From a supplier
		Stream<String> generated = Stream.generate(() -> "+");
		List<String> strings1 = generated.limit(5L).toList();
		System.out.println(strings1);

		// Creating a Stream from a UnaryOperator and a Seed
		Stream<String> string2 = Stream.iterate("+", s -> s + "+");
		string2.limit(5L).forEach(System.out::println);

		Stream<String> string3 = Stream.iterate("+", s -> s.length() <= 5, s -> s + "+");
		string3.forEach(System.out::println);

		// Creating a Stream from a Range of Numbers
		String[] str3 = { "A", "B", "C", "D" };
		List<String> l1 = IntStream.range(0, 10).mapToObj(index -> str3[index % str3.length])
				.collect(Collectors.toList());
		System.out.println(l1);

		// Creating a Stream of Random Numbers
		Stream<String> s1 = Stream.iterate("1", s -> s.length() <= 5, s -> s + "+");
		s1.forEach(System.out::println);

		// Creating Streams from a Regular Expression
		String str4 = "For there is good news yet to hear and fine things to be seen.";
		String[] elements = str4.split(str4);
		Stream<String> stream = Arrays.stream(elements);
		System.out.println(stream.toList());
		
	}

}
