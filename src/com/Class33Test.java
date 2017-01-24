package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Class33Test {

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader("C:\\sample.txt");

		// filereader represent Stream. read method is defined in filereader
		// class.it will read first character and return uni code value of the
		// charchter.we have to execute read method till end of the file.
		// read method when it reaches end of file it returns -1.
		int i = fileReader.read();

		while (i != -1) {
			// cover int in to char
			char ch = (char) i;
			System.out.print(ch);
			// this will continue the loop.
			i = fileReader.read();

		}

		
		//////////////////////////////////////////////////////////////
		
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//		// returns String Object.This method returns end of the line it returns
//		// null.
//		String line = bufferedReader.readLine();
//
//		while (line != null) {
//
//			System.out.println(line);
//			line = bufferedReader.readLine();
//
//		}
//
//		fileReader.close();
	}
}
