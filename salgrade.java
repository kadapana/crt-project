import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class salgrade {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb"; 
        String username = "root";                         
        String password = "connect";                          
        String createTableSQL =
            "CREATE TABLE SALGRADE (" +
            "GRADE INT, " +
            "LOSAL DECIMAL(10,2), " +
            "HISAL DECIMAL(10,2)" +
            ")";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(createTableSQL);
            System.out.println("Table SALGRADE created successfully.");

        } catch (SQLException e) {
            System.err.println("Error creating SALGRADE table: " + e.getMessage());
        }
    }
}

