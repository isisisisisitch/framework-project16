package ca.bytetube.jdbc;

import ca.bytetube.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionJdbc {

    public static void main(String[] args)  {

        Connection connection = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            //1.获取连接
            connection = JDBCUtils.getConnection();
            //1.开启事务
            connection.setAutoCommit(false);

            //2.定义sql
            String sql1 = "UPDATE account set money = money - ? WHERE id = ?";
            String sql2 = "UPDATE account set money = money + ? WHERE id = ?";

            //3.connection 获取 PreparedStatement
             pstmt1 = connection.prepareStatement(sql1);
             pstmt2 = connection.prepareStatement(sql2);

            //4.PreparedStatement设置参数
            pstmt1.setFloat(1, 1000.0f);
            pstmt1.setInt(2, 1);

            pstmt2.setFloat(1, 1000.0f);
            pstmt2.setInt(2, 2);


            //5. 执行sql
            pstmt1.executeUpdate();

            int i = 10/0;

            pstmt2.executeUpdate();

            //	2.提交事务
            connection.commit();

        } catch (Exception e) {
            //3.事务回滚
            try{
                connection.rollback();
            }catch (SQLException e1){
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(connection,null);
            JDBCUtils.close(pstmt1,pstmt2);
        }


    }




}
