package Java.JDBC.DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/database_name";  // Database details
        String username = "";                                      // MySQL credentials
        String password = "";
        String query = "select * from students";                   // Query to be run

        Class.forName("com.mysql.cj.jdbc.Driver");  // Load and register the driver

        Connection conn = DriverManager.getConnection(url, username, password); // Establish connection
        System.out.println("Connection established successfully");

        Statement st = conn.createStatement();  // Create a statement
        ResultSet rs = st.executeQuery(query);  // Execute the query

        while(rs.next()){                       // Process the results
            String name = rs.getString("name");   // Retrieve name from db
            System.out.println(name);           // Print result on console
        }

        st.close();
        conn.close();
        System.out.println("Connection closed");
    }
}
