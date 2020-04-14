package com.zzy.zzycrm.controller;

import com.zzy.zzycrm.entity.Customer;
import com.zzy.zzycrm.entity.Orders;
import com.zzy.zzycrm.service.OrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -21:39 -zzy-crm
 **/
@Api(tags = "订单管理接口")
@Controller
@RequestMapping("/Order")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @ApiOperation(value = "订单查询")
    @GetMapping("/OrdersList")
    public String  selectList(Model model) {
        List<Orders> orders = ordersService.selectOrders();
        logger.info("订单查询");
        model.addAttribute("orders", orders);
        return "list";

    }

    @RequestMapping(value = "/toAdd", method = RequestMethod.GET)
    public String addCus() {
        return "orderadd";
    }
    @ApiOperation(value = "添加")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ApiParam(name = "name",value = "对象") Orders orders){
        ordersService.save(orders);
        return "redirect:/Order/OrdersList";
    }

    @ApiOperation(value = "删除")
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(Integer id){
        ordersService.removeById(id);
        return "redirect:/Order/OrdersList";
    }

}
