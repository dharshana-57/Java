package miraculousgod;

// JAVA COLLECTIONS FRAMEWORK


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Collection -> collection of object
// Collection(interface) -> List(Interface) -> ArrayList(class)
// List extends Collection, ArrayList implements List 
// array is faster than Collection
// By default type is Object type -> you can add all datatypes and no index in collection
// Collection doesn't support index number
// to specify type of Collection use Generics <>

// List implements Collections => uses index number, traverses orderly and print it
// List<Integer> v = new ArrayList<>();

// Set(interface):  Same like list but no duplicate values, randomly traverses and prints(HashSet), sorted format (TreeSet)
// Set<type> v = new HashSet,TreeSet<>(type);

// Map(Interface) : Key - value precision -> every value has key
// Map<keyType,valueType> = new HashMap,HashTable<>(); => synchronised / non-synchronised
// all these comes under Collection API / Package 

public class CollectionPart1 {

	
	public static  void main(String[] args) {
		Collection value = new ArrayList();
		value.add(4);
		value.add(8);
		value.add(2);
//		System.out.println(value);
		
//		Iterator (interface) || iterator() => method
		Iterator itr = value.iterator();
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
		
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
	}

}
