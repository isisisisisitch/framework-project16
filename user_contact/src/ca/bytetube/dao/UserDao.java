package ca.bytetube.dao;

import ca.bytetube.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();

    public int findTotalCount();

    public List<User> findUserByPage(int beginIndex, int rows);
}
