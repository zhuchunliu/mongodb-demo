package com.mongo.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Zcl on 2019/2/1.
 */
@SpringBootApplication
@ComponentScan("com.mongo")
@EnableMongoRepositories(basePackages = "com.mongo.repository")
public class MongoStart {
    public static void main(String[] args) {
        SpringApplication.run(MongoStart.class);
    }
}
