package com.zzy.zzycrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zzy.zzycrm.mapper") //扫描mapper接口，否则无法运行
@SpringBootApplication
public class ZzyCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZzyCrmApplication.class, args);
    }

}
