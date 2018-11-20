package com.wen.word;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.wen.word.dao"})
public class WordApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordApplication.class, args);
    }
}
