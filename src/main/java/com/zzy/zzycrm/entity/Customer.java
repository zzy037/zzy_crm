package com.zzy.zzycrm.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -18:48 -zzy-crm
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("customer")
public class Customer extends BaseModel{

    @TableId(type = IdType.AUTO)
    private Integer customerId;
    private String customerName;
    private String sex;
    private String address;
    private String telephone;

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customerId +
                ", customer_name='" + customerName + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", createTime='" + super.getCreateTime() + '\'' +
                ", updateTime='" + super.getUpdateTime() + '\'' +
                ", isDel='" + super.getIsDel() +
                '}';
    }
}
