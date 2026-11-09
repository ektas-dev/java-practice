package com.practice.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		System.out.println(map);

		Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
		System.out.println(unmodifiableMap);
//		unmodifiableMap.put("four", 4);         --> throws expeception
		Map<String, Integer> um3 = Map.of("Akshit", 56, "Vivek", 98, "Vedant", 33);		//limited to 10 entries only of method
		System.out.println(um3);
		
		
	}
}
