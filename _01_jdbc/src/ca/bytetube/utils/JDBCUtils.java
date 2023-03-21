package ca.bytetube.utils;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    //文件读取，读取一次拿到信息
    static {
        try {
        //1.创建Properties对象
        Properties properties = new Properties();

        //2.获取src路径下的文件
        ClassLoader classLoader = JDBCUtils.class.getClassLoader();
        URL resource = classLoader.getResource("jdbc.properties");
        String path = resource.getPath();
            //3.夹在文件
            properties.load(new FileReader(path));

            //4.获取数据
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    //conn, stmt
    public static void close(Connection conn,  Statement stmt){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException sqlEx) { } // ignore

            conn = null;
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException sqlEx) { } // ignore

            stmt = null;
        }
    }


    //conn, rs,stmt
    public static void close(Connection conn,  Statement stmt, ResultSet rs){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException sqlEx) { } // ignore

            conn = null;
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException sqlEx) { } // ignore

            rs = null;
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException sqlEx) { } // ignore

            stmt = null;
        }


    }


    //stmt
    public static void close(Statement stmt1, Statement stmt2){

        if (stmt1 != null) {
            try {
                stmt1.close();
            } catch (SQLException sqlEx) { } // ignore

            stmt1 = null;
        }

        if (stmt2 != null) {
            try {
                stmt2.close();
            } catch (SQLException sqlEx) { } // ignore

            stmt2 = null;
        }


    }



}
