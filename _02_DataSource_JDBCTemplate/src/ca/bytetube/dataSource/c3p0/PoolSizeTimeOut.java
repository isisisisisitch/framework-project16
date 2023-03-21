package ca.bytetube.dataSource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class PoolSizeTimeOut {
    public static void main(String[] args) throws SQLException {
//        //1.创建连接池对象
//        DataSource ds = new ComboPooledDataSource();
//
//        //2.获取连接对象
//        for (int i = 1; i <= 11; i++) {
//            Connection connection = ds.getConnection();
//            System.out.println(i+ ":" + connection);
//
//            if (i == 5) {
//                connection.close();
//            }
//
//        }
        testNamedConfig();

    }


    public static void testNamedConfig() throws SQLException {
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        for (int i = 1; i <= 8; i++) {
            Connection connection = ds.getConnection();
            System.out.println(i+ ":" + connection);

            if (i == 5) {
                connection.close();
            }

        }

    }
}
