package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CollectionInterfaceExample {
	public static void main(String[] args) {

		// ===================COLLECTION INTERFACE==========================
		// Declaration
		// public interface Collection<E> extends Iterable<E>

		Collection<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");

		fruits.remove("Banana");
		System.out.println(fruits);

		// Adding elements
		Collection<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		Collection<Integer> moreNumber = new ArrayList<>();
		moreNumber.add(40);
		moreNumber.add(50);

		numbers.addAll(moreNumber);
		System.out.println(numbers);

		// Removing elements
		Collection<String> fruits2 = new ArrayList<>();
		fruits2.add("Apple");
		fruits2.add("Banana");
		fruits2.add("Qiwi");
		fruits2.add("Mango");
		fruits2.add("Strawaberry");

		fruits2.remove("Qiwi");
		System.out.println(fruits2);

		Collection<String> toRemove = new ArrayList<>();
		toRemove.add("Banana");
		toRemove.add("Apple");

		fruits2.removeAll(toRemove);
		System.out.println(fruits2);

		// Accessing elements
		List<String> colors = new ArrayList<>();
		colors.add("purple");
		colors.add("black");
		colors.add("pink");
		System.out.println(colors);

		String firstColor = colors.get(0);
		String lastColor = colors.get(colors.size() - 1);
		System.out.println(firstColor);
		System.out.println(lastColor);

		// Iterating elements
		// Iterator
		Collection<String> fruits3 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));

		Iterator<String> it = fruits3.iterator();
		while (it.hasNext()) {
			String fruit = it.next();
			if (fruit.equals("Banana")) {
				fruits3.remove(fruit);
			}
		}
		System.out.println(fruits3);

		// ListIterator
		List<String> colors2 = new ArrayList<>(Arrays.asList("purple", "black", "pink"));

		ListIterator<String> it2 = colors2.listIterator();
		System.out.println("Forward");
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}

		System.out.println("\n Backward");
		while (it2.hasPrevious()) {
			System.out.print(it2.previous() + " ");
		}

		System.out.println();

		// ==========================LIST INTERFACE===================================
		// Java List - Operations
		// 1. Adding Elements
		List<String> a1 = new ArrayList<>();
		a1.add("Geeks");
		a1.add("Geeks");
		a1.add(1, "for");

		System.out.println(a1);

		// 2. Updating Elements
		List<String> a2 = new ArrayList<>();
		a2.add("Geeks");
		a2.add("Geeks");
		a2.add(1, "geeks");
		System.out.println("Before update " + a2);

		a2.set(1, "for");
		System.out.println("After update " + a2);

		// 3. Searching Elements
		List<Integer> a3 = new ArrayList<>();
		a3.add(1);
		a3.add(2);
		a3.add(3);
		a3.add(2);

		int fi = a3.indexOf(2);
		System.out.println(fi);
		int li = a3.lastIndexOf(2);
		System.out.println(li);

		// 4. Removing Elements
		List<String> a4 = new ArrayList<>();
		a4.add("Geeks");
		a4.add("Geeks");
		a4.add(1, "for");
		System.out.println("Initial array " + a4);

		a4.remove(1);
		System.out.println("Removal using index " + a4);
		a4.remove("Geeks");
		System.out.println("Removal of object " + a4);

		// 5. Accessing Elements
		List<String> a5 = new ArrayList<>();
		a5.add("Geeks");
		a5.add("for");
		a5.add("Geeks");

		String first = a5.get(0);
		String second = a5.get(1);
		String third = a5.get(2);

		System.out.println("List: " + a5);
		System.out.println("1st " + first);
		System.out.println("2nd " + second);
		System.out.println("3rd " + third);

		// 6. Checking if an element is present or not
		List<String> a6 = new ArrayList<>();
		a6.add("Geeks");
		a6.add("for");
		a6.add("Geeks");
		boolean isPresent = a6.contains("Geeks");
		System.out.println(isPresent);

		// Iterating over List Interface in Java
		List<String> a7 = new ArrayList<>();
		a7.add("Geeks");
		a7.add("Geeks");
		a7.add(1, "for");

		for (int i = 0; i < a7.size(); i++) {
			System.out.print(a7.get(i) + " ");
		}
		System.out.println();
		for (String str : a7) {
			System.out.print(str + " ");
		}

		// =======================SET INTERFACE==============================
		// Performing Various Operations on Set
		// 1. Adding Elements
		Set<String> s1 = new HashSet<>();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("B");
		System.out.println("Add method: " + s1);

		// 2. Accessing the Elements
		Set<String> s2 = new HashSet<>();
		s2.add("A");
		s2.add("B");
		s2.add("C");
		s2.add("B");
		System.out.println(s2);
		String s = "D";
		System.out.println("Contains: " + s2.contains(s));

		// 3. Removing Elements
		Set<String> s3 = new HashSet<String>();
		s3.add("A");
		s3.add("B");
		s3.add("C");
		s3.add("D");
		s3.add("B");
		System.out.println("Set before delete: " + s3);
		s3.remove("D");
		System.out.println("After delete: " + s3);

		// 4. Iterating elements
		Set<String> s4 = new HashSet<String>();
		s4.add("A");
		s4.add("B");
		s4.add("C");
		s4.add("D");
		s4.add("B");
		for (String st : s4) {
			System.out.print(st + ",");
		}
		System.out.println();

		
		// =============================QUEUE INTERFACE==============================
		//Operations on Queue Interface using PriorityQueue
		//1. Adding Elements
		
		//2. Removing Elements
		
		//3. Accessing Elements
		
		//4. Iterating the Queue
		
		
		
		
		// ==============================DEQUE INTERFACEE==================================

		// ========================MAP INTERFACE=========================

	}
}
