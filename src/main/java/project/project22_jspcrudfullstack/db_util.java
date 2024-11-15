package project.project22_jspcrudfullstack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_util {
    private static Connection con = null;
    public static Connection getConnection() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            if(con == null){
                con = DriverManager.getConnection(
                    "jdbc:mariadb://walab.handong.edu:3306/OSS24_22300348?user=OSS24_22300348&password=Aef1nood");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
    public static void closeConnection() {
        try{
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

//    public static void main(String args[]){
//        Connection new_connection = db_util.getConnection();
//        if(new_connection != null){
//            System.out.println("connected to db");
//        }
//        db_util.closeConnection();
//    }
}
