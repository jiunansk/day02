package service.impl;

import dao.LoginDao;
import dao.impl.LoginImpl;
import pojo.User;
import service.Loginservice;

public class LoginServiceimpl implements Loginservice {
    LoginDao ld = new LoginImpl();

    @Override
    public User checkLoginsevice(String uname, String pwd) {
        return ld.checkLoginDao(uname, pwd);
    }
}
