package com.practice.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		int removedItem = stack.pop();
		System.out.println(removedItem);
		System.out.println("Seeing top element " + stack.peek());
		stack.isEmpty();
		stack.size();
		stack.search(3);

		// linked list as stack
		List<Integer> linkedList = new LinkedList<>();
		linkedList.addLast(2);
		linkedList.addLast(3);
		linkedList.addLast(4);
		System.out.println(linkedList);
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.size());
		System.out.println(linkedList.isEmpty());

		// array list as stack
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		System.out.println(arrayList.get(arrayList.size() - 1));
	}
}
