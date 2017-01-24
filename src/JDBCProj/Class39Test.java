package JDBCProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

import com.mysql.jdbc.CallableStatement;

public class Class39Test {

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
			// executeQuery Method to run select statement.
			ResultSet resultSet = preparedStatement.executeQuery();

			// next method will move cursor. if there is next method it will
			// return true.
			if (resultSet.next()) {

				product = new Class35_36Product();

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

		Connection connection = getConnection();
		String proceCall = "call test.checkTax(?,?)";

		// CallableStatement to run Procedure.
		CallableStatement callableStatement = connection.prepareCall(proceCall);

		// registering out parameter
		callableStatement.registerOutParameter(1, Types.VARCHAR);

		// registering in Parameter.
		callableStatement.setInt(1, 101);

		// to run Procedure.
		callableStatement.executeUpdate();

		// Reading outParameter Value.
		System.out.println(callableStatement.getString(1));

	}

}
