package com.zzy.zzycrm.mapper;

import com.zzy.zzycrm.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -20:40 -zzy-crm
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerMapperTest {

    @Autowired
    private CustomerMapper customerMapper;

   /* @Test
    public void add() {
        Customer cu = new Customer();
        cu.setCustomer_name("zzy");
        cu.setSex("男");
        cu.setAddress("广州");
        cu.setTelephone("912391");
        cu.setCreate_time("2019-11-01 00:00:00");
        cu.setUpdate_time("2019-11-01 00:00:00");

        int addCU = customerMapper.add(cu);
        System.out.println("添加成功0"+addCU);
    }

    @Test
    public void selectList(){
        System.out.println(customerMapper.selectList());

    }
    @Test
    public void findCustomerById(){
        System.out.println(customerMapper.findCustomerById(16));

    }*/
}