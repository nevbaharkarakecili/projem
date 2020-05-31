package dbase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.jdbc.Connection;

public class Projekt {

	public static void main(String[] args) {

		try {

			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projekt?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs =myStat.executeQuery("select* from mitarbeiter");
			/*
			 * 
			 * while(myRs.next()) {
			System.out.print(myRs.getString("personel_bilgi")+" - "+myRs.getString("adi_soyadi")+" - "+ myRs.getString("seviye")+" - "+myRs.getString("tarih")+myRs.getString("imza"));

			}
			*
			*
			*/
		} 
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	

}
