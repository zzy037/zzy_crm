package com.zzy.zzycrm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzy.zzycrm.entity.Admin;
import com.zzy.zzycrm.entity.Orders;
import com.zzy.zzycrm.mapper.AdminMapper;
import com.zzy.zzycrm.mapper.OrdersMapper;
import com.zzy.zzycrm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -19:32 -zzy-crm
 **/
@Service
@Transactional
 class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 修改登录时间
     * @param admin
     * @return
     */
    @Override
    public Admin Login(Admin admin) {
        Admin ad = adminMapper.Login(admin);
        if (ad!=null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            ad.setUpdateTime(sdf.format(new Date()));
            adminMapper.updateTime(ad);
            return ad;
        }else {
            return null;
        }
    }
}
