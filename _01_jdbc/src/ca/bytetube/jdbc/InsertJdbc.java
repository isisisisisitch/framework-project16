package ca.bytetube.jdbc;

import ca.bytetube.utils.JDBCUtils;

import java.sql.*;

public class InsertJdbc {
    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        conn = JDBCUtils.getConnection();
//        try {
//            //2.通过DriverManager获取数据库的连接对象
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb?" +
//                    "user=root&password=root");
//
//            // Do something with the Connection
//
//        } catch (SQLException ex) {
//            // handle any errors
//            System.out.println("SQLException: " + ex.getMessage());
//            System.out.println("SQLState: " + ex.getSQLState());
//            System.out.println("VendorError: " + ex.getErrorCode());
//        }


        Statement stmt = null;


        try {
            stmt = conn.createStatement();
            String sql = "INSERT into account VALUES(null,'dal',100)";
            int count = stmt.executeUpdate(sql);
            if (count > 0) {
                System.out.println("insert success");
            }else {
                System.out.println("insert fail");
            }
        }
        catch (SQLException ex){
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {
         JDBCUtils.close(conn,stmt);
        }

    }
}
