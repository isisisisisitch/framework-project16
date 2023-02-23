package ca.bytetube.jdbc;


import ca.bytetube.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class JdbcLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz input your username:");
        String username = sc.nextLine();
        System.out.println("plz input your password:");
        String password = sc.nextLine();
        boolean isLogin = login(username, password);
        if (isLogin) {
            System.out.println("login success");
        } else {
            System.out.println("login fail");
        }

    }

    public static boolean login(String username, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM tab_user WHERE user_name = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);

            pstmt.setString(2, password);

            rs = pstmt.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, stmt, rs);
        }


        return false;


    }
}
