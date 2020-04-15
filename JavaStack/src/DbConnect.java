import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public static void main(String[] args) {
        Connection con=null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:testlitedb.db");
            con.setAutoCommit(false);
            System.out.println("Connected!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e + "");
        }
    }


}
