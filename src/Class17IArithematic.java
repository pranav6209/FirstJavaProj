public interface Class17IArithematic {

	// this variable is also final static in case of Interface.We can not
	// declare non static variable in Interface.
	int i = 10;

	// this will be an error as we are not initializing variable.
	// int i;

	// This is public method as this is interface.Abstract method log, we
	// don't have to use Abstract keyword. in interface
	// we
	// can only define Abstract method.We can still use Abstract keyword but not
	// compulsory.

	//  public void log(int i);

	// /////////////////////////////////////////////////////////////

	// This is by Default Public Final.Not a Default.and also we don't have to
	// use abstract keyword.
	void process();

}
