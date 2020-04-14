package com.zzy.zzycrm.Inteceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author 邹靓仔
 * @date 2020/3/8 -21:32 -zzy-crm
 **/
public class LoginInteceptor extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // 从session中取出用户信息来
        Object adminObj = request.getSession().getAttribute("admin");
        if (adminObj != null) {
            return true;
        }
        // 若不满足登录验证，则直接跳转到帐号登录页面
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<script>");
        out.println("window.open ('" + request.getContextPath() + "/login','_self')");
        out.println("</script>");
        out.println("</html>");
        return false;
    }

}
