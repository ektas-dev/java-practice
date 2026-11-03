package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		// ArrayList - ordered, allows duplicate, when size unknown, array list can
		// shrink and grow as elements are added and removed
		List<Integer> list1 = new ArrayList<>();
		// adding element - add method
		list1.add(1);
		list1.add(4);
		list1.add(30);
		// accessing element - get method
		System.out.println(list1.get(2));
		// size method
		System.out.println(list1.size());
		// iterating array list
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		// using for each loop
		for (int x : list1) {
			System.out.println(x);
		}
		// contains method
		System.out.println(list1.contains(3));
		System.out.println(list1.contains(1));
		// removing element - remove method based on index
		System.out.println(list1.remove(1));
		for (int x : list1) {
			System.out.println(x);
		}
		// add in middle
		list1.add(1, 5);
		System.out.println(list1);
		// modifying element - replace
		list1.set(2, 50);
		System.out.println(list1);
		// Initial Capacity of array list 10
		// If increase in array size the new array is created if it is more than
		// capacity
		// Creating list different ways
		List<String> list2 = new ArrayList<>();
		System.out.println(list2.getClass().getName());

		List<String> asList = Arrays.asList("Monday", "Tuesday");
		System.out.println(asList.getClass().getName());
		// asList.add("Wednesday"); // error- you cant add or remove here
		asList.set(1, "Wednesday");
		System.out.println(asList);
		String[] array = { "Apple", "Banana", "Cherry" };
		List<String> asList2 = Arrays.asList(array);
		System.out.println(asList2.getClass().getName());
		// making list modifiable
		List<String> mList = new ArrayList<>(asList2);
		mList.add("Mango");

		List<Integer> list3 = List.of(1, 2, 3, 4);
		// list3.set(1, 3); //error - List.of() - unmodifiable list
		// addAll method
		List<Integer> list4 = new ArrayList<>();
		list4.add(1);
		list4.add(2);
		list4.add(3);
		list4.add(4);
		list4.add(5);
		List<Integer> list5 = List.of(6, 7, 8, 9);
		list4.addAll(list5);
		System.out.println(list4);
		// removing element - remove method based on value
		// list1.remove(5) //error - this calls index method
		list4.remove(Integer.valueOf(5));
		System.out.println(list4);
		// removing element - remove method based on value
		List<String> list6 = new ArrayList<>();
		list6.add("Square");
		list6.add("Circle");
		list6.add("Rectangle");
		list6.add("Traingle");
		list6.remove("Circle");
		System.out.println(list6);
		// converting to array
		List<Integer> list7 = new ArrayList<>();
		list7.add(1);
		list7.add(2);
		list7.add(3);
		Object[] array2 = list7.toArray(); // generic
		Integer[] array3 = list7.toArray(new Integer[0]); // 0 because assign it to a new array convention, this one is
															// integer type
		System.out.println(array3);
		// sorting an array list
		List<Integer> list8 = new ArrayList<>();
		list8.add(30);
		list8.add(22);
		list8.add(15);
		list8.add(80);
		list8.add(8);
		Collections.sort(list8);
		// list8.sort(null);
		list8.sort(new MyComparator());
		System.out.println(list8);

		// Comparator
		List<String> list9 = Arrays.asList("Banana", "Apple", "Date");
		// want to sort according to custom logic eg according to length
		list9.sort(new StringLengthComparator());
		System.out.println(list9);
		// easy way using lambda expression
		list9.sort((s1, s2) -> s2.length() - s1.length());
		System.out.println(list9);
		//
		List<Student> stdList = new ArrayList<>();
		stdList.add(new Student("Alice", 3.5));
		stdList.add(new Student("Bob", 3.7));
		stdList.add(new Student("Charlie", 3.5));
		stdList.add(new Student("Thomas", 3.9));
		// sorting long way
		stdList.sort((a, b) -> {
			if (b.getGpa() - a.getGpa() > 0) {
				return 1;
			} else if (b.getGpa() - a.getGpa() < 0) {
				return -1;
			} else {
				return 0;
			}
		});
		System.out.println(stdList);
		// easy way
		Comparator<Student> comparing = Comparator.comparing(Student::getGpa);
		stdList.sort(comparing);
		System.out.println(stdList);
		Comparator<Student> reversed = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
		System.out.println(reversed);
	}
}

//for descending order
class MyComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		// negative o1 returns before o2, positive - o2 returns before o1 eg 3 5
//		return o1-o2;		//ascending
		return o2 - o1; // descending
	}
}

// for sorting according to its length
class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s2.length() - s1.length();
	}
}

class Student {
	String name;
	double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}