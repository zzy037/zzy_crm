package com.zzy.zzycrm.mapper;

import com.zzy.zzycrm.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -19:09 -zzy-crm
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminMapperTest {
    @Autowired
    private AdminMapper adminMapper;

   /* @Test
    public void Login() {

        Admin admin =new Admin();
        admin.setAdmin_name("zzy");
        admin.setPassword("123456");

        Admin login = adminMapper.Login(admin);
        System.out.println(login);

    }*/
}