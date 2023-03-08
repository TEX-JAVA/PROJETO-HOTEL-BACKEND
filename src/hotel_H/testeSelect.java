package hotel_H;
import java.sql.*;

import dao.ConnectionFactory;

public class testeSelect {
	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionFactory.connect();
		String sql = "select * from quarto";
		conn.prepareStatement(sql);
		
		conn.close();
	}
}
