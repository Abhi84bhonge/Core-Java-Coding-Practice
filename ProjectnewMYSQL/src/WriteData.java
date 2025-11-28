import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class WriteData {

public static void main(String[] args) {
	
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectnew","root","abhijeet@123");
		 Statement stmt=con.createStatement();
		
		String query="update projectnew set name='Sadanand' where id=2";
		 int rs=stmt.executeUpdate(query);
		 if(rs>0) {
			 System.out.println("data add successfully ");
		 }
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  
	} 

}
