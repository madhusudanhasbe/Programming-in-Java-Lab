package Assignment8and10;

import java.sql.*;

public class DatabaseHandler {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void createTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee ("
                + "id VARCHAR(20) PRIMARY KEY, "
                + "name VARCHAR(50), "
                + "age INT, "
                + "email VARCHAR(50), "
                + "department VARCHAR(50))";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(createTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registerEmployee(Employee employee) {
        String insertSQL = "INSERT INTO Employee (id, name, age, email, department) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, employee.getId());
            pstmt.setString(2, employee.getName());
            pstmt.setInt(3, employee.getAge());
            pstmt.setString(4, employee.getEmail());
            pstmt.setString(5, employee.getDepartment());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewEmployees() {
        String selectSQL = "SELECT * FROM Employee";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getString("id")
                        + ", Name: " + rs.getString("name")
                        + ", Age: " + rs.getInt("age")
                        + ", Email: " + rs.getString("email")
                        + ", Department: " + rs.getString("department"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(Employee employee) {
        String updateSQL = "UPDATE Employee SET name = ?, age = ?, email = ?, department = ? WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
            pstmt.setString(1, employee.getName());
            pstmt.setInt(2, employee.getAge());
            pstmt.setString(3, employee.getEmail());
            pstmt.setString(4, employee.getDepartment());
            pstmt.setString(5, employee.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
