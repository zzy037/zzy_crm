package com.zzy.zzycrm.controller;

import com.zzy.zzycrm.entity.Customer;

import com.zzy.zzycrm.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -21:14 -zzy-crm
 **/
@Api(tags = "客户信息管理接口")
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @ApiOperation(value = "查询所有")
    @GetMapping("/selectList")
    public String selectList(Model model){
        List<Customer> customers = customerService.list();
        logger.info("查询所有");
        model.addAttribute("customers", customers);
        return "customerlist";
    }


    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ApiOperation(value = "删除")
    public String delete(Integer id){
        customerService.removeById(id);
        return "redirect:/customer/selectList";
    }

    @ApiOperation(value = "根据ID查询")
    @RequestMapping(value = "/toEdit" , method = RequestMethod.GET)
    public String toEdit(Model model,int id) {
        Customer customer = customerService.getById(id);
        model.addAttribute("customer", customer);
        return "edit";
    }
    @ApiOperation(value = "修改")
    @RequestMapping(value = "/update" , method = RequestMethod.POST)
    public String updateCustomer(@ApiParam(name = "customer",value = "customer对象")Customer customer){
        customerService.updateById(customer);
        return "redirect:/customer/selectList";
    }

    @RequestMapping(value = "/toAdd" , method = RequestMethod.GET)
    public String addCus() {
        return "add";
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加")
    public String add(Customer customer){
        customerService.save(customer);
        return "redirect:/customer/selectList";
    }


}
