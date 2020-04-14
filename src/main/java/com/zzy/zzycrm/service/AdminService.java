package com.zzy.zzycrm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzy.zzycrm.entity.Admin;
import com.zzy.zzycrm.entity.Customer;
import org.springframework.stereotype.Service;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -19:30 -zzy-crm
 **/

public interface AdminService extends IService<Admin> {

    Admin Login(Admin admin);



}
