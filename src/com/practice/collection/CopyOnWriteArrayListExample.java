package com.practice.collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		System.out.println(list);
		for(String arr : list) {
			System.out.println(arr);
			if(arr.equals("Banana")){
				list.add("Mango");
				System.out.println("Added mango while reading");
			}
		}
		System.out.println(list);
	}
}
