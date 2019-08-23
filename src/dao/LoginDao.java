package dao;

import pojo.User;

public interface LoginDao {
    User checkLoginDao(String uname,String pwd);
}
