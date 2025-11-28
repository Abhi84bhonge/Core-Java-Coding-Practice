import java.
sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prepdstatement {

    public static void register(int id, String name) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projectnew",
                "root",
                "abhijeet@123"
            );

            String query = "update projectnew set city=? where id=?";
            PreparedStatement stmt = con.prepareStatement(query);
          
            stmt.setString(1, name);
            stmt.setInt(2, id);
          int rows=  stmt.executeUpdate();
           if(rows>0) {
            System.out.println("data updated successfusslly!!");
           }
            con.close();  // closing connection

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Prepdstatement.register(4,"Baner");
    }
}
