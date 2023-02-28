package ca.bytetube.dataSource.druid;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class QuickStart {
    public static void main(String[] args) throws Exception {
        //1.创建Properties对象
        Properties properties = new Properties();

        //2.获取src路径下的文件
        ClassLoader classLoader = QuickStart.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("druid.properties");
        properties.load(is);
       // System.out.println("code is here");

        //获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(properties);

        Connection conn = ds.getConnection();
        System.out.println(conn);

    }
}
