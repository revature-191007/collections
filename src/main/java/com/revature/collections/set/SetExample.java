package com.revature.collections.set;

import java.util.HashSet;
import java.util.Set;

/*
 * A set is a collection of distinct items.
 * We can add and remove things from the Set, as well
 * as check if something is present. If we attempt to add
 * something that already exists in the set, the set will
 * not change.
 */
public class SetExample {

	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(1);
		mySet.add(2);
		mySet.add(4);
		
		System.out.println(mySet);
		
		mySet.add(1);
		mySet.add(4);
		
		System.out.println(mySet);
		
		System.out.println(mySet.contains(2));
		System.out.println(mySet.contains(5));
		
		mySet.remove(2);
		System.out.println(mySet.contains(2));
		
	}
	
}
