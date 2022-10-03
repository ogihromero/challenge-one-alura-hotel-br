package db.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class TestesDB {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		PreparedStatement stm = connection.prepareStatement("SHOW TABLES");
		stm.execute();
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			System.out.println(rst.getString(1));
		}

		System.out.println("Fechando conexão!!");
		rst.close();
		stm.close();
		connection.close();
	}

}
