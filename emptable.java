import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class emptable {
    public static void main(String[] args) {

        // MySQL connection details
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb"; // Change your_database to your actual DB name
        String username = "root"; // Replace with your MySQL username
        String password = "connect"; // Replace with your MySQL password
        // MySQL-compatible CREATE TABLE statement
        String createTableSQL =
            "CREATE TABLE EMP (" +
            "EMPNO INT(4) PRIMARY KEY, " +
            "ENAME VARCHAR(10), " +
            "JOB VARCHAR(9), " +
            "MGR INT(4), " +
            "HIREDATE VARCHAR(30), " +
            "SAL DECIMAL(7,2), " +
            "COMM DECIMAL(7,2), " +
            "DEPTNO INT(2), " +
            "FOREIGN KEY (DEPTNO) REFERENCES DEPT(DEPTNO)" +
            ")";
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(createTableSQL);
            System.out.println("Table EMP created successfully.");
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
        }
    }
}