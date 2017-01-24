package com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Class34 {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException, ParseException {

		/* Serialization */
		// // customer object is stored over heap.it will be stored till object
		// is
		// // unreachable.
		// // also jvm application ?? 8:45
		// Class33Customer customer = new Class33Customer(101, "Harry");
		//
		// // if we want to store a data in this object permanently.we can sync
		// to
		// // file or store in DB. storing in file is serializations.
		//
		// // to store string in to Byte we have to use this class.
		// // storing object state we use this extension .ser
		// FileOutputStream fileOutputStream = new FileOutputStream(
		// "customerdata.ser");
		//
		// Role of ObjectOutputStream --- ????

		// ObjectOutputStream objectOutputStream = new ObjectOutputStream(
		// fileOutputStream);
		// objectOutputStream.writeObject(customer);
		//
		// System.out.println("Object State Written to File");
		//
		// objectOutputStream.close();

		// ////////////////////////////////////////////////////
		/* Deserialization */
		//
		// // to reading a file we have to use this class.
		// FileInputStream fileInputStream = new FileInputStream(
		// "customerdata.ser");
		//
		// // now file is byte so we have to covert
		// // Role of objectInputStream
		// // 1.read state from file
		// // 2. covert byte code in to object
		//
		// ObjectInputStream objectInputStream = new ObjectInputStream(
		// fileInputStream);
		//
		// // readObject method will create customer object.
		// // read object method use object's type and type of data it is
		// creating
		// // an object.
		// Class33Customer customer = (Class33Customer) objectInputStream
		// .readObject();
		//
		// System.out.println("Customer ID :" + customer.id);
		// System.out.println("Customer Name: " + customer.name);
		// //////////////////////////////////////////////////////////////////////
		/* Reading a data from inputDevie */
		// System.in means input from std device.
		// InputStreamReader inputStreamReader = new
		// InputStreamReader(System.in);

		// read method allow only one character at a time
		// char ch = (char) inputStreamReader.read();

		// System.out.println("U Typed " + ch);
		// ///////////////////
		// to read more then one charachter we can use buffer.

		// InputStreamReader inputStreamReader = new
		// InputStreamReader(System.in);

		// BufferedReader bufferedReader = new
		// BufferedReader(inputStreamReader);
		//
		// String str = bufferedReader.readLine();
		//
		// System.out.println("U Typed " + str);
		// /////////////////////////////////////
		/* Date */
		//
		// Date date = new Date();
		//
		// System.out.println(date);
		//
		// // to display in particular format.
		//
		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		//
		// String str = dateFormat.format(date);
		//
		// System.out.println(str);

		// ///////////////////////////////////////////////

		// supply date by user.

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Date date = dateFormat.parse("12/01/2010");

		System.out.println(dateFormat.format(date));

	}
}
