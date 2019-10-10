package com.revature.hashcode.equals;

import java.util.HashSet;
import java.util.Set;

/**
 * The hashcode equals contract is a contract between the implementations
 * of the hashcode and equals methods. These are Object methods (the implicit
 * parent class of all classes).
 * 
 * Contract has two stipulations:
 * 1) If two objects have different hashcodes then the equals method must
 * 		return false.
 * 2) If two the equals method returns true for two objects, then the their
 * 		hashcodes must be equal.
 * 
 * 
 */
public class HashcodeEqualsContract {
	public static void main(String[] args) {
		BrokenClass a = new BrokenClass(1, 2);
		BrokenClass b = new BrokenClass(5, 2); // b and d are equal
		BrokenClass c = new BrokenClass(3, 2);
		BrokenClass d = new BrokenClass(5, 2);
		
		Set<BrokenClass> set = new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		
		System.out.println(set);
	}
}

class BrokenClass {
	int x;
	int y;
	
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}

	public BrokenClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode on: " + this.toString());
		return (int) Math.floor(Math.random()*20);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Comparing: " + this.toString() + " and " + obj.toString());

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BrokenClass other = (BrokenClass) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}

class NotSoGoodClass {
	int x;
	int y;
	
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}

	public NotSoGoodClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode on: " + this.toString());
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Comparing: " + this.toString() + " and " + obj.toString());

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotSoGoodClass other = (NotSoGoodClass) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}

class GoodClass {
	int x;
	int y;
	
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}

	public GoodClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode on: " + this.toString());
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Comparing: " + this.toString() + " and " + obj.toString());
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoodClass other = (GoodClass) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}
