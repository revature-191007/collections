package com.revature.generics;

/*
 * Generics are a way to label some object as containing some other type.
 * This allows us to know what the contents are.
 * Our classes which have common functionality but are meant to be reusable
 * can easily be written with generic code while maintaining static type checking.
 * 
 * Generics in general are associates with the 
 * 			angle bracket (or "diamond") syntax.
 */
public class GenericsDemo {
	public static void main(String[] args) {
		genericBoxDemo();
	}
	
	public static void genericBoxDemo() {
		String myString = "myString";
		int myInt = 5;
		
		// Box recieves String as generic typing
		// All "T" references are replaced by String for this instance
		GenericBox<String> stringBox = new GenericBox<String>();
		stringBox.put(myString);
		
		// right side can infer generic typing from left side
		GenericBox<Integer> intBox = new GenericBox<>();
		intBox.put(myInt);
		
		// retrieval - No casting necessary!
		String retrievedString = stringBox.get();
		int retrievedInt = intBox.get();
		System.out.printf("%s, %d%n", retrievedString, retrievedInt);
		
		// Calling generic method
		intBox.<String>genericMethod("Hello");
		
	}
	
	public static void normalBoxDemo() {
		String myString = "Hello world";
		Box myBox = new Box();
		myBox.put(myString);
		String retrievedString = (String) myBox.get();
		System.out.println(retrievedString);
	}
}

class GenericBox <T> {
	private T something;
	
	public void put(T something) {
		this.something = something;
	}
	
	public <R> R genericMethod(R something) {
		System.out.println(something);
		return something;
	}
	
	public T get() {
		T t = this.something;
		this.something = null;
		return t;
	}
}

class Box {
	private Object something;
	
	public void put(Object something) {
		this.something = something;
	}
	
	public Object get() {
		Object o = this.something;
		this.something = null;
		return o;
	}
}
