package JDBC__Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mySQL","root","rishabh");
        PreparedStatement pstmt = connection.prepareStatement("insert into Sales_Rep values(?,?,?,?)");
        pstmt.setInt(1,27);
        pstmt.setString(2,"Rishabh");
        pstmt.setString(3,"Faridabad");
        pstmt.setDouble(4,5.3);

        System.out.println("Record registered successfully");
        pstmt.executeUpdate();
    }
}
