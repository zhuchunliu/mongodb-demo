package com.mongo.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by Zcl on 2019/2/1.
 */
@Data
@AllArgsConstructor
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private int age;
}
