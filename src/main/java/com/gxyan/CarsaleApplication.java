package com.gxyan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liyu
 * @date 2024/12/20
 */
@SpringBootApplication
@MapperScan("com.gxyan.dao")
public class CarsaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsaleApplication.class, args);
    }
}
