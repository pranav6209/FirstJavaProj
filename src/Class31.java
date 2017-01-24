import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Class31 {

	public static void main(String[] args) {

		// <String, String> data type of <key, value>
		HashMap<String, String> hashMap1 = new HashMap<>();

		// put method to add an entry.

		hashMap1.put("US", "001");
		hashMap1.put("UK", "044");
		hashMap1.put("IND", "091");

		// Returns the value to which the specified key is mapped,
		// or null if this map contains no mapping for the key.
		// System.out.println(hashMap1.get("IND"));

		// ///////////////////////////////////////////////////////////

		// putAll method is similar to addAll method.(add elements of one
		// collection to other collection)

		HashMap<String, String> hashMap2 = new HashMap<>();
		hashMap2.put("AUS", "006");
		hashMap2.put("CAN", "001");

		// put all value of second map in to first one
		// hashMap1.putAll(hashMap2);
		// System.out.println(hashMap1);

		// keySet : Returns all the key from the map
		// Set<String> keys = hashMap1.keySet();
		//
		// for (String str : keys) {
		//
		// System.out.println(str);
		//
		// }

		// values method return all the value.
		// Collection<String> value = hashMap1.values();
		//
		// for (String str : value) {
		//
		// System.out.println(str);

		// entrySet.
		Set<Entry<String, String>> entries = hashMap1.entrySet();

		for (Entry<String, String> entry : entries) {

			System.out.println(entry.getKey() + ":" + entry.getValue());

		}

	}

}
