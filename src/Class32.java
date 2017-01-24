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
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Class32 {

	public static void main(String[] args) {

		// Here we don't have to add key value and we don't have to define data
		// type as it will be String by default.
		// like in hash we defined
		// HashMap<String, String> hashMap1 = new HashMap<>();
		Properties properties = new Properties();

		properties.put("US", "001");
		properties.put("UK", "044");
		properties.put("IND", "091");

		Set<Entry> entries = properties.entrySet();

		for (Entry<String, String> entry : entries) {

			System.out.println(entry.getKey() + ":" + entry.getValue());

		}

	}

}
