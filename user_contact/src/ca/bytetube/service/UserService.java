package ca.bytetube.service;

import ca.bytetube.domain.PageBean;
import ca.bytetube.domain.User;

import java.util.List;

public interface UserService {

   public List<User> findAll();

    public PageBean<User> findUseByPage(String curPage, String rows);
}
