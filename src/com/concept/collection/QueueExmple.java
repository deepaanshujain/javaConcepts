package com.concept.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExmple {

	public static void main(String args[]) {
		
		Queue<String> months = new LinkedList<String>();
		
		months.offer("JAN");
		months.offer("FEB");
		months.offer("MAR");
		months.offer("APR");
		months.offer("MAY");
		months.offer("JUN");
		
		System.out.println("Complete List - " + months);
		System.out.println("Head is - "+ months.peek());
		
		String oldHead = months.poll();
		String newHead = months.peek();
		
		System.out.println("Old Head -" + oldHead);
		System.out.println("New Head -"+ newHead);
		
		oldHead = months.remove();
		newHead = months.element();
		
		System.out.println("Old Head -" + oldHead);
		System.out.println("New Head -"+ newHead);
		
	}
}
