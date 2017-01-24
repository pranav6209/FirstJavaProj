/* 
 ****DAO Theory****
 * Using DAO we are separating Data Access from Business Logic.
 * DAO provide abstraction over DB server.
 * If we have to change DB server, Table name changed rest of the application not change just DAO.
 * We can have multiple DAO and make use of common code.
 * By separating getConnection from ProductDAO, even if we have to change  DB detail or diff. DB it is easy.
 * It also provide Object Oriented view of DB. as DAO transforming record in to object.
 * DAO doesn't always contain JDBC code. if we are interacting with any other data it can be in DAO like 
 * Hibernet.

 */

package com.dao;

//Usually name of java class bean is  same as table name  we are accessing from DB
public class Product {

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
	public Product() {

	}

	public Product(int productID, String productDescription,
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
