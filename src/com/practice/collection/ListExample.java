package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {

		/***************************** LINKED LIST ***************************/

		// Creation - LinkedList<Object> linkedList = new LinkedList<>();
		LinkedList<String> list = new LinkedList<String>();

		// Adding
		list.add("One");
		list.add("Two");
		System.out.println("Linked List = " + list);

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		LinkedList<Integer> ll = new LinkedList<Integer>(al);
		System.out.println(ll);

		// Adding Element - add() | addAll() | addFirst() | addLast()
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(1);
		ll2.addAll(al);
		ll2.addFirst(0);
		ll2.addLast(10);
		System.out.println(ll2);

		// Removing Element -
		// removeFirst() | removeLast() | removeFirstOccurence() | removeLastOccurence()

		// Queue Operations - poll() | pop() | pollFirst() | pollLast() | push()

		// Insert an Element at a Specific Position in a LinkedList
		/*
		 * addFirst(E e) Adds an element at the beginning of a list addLast(E e) Adds an
		 * element at the end of a list add(E e) Adds an element at the end of a list
		 * add(int index, E element) Adds an element at index position i of a list
		 */
		LinkedList<String> ll5 = new LinkedList<String>();
		ll5.addFirst("One");
		ll5.addLast("Three");
		ll5.add("Four");
		ll5.add(1, "Two");
		System.out.println(ll5);

		// Converting an Array into a LinkedList
		String[] array = { "apple", "banana", "guava", "cherry" };
		List<String> list2 = Arrays.asList(array);
		LinkedList<String> ll6 = new LinkedList<String>(list2);
		System.out.println(ll6);

		LinkedList<String> ll7 = new LinkedList<String>();
		Collections.addAll(ll7, array);

		/****************************** ARRAY LIST *********************************/
		// Creating an ArrayList
		// Default No-Arg Constructor
		List<String> list3 = new ArrayList<String>();
		list3.isEmpty();

		// Constructor Accepting Initial Capacity - specify the initial length
		List<String> list4 = new ArrayList<>(20);
		list4.size();

		// Constructor Accepting Collection
		Collection<Integer> numbers = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		List<Integer> list5 = new ArrayList<Integer>(numbers);
		System.out.println(list5);

		// Adding Elements to the ArrayList
		List<Long> list6 = new ArrayList<Long>();
		list6.add(1L);
		list6.add(2L);
		list6.add(3L);
		System.out.println(list6);

		// Iterating Over the ArrayList

		// Searching the ArrayList
		// Searching an Unsorted List - indexOf() | lastIndexOf()

		// Searching a Sorted List - binary search algorithm

		// Removing Elements from the ArrayList - find index, remove()
		List<String> list7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
		list7.remove("C");
		list7.remove(0);
		System.out.println(list7);

		// Using a Sequenced Collection – ArrayList
		/*
		 * Method				 Description 
		 * addFirst(E e) 		Adds an element as the first element
		 * addLast(E e) 		Adds an element as the last element 
		 * getFirst() 			Gets the first element 
		 * getLast()			Gets the last element 
		 * removeFirst() 		Removes and returns the first element 
		 * removeLast() 		Removes and returns the last element
		 */
		// Getting First or Last Element
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(3,1,2));
		arrayList.getFirst();
		System.out.println(arrayList.getFirst());
		arrayList.getLast();
		
		// Adding First or Last Element
		arrayList.addFirst(4);
		arrayList.addLast(0);
		System.out.println(arrayList);
		
		// Removing First or Last Element
		arrayList.removeFirst();
		arrayList.removeLast();
		System.out.println(arrayList);
	}
}
