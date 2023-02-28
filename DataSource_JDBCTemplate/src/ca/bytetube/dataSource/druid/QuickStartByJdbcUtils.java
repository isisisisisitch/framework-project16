package ca.bytetube.dataSource.druid;

import ca.bytetube.dataSource.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QuickStartByJdbcUtils {

    public static void main(String[] args)  {
        //向account中插入一条记录

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "INSERT into account VALUES(null,?,?)";
             pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"test");

            pstmt.setFloat(2,200f);

            int count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,pstmt);
        }





    }
}
