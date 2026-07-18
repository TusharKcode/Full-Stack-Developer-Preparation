package Java.JDBC.DBConnections;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RetrieveMetaData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // load MySQL JDBC driver class

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "password");

            DatabaseMetaData metaData = con.getMetaData();  // Retrieve metadata about the database

            System.out.println("\n\tDatabase Product Name: " + metaData.getDatabaseProductName());  // Print the name of the database product
            System.out.println("\n\tDatabase Product Version: " + metaData.getDatabaseProductVersion()); // Print the version of the database product
            System.out.println("Driver Name: " + metaData.getDriverName()); // Print the name of the JDBC driver being used
            System.out.println("Driver Version: " + metaData.getDriverVersion());   // Print the version of the JDBC driver being used
            System.out.println("Database Connection Information: " + metaData.getConnection()); // Print the connection information
            System.out.println("Database User Name : " + metaData.getUserName()); // Print the username of the current user accessing the database
            System.out.println("Database URL Information : " + metaData.getURL()); // Print the URL of the database connection
            System.out.println("Database Time Date Functions : " + metaData.getTimeDateFunctions()); // Print the time and date functions supported by the database

            con.close();    // Close the database connection
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception is " + e.getMessage());   // handle exceptions that will occur during the process
        }
    }
}
