import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateTable {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb";  // your DB URL & name
        String username = "root";       // your MySQL username
        String password = "connect";   // your MySQL password

        String createTableSQL = "CREATE TABLE DEPT ("
                              + "DEPTNO INT PRIMARY KEY, "
                              + "DNAME VARCHAR(14), "
                              + "LOC VARCHAR(13)"
                              + ")";

        try (
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            Statement stmt = conn.createStatement()
        ) {
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table DEPT created successfully.");
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }
}

