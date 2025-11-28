import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	
	  public static void main(String[] args) {
		
		  try {
		 Class.forName("com.mysql.cj.jdbc.Driver"); 
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectnew","root","abhijeet@123");
		 String query="alter table projectnew add column city Varchar(20)";
		 Statement stmt=con.createStatement();
//		 ResultSet rs=stmt.executeQuery(query);
//		 while(rs.next()) {
//			int id=rs.getInt(1);
//			String name=rs.getString(2);
//		 
//		 System.out.println(id+""+name);
//		  }
		 stmt.executeUpdate(query);
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  
	} 
	
}
