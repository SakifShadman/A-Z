package DBConnection;

import java.sql.*;

public class MySQLConnector {
    public static void  main(String[] args) throws  ClassNotFoundException, SQLException {

        //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
        String dbUrl = "jdbc:mysql://localhost:3306/emp";

        //Database Username
        String username = "root";

        //Database Password
        String password = "arnob5055";

        //Query to Execute
        String query = "select * from employee;";

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,username,password);

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        //While Loop to iterate through all data and print results
        while (rs.next()){
            String myName = rs.getString(1);
            String myAge = rs.getString(2);
            System. out.println(myName+"  "+myAge);
        }

        //closing DB Connection
        con.close();

        //Summary of Steps for Selenium Database Testing:

        //Step 1) Make a connection to the Database using method.
        //DriverManager.getConnection(URL, "userid", "password")

        //Step 2) Create Query to the Database using the Statement Object.
        //Statement stmt = con.createStatement();

        //Step 3) Send the query to database using execute query and store the results in the ResultSet object.
        //ResultSet rs = stmt.executeQuery(select * from employee;);

        //Java provides lots of built-in methods to process the> SQL Output using the ResultSet Object
    }
}