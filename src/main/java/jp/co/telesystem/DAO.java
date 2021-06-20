package jp.co.telesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {

	public String insertTele(String data1, String data2) {

		try {

			//DB 接続

			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgresql108");
		    con.setAutoCommit(false);

		    //SQL 作成

		    String SQL1 = "INSERT INTO public.\"Tele\"(\"USERNAME\", \"TELENUMBER\")VALUES(?,?)";
		    PreparedStatement ps = con.prepareStatement(SQL1);
		    ps.setString(1,  data1);
		    ps.setString(2,  data2);

		    //実行
		    ps.executeUpdate();
		    con.commit();
		    return "成功";

		} catch(Exception e) {

			System.out.println("error happen");
			return "失敗";

		}

	}

}
