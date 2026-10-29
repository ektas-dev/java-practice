package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFunctionalInterface {
	public static void main(String[] args) {
		Predicate<Integer> p1 = (num) -> {
			if (num % 2 == 0) {
				return true;
			}
			return false;
		};

		Function<Integer, Integer> f1 = num -> num * num;

		Consumer<Integer> c1 = (num) -> System.out.println(num);

		Supplier<Integer> s1 = () -> {
			return (int) Math.random();
		};

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		Stream<Integer> stream = list.stream();
		stream.forEach((elem) -> {
			System.out.println(elem);
		});
	}
}
