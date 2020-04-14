package com.zzy.zzycrm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.io.Serializable;

/**
 * @author 邹靓仔
 * @date 2020/3/6 -18:42 -zzy-crm
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseModel implements Serializable {

    private String createTime;
    private String updateTime;
    private Integer isDel;




}
