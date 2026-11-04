package com.practice.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Jaya");
		map1.put(2, "Shushma");
		map1.put(3, "Neha");
		map1.put(4, "Rena");
		System.out.println(map1);
		System.out.println(map1.get(2));
		System.out.println(map1.get(31));

		System.out.println(map1.containsKey(6));
		System.out.println(map1.containsValue("Rena"));

		Set<Integer> keys = map1.keySet();
		for (int i : keys) {
			System.out.println(map1.get(i));
		}
		Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();
		for (Entry<Integer, String> i : entrySet) {
			System.out.println(i.getKey() + " : " + i.getValue());
		}
		map1.remove(2);
		System.out.println(map1);
		
		System.out.println("Removed ? "+map1.remove(3, "Hola"));
	}
}
