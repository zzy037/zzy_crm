package com.zzy.zzycrm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzy.zzycrm.entity.Admin;
import com.zzy.zzycrm.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -19:07 -zzy-crm
 **/
@Repository

public interface AdminMapper extends BaseMapper<Admin> {

    Admin Login(Admin admin);

    int updateTime(Admin admin);


}
