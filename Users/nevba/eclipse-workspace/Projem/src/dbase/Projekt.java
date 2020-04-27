package dbase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.jdbc.Connection;

public class Projekt {

	public static void main(String[] args) {

		try {

			//Hocam sonunda oldu
			System.out.println("asd");
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projekt?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs =myStat.executeQuery("select* from mitarbeiter");
			while(myRs.next()) {
			System.out.print(myRs.getString("mitarb_operator")+" - "+myRs.getString("mitarb_degerlendiren")+" - "+ myRs.getString("mitarb_onay")+" - "+myRs.getString("mitarb_customer"));

			}
		} 
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	

}
