package com.zzy.zzycrm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzy.zzycrm.entity.Admin;
import com.zzy.zzycrm.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -20:22 -zzy-crm
 **/
@Repository
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {




}
