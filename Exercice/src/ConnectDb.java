import java.sql.DriverManager;
import java.sql.*;
public class ConnectDb {
	private  Connection connexion=null;
	public ConnectDb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/depot","root","LeamonDev2022");
			if(connexion!=null)
				System.out.println("Working succesfuly");
			else 
				System.out.println("Not working!");

		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public Connection getconnexion() {
		return connexion;
	}
}
