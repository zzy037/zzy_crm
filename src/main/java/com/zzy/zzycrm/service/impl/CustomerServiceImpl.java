package com.zzy.zzycrm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzy.zzycrm.entity.Customer;
import com.zzy.zzycrm.mapper.CustomerMapper;
import com.zzy.zzycrm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -21:09 -zzy-crm
 **/
@Service

public class CustomerServiceImpl extends ServiceImpl<CustomerMapper,Customer> implements CustomerService {


}
