package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.User;

public class UserApp {
	
public static void main(String[] args) {
	
	Connection conn=null;
	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warsztat2?useSSL=false", "root", "coderslab");
		User u =new User("marcin2", "pietryga2", "haslo2");
		u.setUserGroupId(1);
		u.save(conn);
		conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}
