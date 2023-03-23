package ca.bytetube.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    //1.定义DataSource

    private static DataSource ds;

    //文件读取，读取一次拿到信息
    static {
        try {
        //1.创建Properties对象
        Properties properties = new Properties();

        //2.获取src路径下的文件
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            InputStream is = classLoader.getResourceAsStream("druid.properties");
            //3.夹在文件
            properties.load(is);



             ds = DruidDataSourceFactory.createDataSource(properties);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static DataSource getDataSource(){
        return ds;
    }



    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
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

//    public static void main(String[] args) throws SQLException {
//        Connection connection = JDBCUtils.getConnection();
//        System.out.println(connection);
//    }



}
