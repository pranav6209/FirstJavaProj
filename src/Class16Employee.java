public abstract class Class16Employee {

	int id;
	String name;
	String phone;
	String designation;

	abstract public void calculateSalary();

	public void getDetail() {

		System.out.println("Employee ID" + id);
		System.out.println("Employee Name" + name);
		System.out.println("Employee Phone" + phone);
		System.out.println("Employee designation" + designation);

	}

}
