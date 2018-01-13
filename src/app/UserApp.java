package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.User;

public class UserApp {
	public static void main(String[] args) {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warsztat2?useSSL=false", "root", "coderslab");
			User u = new User ("marcin15", "pietryga15", "haslo15");
			//u.setUserGroupId(1);
			//u.save(conn);
			//Ewentualnie w innym miejsu programu będzie
			User u2 = User.loadById(conn, 6);
			System.out.println("--------------------------------------------------------");
			User[] u3 = User.loadAllUsers(conn);
			conn.close();
			System.out.println("---------------------------");
			u.delete(conn);
			System.out.println("---------------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
