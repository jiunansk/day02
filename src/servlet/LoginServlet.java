package servlet;

import pojo.User;
import service.Loginservice;
import service.impl.LoginServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jsp/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        设置相应编码格式
        resp.setContentType("text/html;charset=utf-8");
//        获取请求信息
        String uname=req.getParameter("uname");
        String pwd=req.getParameter("pwd");
        System.out.println(uname);
        System.out.println(pwd);
//        处理请求
        Loginservice ls=new LoginServiceimpl();
        User u=ls.checkLoginsevice(uname,pwd);
        System.out.println(u);
//        相应结果
        if (u!=null){
            resp.getWriter().write("登录成功");
        }else {
            resp.getWriter().write("登录失败");
        }
    }
}
