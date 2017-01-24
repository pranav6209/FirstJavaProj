package JDBCProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Class38Test {

	
	
	
	public static void addProduct(Class35_36Product product)
			throws SQLException {

		Connection connection = null;
		try {

			// ? called bind Parameter which will work as place holder.

			// Each Bind Parameter starts with 0. Most left one is zero

			String insertQuery = "insert into test.product(product_id,product_name,product_price,product_description)"
					+ "values(?,?,?,?)";

			// Loading JDBC Driver.
			Class.forName("org.gjt.mm.mysql.Driver");

			// Establish a connection
			// 3306 port no of DB. test: Db Schema name.root, root username and
			// pwd
			// all this parameter all together is says connection url.
			
			// DriverManager manages all the driver.
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");

			// It will return preparedStatement object referance.
			// preparedStatement is use to execute a query.

			PreparedStatement preparedStatement = connection
					.prepareStatement(insertQuery);

			// we can access bindParameter using this.
			// index 1 as first bind parameter.
			preparedStatement.setInt(1, product.getProductID());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setFloat(3, product.getProductPrice());
			preparedStatement.setString(4, product.getProductDescription());

			// execute update when we want use insert query
			int i = preparedStatement.executeUpdate();

			if (i == 1) {
				System.out.println("Record Added Successfully");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
				connection = null;
			}
		}
	}

	public static void main(String[] args) throws SQLException {

		Class35_36Product product = new Class35_36Product(125, "Galaxy Grand",
				"Smart Phone", 2000);
		addProduct(product);

	}
}
