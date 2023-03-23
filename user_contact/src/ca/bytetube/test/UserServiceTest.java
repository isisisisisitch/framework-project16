package ca.bytetube.test;

import ca.bytetube.domain.PageBean;
import ca.bytetube.domain.User;
import ca.bytetube.service.UserService;
import ca.bytetube.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTest {

    @Test
    public void testFindUseByPage(){
        UserService service = new UserServiceImpl();
        PageBean<User> pb = service.findUseByPage("1", "5");
        System.out.println(pb);

    }
}
