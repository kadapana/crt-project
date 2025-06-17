import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class bonustable {
    public static void main(String[] args) {

        // MySQL connection details - update database, username, password accordingly
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "connect";

        // MySQL-compatible CREATE TABLE statement
        String createTableSQL =
            "CREATE TABLE BONUS (" +
            "ENAME VARCHAR(10), " +
            "JOB VARCHAR(9), " +
            "SAL DECIMAL(10,2), " +
            "COMM DECIMAL(10,2)" +
            ")";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(createTableSQL);
            System.out.println("Table BONUS created successfully.");

        } catch (SQLException e) {
            System.err.println("Error creating BONUS table: " + e.getMessage());
        }
    }
}
