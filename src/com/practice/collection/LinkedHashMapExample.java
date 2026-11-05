package com.practice.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<>(11, 0.3f, true);
		lhmap.put("Banana", 1);
		lhmap.put("Apple", 2);
		lhmap.put("Mango", 3);
		lhmap.put("Cherry", 4);
		lhmap.get("Apple");
		lhmap.get("Banana");
		for (Entry<String, Integer> string : lhmap.entrySet()) {
			System.out.println(string.getKey() + " - " + string.getValue());
		}
		HashMap<String, Integer> hmap = new HashMap<>();
		LinkedHashMap<String, Integer> lhmap2 = new LinkedHashMap<>(hmap);

		hmap.put("Shyam", 91);
		hmap.put("Charlie", 80);
		hmap.put("Akshit", 98);
		Integer res = hmap.getOrDefault("Vipul", 0);
		System.out.println(res);
		hmap.putIfAbsent("Vipul", 93);
		System.out.println(hmap);

	}
}
