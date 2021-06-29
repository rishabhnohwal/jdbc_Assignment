package JDBC__Demo;

import java.sql.*;

public class JdbcAssignment {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mySQL","root","rishabh");

//        Retrieving

        Statement stmt1 = connection.createStatement();
        ResultSet resultSet = stmt1.executeQuery("select * from Sales_Rep");
        while (resultSet.next()){
            Integer repId = resultSet.getInt("Rep_ID");
            String name = resultSet.getString("Name");
            String city = resultSet.getString("City");
            Double commission = resultSet.getDouble("commision");
            System.out.println("Representative Id: "+repId+", Name: "+name+", City: "+city+", Commission: "+commission);
        }

//        Storing

        PreparedStatement stmt2 = connection.prepareStatement("insert into Sales_Rep values(?,?,?,?)");
        stmt2.setInt(1,1027);
        stmt2.setString(2,"Rishabh");
        stmt2.setString(3,"Faridabad");
        stmt2.setDouble(4,5.3);

        stmt2.executeUpdate();
        System.out.println("Record registered successfully");
    }
}
