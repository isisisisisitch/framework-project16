package ca.bytetube.service.impl;

import ca.bytetube.dao.UserDao;
import ca.bytetube.dao.impl.UserDaoImpl;
import ca.bytetube.domain.PageBean;
import ca.bytetube.domain.User;
import ca.bytetube.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao dao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        List<User> users = dao.findAll();
        return users;
    }

    @Override
    public PageBean<User> findUseByPage(String str_curPage, String str_rows) {
        int curPage = Integer.parseInt(str_curPage);
        int rows = Integer.parseInt(str_rows);
        //1.创建pb对象
        PageBean<User> pb = new PageBean<>();
        //2.设置pb参数
        pb.setCurPage(curPage);
        pb.setRows(rows);
        //3.调用dao的方法获取totalCount
        int totalCount = dao.findTotalCount();
        pb.setTotalCount(totalCount);
        //4.计算totalPage,pb设置totalPage参数
        int totalPage = totalCount % rows == 0 ? totalCount / rows : (totalCount / rows) + 1;
        pb.setTotalPage(totalPage);
        //5.计算beginIndex
        int beginIndex = (curPage - 1) * rows;

        //6.调用dao的方法获取list
        List<User> users = dao.findUserByPage(beginIndex,rows);
        pb.setList(users);
        //7.返回pb
        return pb;
    }
}
