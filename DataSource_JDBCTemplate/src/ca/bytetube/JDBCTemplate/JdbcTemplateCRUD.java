package ca.bytetube.JDBCTemplate;

import ca.bytetube.dataSource.utils.JDBCUtils;
import ca.bytetube.domain.Emp;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class JdbcTemplateCRUD {

    private  JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    //      1. 修改1001号数据的 salary 为 10000
    //		2. 添加一条记录
    //		3. 删除刚才添加的记录
    //		4. 查询id为1001的记录，将其封装为Map集合
    //		5. 查询所有记录，将其封装为List
    //		6. 查询所有记录，将其封装为Emp对象的List集合
    //		7. 查询总记录数

    @Test
    public void update(){
        // 1. 修改1号数据的 salary 为 10000
        String sql = "UPDATE emp set salary = ? where id = ?";
        int count = template.update(sql, 10000, 1001);
        Assert.assertEquals(1,count);
    }


    @Test
    public void add(){
        // 2. 添加一条记录
        String sql = "INSERT INTO emp(id,ename,bonus,dept_id) VALUES(?,?,?,?)";
        int count = template.update(sql, 1015,"testInsert",10000,20);
        Assert.assertEquals(1,count);
    }


    @Test
    public void delete(){
        // 3. 删除刚才添加的记录
        String sql = "DELETE FROM emp where id = ? ";
        int count = template.update(sql, 1015);
        Assert.assertEquals(1,count);
    }

    @Test
    public void queryForOne(){
        //4. 查询id为1001的记录，将其封装为Map集合
        String sql = "SELECT * FROM EMP  WHERE id = ? ";

        Map<String, Object> map = template.queryForMap(sql, 1001);
        //{id=1001, ename=dal, job_id=4, mgr=1004, joindate=2000-12-17,
        // salary=10000.00, bonus=null, dept_id=20}
        System.out.println(map);
    }

    @Test
    public void queryForList(){
        //4. 查询id为1001的记录，将其封装为Map集合
        String sql = "SELECT * FROM EMP";
        List<Map<String, Object>> lists = template.queryForList(sql);
        for (Map<String, Object> map :lists) {
            System.out.println(map);
        }
    }


    @Test
    public void queryForListObj(){
        //4. 查询id为1001的记录，将其封装为Map集合
        String sql = "SELECT * FROM EMP";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                int id = rs.getInt("id");
                String name = rs.getString("ename");
                int jobId = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joinDate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int deptId = rs.getInt("dept_id");

                return new Emp( id,  name,  jobId,  mgr, joinDate,  salary,  bonus,  deptId);

            }
        });

        System.out.println(list);

    }


    @Test
    public void queryForListObj_2(){
        //4. 查询id为1001的记录，将其封装为Map集合
        String sql = "SELECT * FROM EMP";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));

        for ( Emp emp:list) {
            System.out.println(emp);
        }

    }

    @Test
    public void queryForCount(){
        //		7. 查询总记录数
        //4. 查询id为1001的记录，将其封装为Map集合
        String sql = "SELECT COUNT(id) FROM emp";
        Integer total = template.queryForObject(sql, Integer.class);
        int t = total;
        Assert.assertEquals(14,t);

    }




}
