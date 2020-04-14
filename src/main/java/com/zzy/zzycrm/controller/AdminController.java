package com.zzy.zzycrm.controller;

import com.zzy.zzycrm.entity.Admin;
import com.zzy.zzycrm.service.AdminService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -19:43 -zzy-crm
 **/
@Api(tags ="管理员登录")
@Controller
public class AdminController {

    @Autowired
   private AdminService adminService;
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(HttpSession httpSession) {
        if(httpSession.getAttribute("admin")!=null) {
            return "redirect:/Order/OrdersList";
        } else {
            return "login";
        }

    }

    /**
     * 用户登录验证
     */
    @RequestMapping(value="/logincheck", method= RequestMethod.POST)
    private String loginCheck(Admin admin, HttpSession httpSession) {
        if(httpSession.getAttribute("admin")!=null) {
            return "redirect:/Order/OrdersList";
        } else {
            // 非空校验
            if (admin.getAdmin_name() != null && admin.getPassword() != null) {
                logger.info("name:" + admin.getAdmin_name() + ",password:" + admin.getPassword());
                Admin administor = adminService.Login(admin);
                if (administor != null) {
                    httpSession.setAttribute("admin", administor);
                    logger.info("session设置");
                    logger.info("登录成功");
                    return "redirect:/Order/OrdersList";
                } else {
                    return "login";
                }
            } else {
                return "login";
            }
        }
    }


/*    @GetMapping("/")
    @ApiOperation("进入登录界面的接口")
    public String login(){
        log.info("进入登录界面");
        return "login";
    }

    @PostMapping("/login")
    @ApiOperation("登录的接口")
    public String login2(String adminName, String password){
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("admin_name",adminName);
        queryWrapper.eq("password",password);
        Admin admin = adminService.getOne(queryWrapper);
        if (admin!=null){
            log.info("登录成功，重定向到后台页面");
            return "redirect:/index";
        }else {
            log.info("登录失败，返回登录界面");
            return "login";
        }
    }*/
}
