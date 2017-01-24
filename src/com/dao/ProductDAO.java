package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// Various DB operation CRUD: Create, Read, Update and Delete

public class ProductDAO extends BaseDAO {

	// it will return product object.
	public static Product getProductById(int productID) throws SQLException {

		Connection connection = null;
		Product product = null;

		try {

			String selectquery = "select * from test.product where product_id =?";

			connection = getConnection();

			PreparedStatement preparedStatement = connection
					.prepareStatement(selectquery);
			// setting bind parameter.
			preparedStatement.setInt(1, productID);
			ResultSet resultSet = preparedStatement.executeQuery();

			// method return type is product object so we will store them in
			// product object.

			if (resultSet.next()) {

				// Reading record from resultSet and Storing into product object
				product = new Product();

				// getting value from db using resultSet.getInt
				product.setProductID(resultSet.getInt("product_id"));
				product.setProductName(resultSet.getString("product_name"));
				product.setProductPrice(resultSet.getFloat("product_price"));
				product.setProductDescription(resultSet
						.getString("product_description"));

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (connection != null) {
				connection.close();
				connection = null;
			}
		}
		return product;

	}

	// To fetch all the record from DB server. it will create multiple
	// object(collection of object)
	//
	public static ArrayList<Product> getProducts() throws SQLException {

		Connection connection = null;
		ArrayList<Product> productsList = new ArrayList<>();

		try {

			String selectquery = "select * from test.product";

			connection = getConnection();

			PreparedStatement preparedStatement = connection
					.prepareStatement(selectquery);

			ResultSet resultSet = preparedStatement.executeQuery();

			// method return type is product object so we will store them in
			// product object.

			// because there might be multiple record so we have to use while
			// loop;
			while (resultSet.next()) {

				// Reading record from resultSet and Storing into product object
				Product product = new Product();

				// getting value from db using resultSet.getInt
				product.setProductID(resultSet.getInt("product_id"));
				product.setProductName(resultSet.getString("product_name"));
				product.setProductPrice(resultSet.getFloat("product_price"));
				product.setProductDescription(resultSet
						.getString("product_description"));

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (connection != null) {
				connection.close();
				connection = null;
			}
		}
		return productsList;

	}

	public void addproduct(Product product) throws SQLException {

		String insertQuery = "insert into test.product(product_id,product_name,product_price,product_description)"
				+ "values(?,?,?,?)";
		Connection connection = null;
		try {
			connection = getConnection();

			PreparedStatement preparedStatement = connection
					.prepareStatement(insertQuery);

			// to add record we are using product object reference.
			preparedStatement.setInt(1, product.getProductID());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setFloat(3, product.getProductPrice());
			preparedStatement.setString(4, product.getProductDescription());

			// execute update when we want use insert query.
			// insert/update/delete use executeUpdate()
			int i = preparedStatement.executeUpdate();

			if (i == 1) {
				System.out.println("Record Added Successfully");

			}
		} catch (Exception e) {
			e.printStackTrace();
			// connection.close always in finally block.
		} finally {
			if (connection != null) {
				// unchecked exception so throws added.
				connection.close();
				connection = null;
			}
		}
	}

	void updateProduct(Product product) {

	}

	void deleteproduct(int id) {

	}
}
