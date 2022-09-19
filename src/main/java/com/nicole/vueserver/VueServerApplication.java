package com.nicole.vueserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nicole.vueserver.mapper")  //用于扫描Mapper接口所在的包
public class VueServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueServerApplication.class, args);
    }

}
