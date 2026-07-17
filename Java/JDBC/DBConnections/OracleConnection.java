package Java.JDBC.DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OracleConnection {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "";
        String password = "";
        String insertSql = "INSERT INTO student1 (name, roll, class) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
            Scanner sn = new Scanner(System.in)){
                conn.setAutoCommit(false);  // manage transaction manually

                System.out.println("Enter name: ");
                String name = sn.nextLine().trim();

                System.out.println("Enter roll no: ");
                int rollNo = Integer.parseInt(sn.nextLine().trim());

                System.out.println("Enter class: ");
                String cls = sn.nextLine().trim();

                try (PreparedStatement pst = conn.prepareStatement(insertSql)) {
                    pst.setString(1, name);
                    pst.setInt(2, rollNo);
                    pst.setString(3, cls);

                    int rows = pst.executeUpdate();
                    if (rows == 1) {
                        conn.commit();
                        System.out.println("Inserted Successfully");
                    } else {
                        conn.rollback();
                        System.out.println("Insertion failed, rolled back.");
                    }
                } catch (SQLException e) {
                    conn.rollback();
                    System.out.println("Insertion failed, rolled back." + e.getMessage());
                    e.printStackTrace();
                }

        } catch (SQLException e){
            System.out.println("DB connection error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
