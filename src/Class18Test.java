public class Class18Test extends Class15SavingAccount {

	public static void main(String[] args) {

		Class15SavingAccount account1 = new Class15SavingAccount(101, 5000);
		Class15SavingAccount account2 = new Class15SavingAccount(101, 5000);

		// Account 1 and Account 2 are not referring to same object variable.
		// will not check if variable has same Data or not.
		
		// if Class15SavingAccount is a singleton object we can not create multiple Instance
		// at that time if we create two instance of a class it will return true.

		System.out.println(account1 == account2);

		
		
		//account 1 is used to call method so it should be available locally.
		//and account2 we have to pass with method.
		
		// it will return false until we override.
		
		System.out.println(account1.equals(account2));

		// String class is in java.lang. we don't have to import java.lang
		// package

		// Calling constructor of String Class and Passing data Hello.

		// s1 and s2 are not referring to same object variable. so it will
		// return false. and it will not check data.

		
		  String s1 = new String("Hello"); 
		  
		  String s2 = new String("Hello");
		  
		  System.out.println(s1 == s2);
		  
		  // if we want to compare contains of the object. use equal method not
		  //operator.
		 
		  System.out.println(s1.equals(s2));
		 

	}

}
