package com.concept.collection;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LambdaExceptionHandling {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		int key = 0;
		
		process(numbers, key, wrapperLambda((i,k)->System.out.println(i/k)));

	}
	
	
	public static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : numbers) {
			consumer.accept(i, key);
		}
	} 
	
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		
		return(i,k)-> {
			try {
				consumer.accept(i, k);
			}catch (Exception e) {
				e.printStackTrace();
			}
		};
		
	}

}
