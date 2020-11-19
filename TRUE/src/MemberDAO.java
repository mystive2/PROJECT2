import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	String driver = "oracle.jdbc.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521/xe";
	String user="green";
	String password = "green1234";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	public void insert() { //아기등록. 데이터 저장하는 기능 
		try {
			connDB();
			System.out.println("MemberDAO --------------");
			System.out.println("P.getS() : " + P.getS());
		String query= "INSERT INTO BABYI (NAME,BIRTH) VALUES ('"+P.getS()+"','1989.11.15')";
		System.out.println(query);
		rs=stmt.executeQuery(query);
		//String a=P.textField.getText();
		//System.out.println(P.getS());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con= DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt=con.createStatement();
			System.out.println("statement create success.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
