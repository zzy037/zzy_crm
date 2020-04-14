package com.zzy.zzycrm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzy.zzycrm.entity.Customer;
import com.zzy.zzycrm.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -21:24 -zzy-crm
 **/
@Repository
public interface OrdersMapper extends BaseMapper<Orders> {
    @Select("select orders_id,price,order_time,customer_name,sex,address,telephone FROM orders,customer WHERE\n" +
            "orders.customer_id = customer.customer_id and orders.is_del=1")
    List<Orders> selectOrders();
}
