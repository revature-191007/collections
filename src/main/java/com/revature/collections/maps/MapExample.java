package com.revature.collections.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Maps represent key value pairs.
 * Maps are a simple way to create relationships between values such that
 * knowing the key can lead you to the value.
 * 
 * Maps are one of the most frequently data structures as often we may want
 * to model relationships and access them based on some key rather than
 * an index.
 * 
 * Note: Maps have two generic types because we need to specify the type
 * for both the key and the value.
 *
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> lunchMap = new HashMap<>();
		
		lunchMap.put("Chick-fil-A", 3);
		lunchMap.put("Subway", 3);
		lunchMap.put("homemade", 3);
		lunchMap.put("Nothing", 1);
		lunchMap.put("Pollo Tropical", 2);
		
		System.out.println(lunchMap.get("Subway"));
		System.out.println(lunchMap.get("Nothing"));
		
		System.out.println(lunchMap.getOrDefault("Fish", 0));
		System.out.println(lunchMap.getOrDefault("Chick-fil-A", 0));
		
		lunchMap.putIfAbsent("Chick-fil-A", 1);
		System.out.println(lunchMap.getOrDefault("Chick-fil-A", 0));
		lunchMap.merge("Chick-fil-A", 1, (a, b) -> a+b);
		
		System.out.println(lunchMap.getOrDefault("Chick-fil-A", 0));
		
	}
}
