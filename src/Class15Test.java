//  sub package name should begin with main package name. 
// if we import whole package it will not include sub package.
// always good to import particular class instead of a package. so we can understand which class is from which package.

import com.Sample;
import com.java.order;

public class Class15Test {

	public static void main(String[] args) {

		// we have to use import because we want to import from outside the
		// package.
		Sample sample = new Sample();
		order o = new order();
	}

}
