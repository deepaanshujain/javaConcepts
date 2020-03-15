package com.concept.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	
	public static void main(String args[]) {
		
		
		List<String> loans = new ArrayList<>(); 
		loans.add("personal loan"); 
		loans.add("home loan"); 
		loans.add("auto loan"); 
		loans.add("credit line loan"); 
		loans.add("mortgage loan"); 
		loans.add("gold loan");
		
		System.out.println(loans.toString());
		Iterator<String> itr = loans.iterator();
		
		while(itr.hasNext()) {
			String loan = itr.next();
			
			if(loan == "gold loan") {
				itr.remove();
			}
		}
		
		System.out.println(loans.toString());
	}

}
