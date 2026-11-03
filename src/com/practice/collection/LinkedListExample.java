package com.practice.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		// Linked List stores elements as nodes in a doubly linked list
		// linked list is a linear data structure wjere each element is a separate
		// object called a node. Each node contains two part data and pointer
		List<Integer> linkedList1 = new LinkedList<>();
		// Adding element
		linkedList1.add(1);
		linkedList1.add(2);
		linkedList1.add(3);
		linkedList1.add(4);
		System.out.println(linkedList1);
		linkedList1.add(2, 3);
		System.out.println(linkedList1);
		linkedList1.addFirst(0);
		System.out.println(linkedList1);
		linkedList1.addLast(5);
		System.out.println(linkedList1);
		// Accessing elements
		System.out.println(linkedList1.get(2));
		System.out.println(linkedList1.getFirst());
		System.out.println(linkedList1.getLast());
		// Removing elements
		System.out.println("Before removing" + linkedList1);
		linkedList1.remove(0);
		linkedList1.remove(Integer.valueOf(5));
		linkedList1.removeFirst();
		linkedList1.removeLast();
		System.out.println("After removing" + linkedList1);
		linkedList1.removeIf(x -> x % 2 == 0);
		System.out.println(linkedList1);

		List<String> list2 = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
		List<String> rList = new LinkedList<>(Arrays.asList("Dog", "Lion"));
		list2.removeAll(rList);
		System.out.println(list2);
	}
}
