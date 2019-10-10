package com.revature.collections;

/**
 * Collections are Java's built in data structures.
 * Collections are organized into a few different categories.
 * 
 * The primary collections start with the Iterable interface,
 * which is extended by the Collection interface, which
 * is then extended by several sub interfaces that represent
 * abstract data structures.
 * 
 * 1. Set - Sets contain distinct items. Very optimal in situations
 * 			where we will need to frequently or quickly determine if some
 * 			object is contained in the set.
 * 		Implementations:
 * 			* HashSet
 * 
 * 2. List - An ordered list of items. Duplicates are valid in a list.
 * 		Implementations:
 * 			* ArrayList
 * 			* LinkedList
 * 
 * 3. Queue - FIFO (first in, first out) data structure. Items added at the end
 * 			and removed from the beginning.
 *		Implementations:
 *			* LinkedList
 *			* PriorityQueue
 *
 * Collections API is bigger than the Collection interface.
 * In fact, there is also a utility Collections class, which exposes
 * certain helper functions.
 * 
 * The Collections API also includes Maps. Maps are not iterable, so are
 * therefore not housed under the Iterable or Collection interface, but are
 * a part of the Collections API.
 * 
 * Map forms its own branch of the Collection API, which has then further 
 * concrete implementations.
 * 
 * 		Map - key-val pair
 * 			* HashMap - Uses hashed value buckets to organize items for quick lookup
 * 
 */
public class CollectionsExplanation {

}
