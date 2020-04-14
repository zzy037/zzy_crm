package com.zzy.zzycrm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -18:45 -zzy-crm
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("admin")
public class Admin extends BaseModel{
    @TableId(type = IdType.AUTO)
    private Integer admin_id;
    private String admin_name;
    private String password;
    private String phone;

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", admin_name='" + admin_name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", createTime='" + super.getCreateTime() + '\'' +
                ", updateTime='" + super.getUpdateTime() + '\'' +
                ", isDel='" + super.getIsDel() +
                '}';
    }
}
