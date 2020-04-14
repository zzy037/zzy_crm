package com.zzy.zzycrm.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -21:29 -zzy-crm
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdersMapperTest {

    @Autowired
    private OrdersMapper ordersMapper;

    @Test
    public void selectListOrders() {

        System.out.println(ordersMapper.selectOrders());
    }
}