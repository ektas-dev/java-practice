package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamFunctionalInterface {
	public static void main(String[] args) {

		// Functional Interfaces
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

		// Collection in stream
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		Stream<Integer> stream = list.stream();
		stream.forEach((elem) -> {
			System.out.println(elem);
		});

		// another way
		list.stream().forEach((elem) -> System.out.println(elem));

		System.out.println("Even in the list");
		// even elements
		list.stream().filter((n) -> n % 2 == 0).forEach(elem -> System.out.println(elem));

		// square of numbers
		System.out.println("Square of the list");
		list.stream().map((elem) -> elem * elem).forEach(elem -> System.out.println(elem));

		// even number square
		System.out.println("Square of even");
		list.stream().filter(elem -> elem % 2 == 0).map(elem -> elem * elem).forEach(elem -> System.out.println(elem));
		System.out.println();

		// Example - print employee whose department is tech
		List<Employee> employee = Arrays.asList(new Employee(1, "Rahul Sharma", "Tech"),
				new Employee(2, "Priya Patel", "HR"), new Employee(3, "Amit Verma", "Finance"),
				new Employee(4, "Sneha Kulkarni", "Marketing"), new Employee(5, "Vikram Singh", "Sales"),
				new Employee(6, "Ananya Desai", "Tech"), new Employee(7, "Rohit Mehta", "Finance"),
				new Employee(8, "Neha Joshi", "HR"), new Employee(9, "Karan Malhotra", "Tech"),
				new Employee(10, "Pooja Reddy", "Marketing"));

		employee.stream().filter((emp) -> emp.getDepartment().equals("Tech")).map(emp -> emp.getName())
				.forEach(name -> System.out.println(name));

		// Converting back into a data structure
		List<String> names = employee.stream().filter((emp) -> emp.getDepartment().equals("Tech"))
				.map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(names);

		// same for set in above example

		// convert into map list -> map
		Function<Employee, Integer> keyf1 = emp -> emp.getId();
		Function<Employee, String> valuef2 = emp -> emp.getName();

		Map<Integer, String> empMap = employee.stream().collect(Collectors.toMap(keyf1, valuef2));
		System.out.println("Employee Map" + empMap);

		// intermediary and terminal
		long count = list.stream().filter((n) -> n % 2 == 0).map((elem) -> elem * elem).count();
		System.out.println(count);

		// note - once a stream is consumed it cannot be reused once you called ternary
		// operation

		// note - intermediate operations are lazy loaded meaning they are not called
		// until you call ternary operation

		// More Stream methods
		List<String> nameList = new ArrayList<>(
				Arrays.asList("Aman", "Raj", "Rohit", "Riya", "Rahul", "Ankit", "Rina"));
		// Optional<String> first = nameList.stream().findFirst();
		// Optional<String> first = nameList.stream().filter(name ->
		// name.startsWith("R")).findFirst();
		Optional<String> first = nameList.stream().filter(name -> name.startsWith("R")).findAny();
		System.out.println(first.get());

		// boolean value = nameList.stream().anyMatch(str -> str.startsWith("Q"));
		// boolean value = nameList.stream().allMatch(str -> str.startsWith("Q"));
		boolean value = nameList.stream().noneMatch(str -> str.startsWith("Q"));
		System.out.println(value);

		// sorted method - intermediary
		List<Integer> num = new ArrayList<>(Arrays.asList(21, 12, 33, 4, 67, 81, 3));
		num.stream().sorted().forEach(n -> System.out.println(n));

		// Primitive Stream
		IntStream intStream = IntStream.range(1, 6);
//		OptionalDouble average = intStream.average();
//		System.out.println(average.getAsDouble());

		int sum = intStream.sum();
		System.out.println(sum);

		DoubleStream doubleStream = DoubleStream.of(1.5, 4.1, 2.4, 6.4, 7.8);
		System.out.println(doubleStream.average().getAsDouble());

		LongStream longStream = LongStream.of(1, 2, 3);
		System.out.println(longStream.count());

		// Parallel stream
		List<String> nameList2 = new ArrayList<>(
				Arrays.asList("Aman", "Raj", "Rohit", "Riya", "Rahul", "Ankit", "Rina"));
		nameList2.parallelStream().filter(nam -> nam.startsWith("R")).forEach(nam -> System.out.println(nam));
	}
}

class Employee {

	int id;
	String name;
	String department;

	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
