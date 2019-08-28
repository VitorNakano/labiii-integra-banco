import java.sql.*;

public class Main {
    public static void connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:db.sqlite");
            Statement stmt = conn.createStatement();
            /*String sql = "CREATE TABLE Persons (" +
                    "    PersonID int," +
                    "    LastName varchar(255)," +
                    "    FirstName varchar(255)," +
                    "    Address varchar(255)," +
                    "    City varchar(255)" +
                    ");";*/
            String sql = "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)" +
                         "VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');";
            stmt.execute(sql);

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
