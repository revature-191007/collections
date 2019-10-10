package com.revature.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExample {

	
	public static void main(String[] args) {
		List<Integer> source = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> myList = new ArrayList<>();
		myList.addAll(source);
		
		// ConcurrentModificationException
//		for(Integer i : myList) {
//			if (i % 2 == 0) {
//				myList.remove(i);
//			}
//		}
		
		Iterator<Integer> iterator = myList.iterator();
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			if (next % 2 == 0) {
				iterator.remove();
			}
		}
		
		System.out.println(myList);
		
	}
}
