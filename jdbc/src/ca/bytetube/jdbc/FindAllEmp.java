package ca.bytetube.jdbc;

import ca.bytetube.domain.Emp;
import ca.bytetube.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FindAllEmp {

    public static void main(String[] args) {
        List<Emp> all = findAll();
        System.out.println(all);

    }



    public static List<Emp> findAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from emp";
            rs = stmt.executeQuery(sql);
            Emp emp = null;
            list = new ArrayList<>();
            while (rs.next()){

                int id = rs.getInt("id");
                String name = rs.getString("ename");
                int jobId = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joinDate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int deptId = rs.getInt("dept_id");

                emp = new Emp( id,  name,  jobId,  mgr, joinDate,  salary,  bonus,  deptId);
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,stmt,rs);
        }

        return list;

    }
}
