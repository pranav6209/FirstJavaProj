package JDBCProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Class37Test {

	static Connection connection = null;

	public static Connection getConnection() {

		try {

			Class.forName("org.gjt.mm.mysql.Driver");

			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

	public static Class35_36Product getProducyByID(int productID)
			throws SQLException {

		Connection connection = null;

		Class35_36Product product = null;
		try {

			String selectquery = "select * from test.product where product_id=?";

			connection = getConnection();

			PreparedStatement preparedStatement = connection
					.prepareStatement(selectquery);

			preparedStatement.setInt(1, productID);
			// executeQuery Method to run select statement and it return some
			// record we can read this using returnset.
			ResultSet resultSet = preparedStatement.executeQuery();

			// next method will move cursor. if there is next method it will
			// return true.
			if (resultSet.next()) {

				product = new Class35_36Product();

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

	public static void main(String[] args) throws SQLException {

		Class35_36Product product = getProducyByID(102);
		System.out.println("ProductID:" + product.getProductID());
		System.out.println("ProductName:" + product.getProductName());
		System.out.println("ProductPrice:" + product.getProductPrice());
		System.out.println("ProducDesc:" + product.getProductDescription());
	}

	// /////////////////////////////////////////////
	// public static ArrayList<Class35_36Product> getProducts()
	// throws SQLException {
	//
	// Connection connection = null;
	// // we are creating to store result
	// ArrayList<Class35_36Product> productList = new
	// ArrayList<Class35_36Product>();
	//
	// try {
	//
	// String selectquery = "select * from test.product";
	//
	// connection = getConnection();
	//
	// // don't have to use prepared statement if we are not using bind
	// // parameter.
	//
	// Statement statement = connection.createStatement();
	//
	// // executeQuery Method to run select statement.
	// ResultSet resultSet = statement.executeQuery(selectquery);
	//
	// // next method will move cursor. if there is next method it will
	// // return true.
	// if (resultSet.next()) {
	//
	// Class35_36Product product = new Class35_36Product();
	//
	// product.setProductID(resultSet.getInt("product_id"));
	// product.setProductName(resultSet.getString("product_name"));
	// product.setProductPrice(resultSet.getFloat("product_price"));
	// product.setProductDescription(resultSet
	// .getString("product_description"));
	//
	// // for each iteration we will create product object and we ll
	// // add to collections
	// productList.add(product);
	//
	// }
	//
	// } catch (Exception e) {
	// // TODO: handle exception
	// }
	//
	// return productList;
	//
	// }
	//
	// public static void main(String[] args) throws SQLException {
	//
	// Class35_36Product product = getProducts();
	// System.out.println("ProductID:" + product.getProductID());
	// System.out.println("ProductName:" + product.getProductName());
	// System.out.println("ProductPrice:" + product.getProductPrice());
	// System.out.println("ProducDesc:" + product.getProductDescription());
	// }

}
