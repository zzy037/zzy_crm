package com.zzy.zzycrm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2  //开启swagger
public class SwaggerConfig {

    /**
     *  配置Swagger信息
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zzy.zzycrm.controller"))   //扫描控制器的包 http://localhost:8080/swagger-ui.html
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("springboot项目API文档")
                        .description("演示SpringBoot整合Swagger...")
                        .version("2.2.3")
                        .contact(new Contact("靓仔","https://my.oschina.net/drathin","lufei@163.com"))
                        .license("The Apache License")
                        .licenseUrl("https://my.oschina.net/drathin")
                        .build());
    }

}
