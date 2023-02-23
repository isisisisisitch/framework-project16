package ca.bytetube.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class QuickStart {

    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        try {
            //2.通过DriverManager获取数据库的连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb?" +
                    "user=root&password=root");

            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        //3.编写sql
        String sql = "UPDATE account set money = 8000 where id = 1";

        //4.获取sql的执行对象
        Statement stmt = conn.createStatement();

        //5.执行sql
        int count = stmt.executeUpdate(sql);

        //6.处理结果
        System.out.println(count);

        //7.释放资源
        stmt.close();
        conn.close();


    }
}
