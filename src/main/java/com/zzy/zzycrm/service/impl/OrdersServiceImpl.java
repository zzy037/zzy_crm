package com.zzy.zzycrm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzy.zzycrm.controller.CustomerController;
import com.zzy.zzycrm.entity.Customer;
import com.zzy.zzycrm.entity.Orders;
import com.zzy.zzycrm.mapper.CustomerMapper;
import com.zzy.zzycrm.mapper.OrdersMapper;
import com.zzy.zzycrm.service.OrdersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -21:36 -zzy-crm
 **/
@Service

public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;


    @Override
    public List<Orders> selectOrders() {
        return ordersMapper.selectOrders();
    }
}
