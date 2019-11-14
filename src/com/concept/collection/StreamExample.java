package com.concept.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamExample {

	List<Integer> numbers = Arrays.asList(2,5,7,9);
	
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
		Optional<Integer> i =  numbers.stream().reduce((c1,c2) -> c1 <c2 ? c1: c2);
		System.out.println(i);
	  
	}
	
	public static void main(String args[]) {
		
		StreamExample obj = new StreamExample();
		obj.streamMapCollect();
		obj.streamFilterCollect();
		obj.streamSortedCollect();
		obj.streamMapForeach();
		obj.streamReduce();
	}
}
