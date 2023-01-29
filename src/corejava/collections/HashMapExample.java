package corejava.collections;

import java.util.HashMap;

public class HashMapExample {
	/*
	 * HashMap implements 'Map' interface
	 * Data is stored in the form of 'Key=>Value' pairs
	 * Here, keys are unique always, but their values can be duplicate
	 * Order of insertion is not preserved as indexing is not used to store elements
	 */
	HashMap<Integer, Object> hashes = new HashMap<Integer,Object>();
	void hashMapDemo() {
		hashes.put(1, "GTA San Andreas");
		hashes.put(2, "GTA Vice City");
		hashes.put(3, "Call Of Duty");
		hashes.put(4, "The Red Dead Redemption");
		hashes.put(5, "House of the dead");
		hashes.put(6, "Need for Speed");
		hashes.put(7, "Need for Speed");
		hashes.put(8, "RoadRash");
		hashes.put(9, 1.4);
		hashes.put(10, true);
		printHashMap();
		hashes.remove(7);
	}
	
	void printHashMap() {
		System.out.println("Printing hash map : ");
		System.out.println(hashes);
		System.out.println("Size of hashmap : "+hashes.size());
		System.out.println("Print keyset for hashmap : "+hashes.keySet());
		System.out.println("Print valueset for hashmap : "+hashes.values());
		System.out.println("Get value at 8th key : "+hashes.get(8));
		printKeyValueSet();
	}
	
	void printKeyValueSet() {
		System.out.println("-----------------------------------------------------\nKeyset : ");
		for(Object x:hashes.keySet()) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------------\nValueset : ");
		for(Object x:hashes.values()) {
			System.out.println(x);
		}
	}
}
