import java.util.ArrayList;
import java.util.HashMap;

public class Datastrukturer {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("List contains the following: "+list.toString());
		list.add(5);
		list.add(18);
		list.add(-20);
		
		System.out.println("After add list contains: " +list.toString());
		
		list.add(2, -10);
		
		System.out.println("After adding -10 ti index 2 the list contains: " + list.toString());
		System.out.println("The list size is: "+list.size());
		list.remove(0);
		System.out.println("After the first element is removed: " + list);
		System.out.println("the element in index 2 is: "+ list.get(2));
		list.clear();
		System.out.println("After clear list contains: "+list.toString());
		
		
		HashMap<String, String> phoneBook = new HashMap<String, String>();
		phoneBook.put("0737534124", "Hans");
		phoneBook.put("012345", "Test");
		System.out.println("The phonebook has the following entries: "+ phoneBook.toString());
		System.out.println("Number of entries in phone book: "+ phoneBook.size());
		System.out.println(phoneBook.get("0737534124")+ " has the number 0737534124");
		phoneBook.remove("0737534124");
		System.out.println("The phonebook after removing Hans looks like this: "+ phoneBook.toString());
		System.out.println("Number of entries in phone book after removing Hans: "+ phoneBook.size());
		phoneBook.clear();
		System.out.println("Number of entries in phone book after clear: "+ phoneBook.size());
	}

}
