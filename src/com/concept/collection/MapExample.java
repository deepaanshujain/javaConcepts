package com.concept.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String args[]) {
		mapMerge();
	}
	
	
	public static void mapMerge() {
		Map<Object, Object> map1 = new HashMap<>();
		Map<Object, Object> map2 = new HashMap<>();
		
		map1.put("a", "test");
		map1.put("b", "new test");
		System.out.println(map1);
		
		map2.put("b", "test second");
		map2.put("c", "new test second");
		System.out.println(map2);
		
		map1.putAll(map2);
		System.out.println(map1);
		
	}
}
