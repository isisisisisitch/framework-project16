package ca.bytetube.test;

import ca.bytetube.dao.UserDao;
import ca.bytetube.dao.impl.UserDaoImpl;
import ca.bytetube.domain.User;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void testFindTotalCount(){
        UserDao dao = new UserDaoImpl();
        int count = dao.findTotalCount();
        System.out.println(count);
    }

    @Test
    public void testFindUserByPage(){
        UserDao dao = new UserDaoImpl();
        List<User> users = dao.findUserByPage(1,5);
        System.out.println(users);
    }

    @Test
    public void testFindAll(){
        UserDao dao = new UserDaoImpl();
        List<User> users = dao.findAll();
        System.out.println(users);
    }





}
