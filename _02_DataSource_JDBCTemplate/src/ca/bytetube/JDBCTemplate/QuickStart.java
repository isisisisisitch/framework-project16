package ca.bytetube.JDBCTemplate;

import ca.bytetube.dataSource.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuickStart {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "UPDATE account set money = money + 1000 WHERE id = ?";
        int count = template.update(sql, 2);
        System.out.println(count);


    }
}
