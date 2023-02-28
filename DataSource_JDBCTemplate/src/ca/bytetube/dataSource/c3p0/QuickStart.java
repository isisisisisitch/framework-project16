package ca.bytetube.dataSource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class QuickStart {

    public static void main(String[] args) {
        //1.创建连接池对象
        DataSource ds = new ComboPooledDataSource();

        //2.获取连接对象
        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //com.mchange.v2.c3p0.impl.NewProxyConnection@d041cf
        System.out.println(conn);


    }


}
