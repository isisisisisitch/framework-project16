package ca.bytetube.dao.impl;

import ca.bytetube.dao.UserDao;
import ca.bytetube.domain.User;
import ca.bytetube.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        List<User> users = null;
        try {
            String sql = "SELECT * FROM user";
            users = template.query(sql, new BeanPropertyRowMapper<>(User.class));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;

    }

    @Override
    public int findTotalCount() {
        Integer count = 0;
        try {
            String sql = "SELECT COUNT(*) FROM user";
            count = template.queryForObject(sql, Integer.class);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return count;
    }

    @Override
    public List<User> findUserByPage(int beginIndex, int rows) {
        List<User> users = null;
        try {
            String sql = "SELECT * FROM user LIMIT ?,?";
            users = template.query(sql, new BeanPropertyRowMapper<>(User.class), beginIndex, rows);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }
}
