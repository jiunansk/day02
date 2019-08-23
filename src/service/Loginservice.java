package service;

import pojo.User;

public interface Loginservice {
    User checkLoginsevice(String uname, String pwd);
}
