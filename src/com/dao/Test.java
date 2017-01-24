package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import JDBCProj.Class35_36Product;

public class Test {
	public static void main(String[] args) throws SQLException {

		Product product = ProductDAO.getProductById(102);
		System.out.println("ProductID:" + product.getProductID());
		System.out.println("ProductName:" + product.getProductName());
		System.out.println("ProductPrice:" + product.getProductPrice());
		System.out.println("ProducDesc:" + product.getProductDescription());
	}

	// public static void main(String[] args) throws SQLException {
	//
	// ProductDAO productdao = new ProductDAO();
	//
	// ArrayList<Product> products = ProductDAO.getProducts();
	// System.out.println("ProductID:" + product.getProductID());
	// System.out.println("ProductName:" + product.getProductName());
	// System.out.println("ProductPrice:" + product.getProductPrice());
	// System.out.println("ProducDesc:" + product.getProductDescription());
	// }
	//
	// public static void main(String[] args) throws SQLException {
	//
	// Class35_36Product product = new Class35_36Product(125, "Galaxy Grand",
	// "Smart Phone", 2000);
	// addProduct(product);
	//
	// }
}
