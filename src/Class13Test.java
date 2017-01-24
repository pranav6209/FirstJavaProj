//  sub package name should begin with main package name. 
// if we import whole package it will not include sub package.
// always good to import particular class instead of a package. so we can understand which class is from which package.
// we have to use import because we want to import from outside the
// package.
import com.Sample;
import com.java.order;

public class Class13Test {

	public static void main(String[] args) {

		Sample sample = new Sample();
		
		order o = new order();
	}

}
