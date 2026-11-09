package com.practice.collection;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
	public static void main(String[] args) {
		SortedMap<String, Integer> map = new TreeMap<>();
		map.put("Vivek", 98);
		map.put("Tina", 89);
		map.put("Manish", 33);
		map.put("Aditya", 45);
		System.out.println(map);

		// why sortedmap - more functionality given below
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap("Tina"));
		System.out.println(map.tailMap("Manish"));

		SortedMap<Integer, String> map2 = new TreeMap<>((a, b) -> b - a);
		map2.put(78, "Tina");
		map2.put(45, "Rita");
		map2.put(91, "Jaya");
		map2.put(67, "F");
		System.out.println(map2);
		
		NavigableMap<Integer, String> map3 = new TreeMap<>();
		map3.put(1, "One");
		map3.put(5, "Five");
		map3.put(3, "Three");
		map3.put(7, "Seven");
		System.out.println(map3);
		System.out.println(map3.lowerKey(4));
		System.out.println(map3.ceilingKey(4));
		System.out.println(map3.higherEntry(3));
		System.out.println(map3.descendingKeySet());
	}
}
