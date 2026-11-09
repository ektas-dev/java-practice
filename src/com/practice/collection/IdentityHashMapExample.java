package com.practice.collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {
	public static void main(String[] args) {
		String key1 = new String("key");
		String key2 = new String("key");
//		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new IdentityHashMap<>();
		// Identityhashcode and ==
		map.put(key1, 1);
		map.put(key2, 2);
		System.out.println(map);
		System.out.println(System.identityHashCode(key1));
		System.out.println(System.identityHashCode(key2));
		System.out.println(key1.hashCode());
		System.out.println(key2.hashCode());
	}
}
