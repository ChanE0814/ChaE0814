package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// dao : DB �젒洹� 媛앹껜
public class Dao {
	
	protected Connection con;	// �뙣�궎吏�媛� �떖�씪�룄 �긽�냽諛쏆쑝硫� �젒洹쇨��뒫 // public , private , protected , default
	protected ResultSet rs;
	protected PreparedStatement ps;
	
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspweb?serverTimezone=UTC",
					"root","1234");
			System.out.println("�뿰�룞 �꽦怨�");
		}catch (Exception e) { System.out.println("�뿰�룞 �떎�뙣"+e);}
	}
}
