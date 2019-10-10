package com.revature.collections.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Mitch
 *
 */
public class OrderDemo {
	public static void main(String[] args) {
		MyObject a = new MyObject(0);
		MyObject b = new MyObject(8);
		MyObject c = new MyObject(2);
		MyObject d = new MyObject(4);
		MyObject e = new MyObject(7);
		MyObject f = new MyObject(1);
		
		List<MyObject> list = new ArrayList<>();
		list.addAll(Arrays.asList(a, b, c, d, e, f));
		System.out.println(list);
//		Collections.sort(list, new EvenFirst());
		Comparator<MyObject> reversed = Collections.reverseOrder(new EvenFirst());
		Collections.sort(list, reversed);
		System.out.println(list);
	}
}

/**
 * Comparator defines alternate orders as opposed to natural order.
 * Comparator implements the Compare method, which accepts 2 arguments
 * but returns similar values.
 * @author Mitch
 *
 */
class EvenFirst implements Comparator<MyObject> {

	@Override
	public int compare(MyObject o1, MyObject o2) {
		if (o1.i % 2 == 0) {
			if (o2.i % 2 == 0) {
				return o1.i - o2.i;
			}
			return -1;
		} else if(o2.i % 2 == 0) {
			return 1;
		}
		return o1.i - o2.i;
	}
	
}

/*
 * Comparable is used for Natural Ordering.
 * 
 * Comparable interface defines the compareTo method
 * which compares an object to the type defined in Comparable
 * (generally the same type), and returns an integer value that designates
 * the relation between the two, where positive numbers suggest the current
 * item is of greater order and a negative suggests the current item is of 
 * lower order. 
 */
class MyObject implements Comparable<MyObject> {
	int i;

	public MyObject(int i) {
		super();
		this.i = i;
	}

	@Override
	public int compareTo(MyObject o) {
		return o.i - this.i;
	}

	@Override
	public String toString() {
		return ""+i;
	}
	
	

	
}