package com.permadi.dbakses;

//import java sql semua package
import java.sql.*;

public class DatabaseAkses {
	//	var koneksi, statement, resultset	
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs = null;
		
	//	method databas eakses	
	public DatabaseAkses() {
		//	url localhost, port mysql, database		
		String url = "jdbc:mysql://localhost:3306/query_latihan0";
		//	username localhost		
		String user = "root";
		//	password localhost		
		String password = "";
		//	exception koneksi		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {			
			System.out.println(e);
		}
	}
	
	//	method view / select data tabel	
	public static void view() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("SELECT * FROM station");
		
		System.out.println("Semua Data dari Tabel Station :");
		
		int i = 1;
		
		while(rs.next()) {
			System.out.println("\nData No. "+ i );
			System.out.println("ID : " + rs.getString(1) + " ");
			System.out.println("CITY : " + rs.getString(2) + " ");
			System.out.println("STATE : " + rs.getString(3) + " ");
			System.out.println("LAT_N : " + rs.getString(4) + " ");
			System.out.println("LAT_W : " + rs.getString(5) + "");
			i++;
		}
	}
	
	public static void view1() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("SELECT DISTINCT CITY FROM station WHERE MOD(ID, 2) = 0");
				
		while(rs.next()) {
			System.out.println("CITY : " + rs.getString(1) + " \n");
		}
	}
	
	public static void view2() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("SELECT COUNT(CITY) as total_city, COUNT(DISTINCT CITY) as total_distinct, COUNT(CITY) - COUNT(DISTINCT CITY) FROM station");
		
		while(rs.next()) {
			System.out.println("Total City : " + rs.getString(1) + " \n");
			System.out.println("Total Distinct City : " + rs.getString(2) + " \n");
			System.out.println("City - Distinct City : " + rs.getString(3) + " \n");
		}
		
	}
	
	public static void view4() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("SELECT DISTINCT city FROM station WHERE city LIKE 'a%' OR city LIKE 'i%' OR city LIKE 'u%' OR city LIKE 'e%' OR city LIKE 'o%'");
		
		System.out.println("Data Kota dengan awalan huruf Vokal (A, I, U, E, O) :");
		
		while(rs.next()) {
			System.out.println("CITY : " + rs.getString(1) + " \n");
		}
		
	}
	
	public static void view5() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("SELECT DISTINCT city FROM station WHERE city LIKE '%a' OR city LIKE '%i' OR city LIKE '%u' OR city LIKE '%e' OR city LIKE '%o'");
		
		System.out.println("Data Kota dengan akhiran huruf Vokal (A, I, U, E, O) :");
		
		while(rs.next()) {
			System.out.println("CITY : " + rs.getString(1) + " \n");
		}
		
	}
	
	public static void view6() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("SELECT DISTINCT city FROM station WHERE city LIKE '%a%' OR city LIKE '%i%' OR city LIKE '%u%' OR city LIKE '%e%' OR city LIKE '%o%'");
		
		System.out.println("Data Kota dengan akhiran huruf Vokal (A, I, U, E, O) :");
		
		while(rs.next()) {
			System.out.println("CITY : " + rs.getString(1) + " \n");
		}
		
	}
	
	public static void view7() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("SELECT DISTINCT city FROM station WHERE NOT (city LIKE '%a' OR city LIKE '%i' OR city LIKE '%u' OR city LIKE '%e' OR city LIKE '%o')");
		
		System.out.println("Data Kota dengan akhiran bukan huruf Vokal (A, I, U, E, O) :");
		
		while(rs.next()) {
			System.out.println("CITY : " + rs.getString(1) + " \n");
		}
		
	}
	
}

























