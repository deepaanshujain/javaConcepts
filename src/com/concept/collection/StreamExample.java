package com.concept.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class StreamExample {

	List<Integer> numbers = Arrays.asList(2,5,1,7,9);
	
	List<String> names = Arrays.asList("Reflection","Collection","Stream"); 
	
	private void streamMapCollect() {
		List<Integer> square = numbers.stream().map(x-> x *x).collect(Collectors.toList());
		System.out.println(square);
		
//		Set<Integer> menuIdSet = usrMenuPermLst.stream().map(UserMenuPermissions::getMenuId).collect(Collectors.toSet());
		
//		Map<Integer, ModuleMenus> completeModuleMenuMap = completeModuleMenuLst.stream()
//				.collect(Collectors.toMap(ModuleMenus::getId, moduleMenu -> moduleMenu));
	}
	
	private void streamFilterCollect() {
		 List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		 System.out.println(result);
	  
	}
	
	private void streamSortedCollect() {
		 List<String> result = names.stream().sorted().collect(Collectors.toList());
		 System.out.println(result);
	  
	}
	
	private void streamMapForeach() {
		 numbers.stream().map(x-> x*x).forEach(y->System.out.println(y));
	  
	}
	
	private void streamReduce() {
		Integer i =  numbers.stream().reduce((c1,c2) -> c1 <c2 ? c1: c2).orElse(null);
		System.out.println(i);
	  
	}
	
	private void sortMapByValue(Map<String, Integer> itemPrice) {
		
		Map<String, Integer> sortedByValueMap = itemPrice.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)-> e1, LinkedHashMap::new));	
		System.out.println(sortedByValueMap.toString());
	}
	
	private void sortMapByKeyReversed(Map<String, Integer> itemPrice) {
			
		Map<String, Integer> sortedByKeyMap = itemPrice.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sortedByKeyMap.toString());
	}
	
	
	private void listToMap(List<String> listOfString) {
		Map<Object, Object> map = listOfString.stream().collect(Collectors.toMap(s -> s , s->s.length(), (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(map);
	}
	
	public static void main(String args[]) {
		
		StreamExample obj = new StreamExample();
		obj.streamMapCollect();
		obj.streamFilterCollect();
		obj.streamSortedCollect();
		obj.streamMapForeach();
		obj.streamReduce();
		
		
		List<String> listOfString = new ArrayList<>();
	    listOfString.add("Java");
	    listOfString.add("JavaScript");
	    listOfString.add("Python");
	    listOfString.add("C++");
	    listOfString.add("Ruby");
	    obj.listToMap(listOfString);
	}
}
