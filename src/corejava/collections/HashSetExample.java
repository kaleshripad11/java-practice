package corejava.collections;

import java.util.HashSet;

public class HashSetExample {
	/*
	 * HashSet is a builtin collection class which is implemented from 'Set' interface
	 * HashSet has below features - 
	 * 1. Heterogenious(Raw) data is allowed[Syntax - HashSet list = new HashSet()]
	 * 2. Multiple null values are not allowed 
	 * 3. Duplicate elements are not allowed
	 * 4. Order of elements is not preserved - as data is stored randomly
	 * */
	HashSet set = new HashSet();
	void hashSetDemo() {
		set.add("This is a set collection");
		set.add(100);
		set.add(1.1);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1000000001);
		set.add('C');
		set.add(134);
		set.add(null);
		set.add(null);
		System.out.println("Hashset : \n"+set);
		System.out.println("Size of hash set "+set.size());
		
		
		printHashSetElements();
	}
	
	void printHashSetElements() {
		System.out.println("---------------------------------------------------\nPrinting HashSet : ");
		for(Object x: set) {
			System.out.println(x);
		}
	}
}
