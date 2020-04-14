package com.zzy.zzycrm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -18:58 -zzy-crm
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders extends BaseModel{

    private Integer ordersId;
    private String orderTime;
    private  String price;
    private  String customerName;
    private  String sex;
    private  String address;
    private  String telephone;

    @Override
    public String toString() {
        return "Orders{" +
                "orders_id=" + ordersId +
                ", order_time='" + orderTime + '\'' +
                ", price='" + price + '\'' +
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
