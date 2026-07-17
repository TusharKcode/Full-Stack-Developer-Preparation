package Java.JDBC.DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCoperations {

    private static Connection getConnection() throws Exception {    // Establish database connection
        String jdbcUrl = "jdbc:mysql://localhost:3306/data";
        String jdbcUser = "root";
        String jdbcPassword = "password";
        return DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
    }

    private static void insertRecord(Connection connection, String name, double salary) throws Exception {
        String query = "INSERT INTO employees (name, salary) VALUES (?, ?)";    // Insert record into the database
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setDouble(2, salary);
        preparedStatement.executeUpdate();
        
        System.out.println("Record inserted successfully.");
    }

    private static void updateRecord(Connection connection, int id, String name,double salary) throws Exception {
        String query = "UPDATE employees SET name = ?, salary = ? WHERE id = ?";    // Update record in the database
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setDouble(2, salary);
        preparedStatement.setInt(3, id);
        preparedStatement.executeUpdate();
        
        System.out.println("Record updated successfully.");
    }

    private static void retrieveRecords(Connection connection) throws Exception {
        Statement statement = connection.createStatement();     // Retrieve records from the database
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
        
        System.out.println("Records in the database:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double salary = resultSet.getDouble("salary");
            System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
        }
    }

    private static void deleteRecord(Connection connection, int id) throws Exception {
        String query = "DELETE FROM employees WHERE id = ?";    // Delete record from the database
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        System.out.println("Record deleted successfully.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Connection connection = getConnection();

            System.out.println("Select an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Retrieve");
            System.out.println("4. Delete");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    
                    String nameToInsert = scanner.next();
                    System.out.println("Enter salary:");
                    double salaryToInsert = scanner.nextDouble();
                    insertRecord(connection, nameToInsert,
                    salaryToInsert);
                    break;

                case 2:
                    System.out.println("Enter ID to update:");
                    int idToUpdate = scanner.nextInt();
                    System.out.println("Enter new name:");
                    String nameToUpdate = scanner.next();
                    System.out.println("Enter new salary:");
                    double salaryToUpdate
                    = scanner.nextDouble();
                    updateRecord(connection, idToUpdate,
                    nameToUpdate, salaryToUpdate);
                    break;

                case 3:
                    retrieveRecords(connection);
                    break;

                case 4:
                    System.out.println("Enter ID to delete:");
                    int idToDelete = scanner.nextInt();
                    deleteRecord(connection, idToDelete);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
                }
                connection.close(); // Close the connection at the end
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
