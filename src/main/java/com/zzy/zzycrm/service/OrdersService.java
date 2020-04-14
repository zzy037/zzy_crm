package com.zzy.zzycrm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzy.zzycrm.entity.Customer;
import com.zzy.zzycrm.entity.Orders;

import java.util.List;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -21:35 -zzy-crm
 **/
public interface OrdersService extends IService<Orders> {

    List<Orders> selectOrders();

}
