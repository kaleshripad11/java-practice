package corejava.collections;
public class CollectionsDemo {
	/*
	 * 1. In java 'Collection' is an interface which inherits from 'Iterable' interface
	 * 2. Three chield interfaces inherits from 'Collection' interface - List, Queue, Set
	 * 3. All collections are present in java.util package
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample ale = new ArrayListExample();
		HashSetExample hse = new HashSetExample();
		HashMapExample hme = new HashMapExample();
		//ale.demoArraylist();
		//hse.hashSetDemo();
		hme.hashMapDemo();
		hme.printHashMap();
	}

}
