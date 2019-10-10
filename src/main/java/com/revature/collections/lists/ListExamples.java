package com.revature.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListExamples {
	
	/*
	 * ArrayList - What is this implementation?
	 * 
	 * The ArrayList class is backed by actual low level Java arrays
	 * which are replaced as the List data grows or shrinks. As such
	 * insertion are generally constant time, but whenever the array
	 * has to be replace, the insert can be much slower.
	 */
	static void arrayListExample() {
		// Using the interface type reference, but instantiating the concrete
		List<Integer> intList = new ArrayList<>();
		intList.add(10); // [ 10 ]
		intList.add(15);
		intList.add(20); // [10, 15, 20]
		// add 13 at index 1 (pushing others back)
		intList.add(1, 13); // [10, 13, 15, 20]
		System.out.println(intList);
		
		// .contains to check if a specific item is in the list
		System.out.println(intList.contains(14));
		
		// .size() - same as string length() or array length
		for(int i = 0; i < intList.size(); i++) {
			// get(i) - retrieve item at index
			System.out.print(intList.get(i) + " ");
		}
		System.out.println();
		
		// IndexOutOfBoundsException
//		intList.get(20);
		
		Integer[] myArr = {1, 2, 3, 4, 5};
		List<Integer> newList = Arrays.asList(myArr);
		System.out.println(newList);
		myArr[2] = 11;
		System.out.println(newList);
		// Lists created using Arrays.asList(arr) cannot have their inner
		// arrays modified - the list cannot expand or contract
//		newList.add(1);
		
		intList.addAll(newList);
		System.out.println(intList);
	}
	
	static void linkedListExample() {
		Queue<String> strings = new LinkedList<>();
		strings.add("Hello");
		strings.poll();
	}
	
	public static void main(String[] args) {
		linkedListExample();
	}
}
