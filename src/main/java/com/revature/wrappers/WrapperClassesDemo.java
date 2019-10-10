package com.revature.wrappers;

/*
 * Sometimes we need to be able to treat primitive types like they were
 * objects. In Java, as primitives are not objects, in those situation
 * using primitives can be quite a challenge.  However, wrapper types
 * give us a convenient way to automatically convert between primitive
 * and object types for primitive values.
 * 
 * Primitives		Wrapper Type
 * byte	- - - - - - Byte
 * short - - - - - -Short
 * int	- - - - - -	Integer
 * long - - - - - - Long
 * float			Float
 * double			Double
 * char				Character
 * boolean			Boolean
 * 
 * Java will automatically swap between these types when necessary.
 * When a primitive is automatically converted to a wrapper class,
 * this process is called: "Auto-boxing"
 * When a wrapper type is automatically converted to a primitive,
 * it is called: "Auto-unboxing"
 */
public class WrapperClassesDemo {
	public static void main(String[] args) {
		// note: chars use single quotes, strings double
		char myChar = 'a';
		
		// auto-boxing
		Character myCharacter = myChar;
		
		// auto-unboxing
		char sameChar = myCharacter;
		
		takeChar(myCharacter); // will autounbox
		takeChar(myChar); // will just use char
		
		System.out.println(Character.isUpperCase('a'));
		int i = Integer.parseInt("234");
		
		System.out.println(i);
		boolean myBool = new Boolean(true);
		if(Boolean.FALSE) {
			// why?
		}
		Boolean.logicalAnd(true, false);
	}
	
	static void takeChar(char aChar) {
		// do something
	}
}
