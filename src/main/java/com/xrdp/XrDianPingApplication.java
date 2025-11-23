package com.xrdp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xrdp.mapper")
@SpringBootApplication
public class XrDianPingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XrDianPingApplication.class, args);
    }

}
