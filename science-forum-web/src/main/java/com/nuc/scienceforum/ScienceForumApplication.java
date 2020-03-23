package com.nuc.scienceforum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nuc.scienceforum.dal.dao")
public class ScienceForumApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScienceForumApplication.class, args);
    }

}
