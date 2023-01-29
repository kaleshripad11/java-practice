package corejava.collections;

import java.util.ArrayList;

public class ArrayListExample {
	/*
	 * ArrayList is a bultin collection class which is implemented from 'List' interface
	 * ArrayList has below features - 
	 * 1. Heterogenious(Raw) data is allowed[Syntax - ArrayList list = new ArrayList()]
	 * 2. Null values are allowed 
	 * 3. Duplicate elements are allowed
	 * 4. Order of elements is preserved[Using method add(index,value)] 
	 * */
	
	void demoArraylist() {
		ArrayList list = new ArrayList(); 	//This will allow heterogeneous data
		list.add("ABC");
		list.add(0, "Avengers");
		list.add(null);
		list.add(null);
		list.add("Balto");
		list.add(4, "Ju On - The Grudge");
		list.add("PQRST");
		list.add(5, "A Christmas gift from Bob");
		list.add(14.9);
		list.add(6, "Hachiko - A Dog's Story");
		
		//get size of arraylist
		System.out.println(list.size());
		System.out.println(list);
		
		//Remove elements from ArrayList using remove();
		list.remove(2);
		System.out.println(list);
		list.remove(null);
		System.out.println(list);
		
		// Print value present at specific index
		System.out.println(list.get(5));
		
		System.out.println("Print array list elements using loop(Enhanced): ");
		for(Object x:list) {
			System.out.println(x);
		}
		
		//Clear data in arraylist
		System.out.println("Clearing arraylist :");
		list.clear();
		System.out.println(list);
	}
}
