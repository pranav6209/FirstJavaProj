package JDBCProj;


// Usually name of java class bean is  same as table name  we are accessing from DB
public class Class35_36Product {

	// javaBean

	// JaveBean Specifications

	// 1. Class Public
	// 2. Default Constructor and Public
	// 3. All field private.
	// 4. Getter and Setter both should be there with Public access.
	
	// java beans are easy to store data.

	private int productID;
	private String productDescription;
	private String productName;
	private float productPrice;

	// Default Constructor.
	public Class35_36Product() {

	}

	public Class35_36Product(int productID, String productDescription,
			String productName, float productPrice) {

		this.productID = productID;
		this.productDescription = productDescription;
		this.productName = productName;
		this.productPrice = productPrice;

	}

	// Getter method used to read value from property.
	// return type of getter method is same as property type.
	public int getProductID() {
		return productID;
	}

	// Setter method used to assign value.
	// return type void but takes a value.
	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

}
