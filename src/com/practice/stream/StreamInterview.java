package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamInterview {
	public static void main(String[] args) {

		// Remove duplicate and sort them in descending order
		List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 1, 3, 2, 5, 4));
//		Set<Integer> sorted = list.stream().sorted().collect(Collectors.toSet());
//		System.out.println(sorted);

		List<Integer> result = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);

		// find odd numbers return their squares
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		list2.stream().filter(num -> num % 2 != 0).map(num -> num * num).forEach(num -> System.out.println(num));

		// another way - convert them into list
		List<Integer> result2 = list2.stream().filter(num -> num % 2 != 0).map(num -> num * num)
				.collect(Collectors.toList());
		System.out.println(result2);

		// get 2nd and 3rd element and return in a list
		List<Integer> list3 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		List<Integer> result3 = list3.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println(result3);

		// find second highesh in list
		List<Integer> list4 = new ArrayList<>(Arrays.asList(20, 10, 10, 45, 30, 45, 5, 20));
		List<Integer> result4 = list4.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1)
				.collect(Collectors.toList());
		System.out.println(result4);

		// instead of limit we could use findFirst too in above
		Optional<Integer> first = list4.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(first.get());

		// one imp note - in optionsal always keep a check before printing answer what
		// if there is no result it will throw error
		List<Integer> list5 = new ArrayList<>(Arrays.asList(45, 45, 45));
		Optional<Integer> result5 = list5.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if (result5.isPresent()) {
			System.out.println(result5.get());
		}

		// divide numbers into even and odd
		List<Integer> list6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Map<Boolean, List<Integer>> result6 = list6.stream().collect(Collectors.partitioningBy(elem -> elem % 2 == 0));
		System.out.println(result6);

		// find the longest string in list
		List<String> list7 = new ArrayList<>(Arrays.asList("Java", "Spring Boot", "API"));
		Optional<String> result7 = list7.stream().max(Comparator.comparing(elem -> elem.length()));
		if (result7.isPresent()) {
			System.out.println(result7.get());
		}

		// find first employee salary > 50000
		List<Employee2> employee2 = new ArrayList<>(Arrays.asList(new Employee2("Rahul Sharma", "Tech", 50000),
				new Employee2("Priya Patel", "HR", 80000), new Employee2("Amit Verma", "Finance", 60000),
				new Employee2("Sneha Kulkarni", "Marketing", 42000), new Employee2("Vikram Singh", "Sales", 45000),
				new Employee2("Ananya Desai", "Tech", 55000), new Employee2("Rohit Mehta", "Finance", 40000),
				new Employee2("Neha Joshi", "HR", 90000), new Employee2("Karan Malhotra", "Tech", 52000),
				new Employee2("Pooja Reddy", "Marketing", 65000)));

		Optional<Employee2> result8 = employee2.stream().filter(emp -> emp.getSalary() > 50000).findFirst();
		if (result8.isPresent()) {
			System.out.println(result8.get());
		}

		// find top 2 highest paid
		List<Employee2> result9 = employee2.stream().sorted(Comparator.comparingInt(emp -> -1 * emp.getSalary()))
				.limit(2).collect(Collectors.toList());

		System.out.println(result9);

		// sort by salary then by name
		List<Employee2> result10 = employee2.stream().sorted((emp1, emp2) -> {
			if (emp1.getSalary() > emp2.getSalary()) {
				return 1;
			} else if (emp1.getSalary() < emp2.getSalary()) {
				return -1;
			} else {
				return emp1.getName().compareTo(emp2.getName());
			}
		}).collect(Collectors.toList());
		System.out.println(result10);

		// frequency of each element in a list
		List<Integer> list9 = new ArrayList<>(Arrays.asList(3, 2, 3, 4, 4, 1, 2, 1, 1, 1, 5, 6, 5));
		Map<Integer, Long> result11 = list9.stream()
				.collect(Collectors.groupingBy(elem -> elem, Collectors.counting()));
		System.out.println(result11);

		// count employees in each department
		Map<String, Long> result12 = employee2.stream()
				.collect(Collectors.groupingBy(elem -> elem.getDepartment(), Collectors.counting()));
		System.out.println(result12);

		// total transaction per category
		List<Transaction> transactions = Arrays.asList(new Transaction("Food", 100), new Transaction("Food", 200),
				new Transaction("Food", 150), new Transaction("Shopping", 350), new Transaction("Shopping", 250),
				new Transaction("Shopping", 100), new Transaction("Utlities", 400), new Transaction("Utlities", 300),
				new Transaction("Entertainment", 500), new Transaction("Entertainment", 200),
				new Transaction("Travel", 700), new Transaction("Travel", 300));
		Map<Object, Integer> result13 = transactions.stream().collect(
				Collectors.groupingBy(trans -> trans.getCategory(), Collectors.summingInt(tran -> tran.getAmount())));
		System.out.println(result13);

		// find avg salary of emp in each dept
		Map<String, Double> result14 = employee2.stream().collect(
				Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.averagingInt(emp -> emp.getSalary())));
		System.out.println(result14);

		// highest paid emp in each dept
		Map<String, Optional<Employee2>> result15 = employee2.stream().collect(Collectors.groupingBy(
				emp -> emp.getDepartment(), Collectors.maxBy(Comparator.comparingInt(emp -> emp.getSalary()))));
		System.out.println(result15);
		
		// convert list into comma separated string
		
	}

}

class Employee2 {
	String name;
	String department;
	int salary;

	public Employee2(String name, String department, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}

class Transaction {
	String category;
	int amount;

	public Transaction(String category, int amount) {
		super();
		this.category = category;
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [category=" + category + ", amount=" + amount + "]";
	}

}