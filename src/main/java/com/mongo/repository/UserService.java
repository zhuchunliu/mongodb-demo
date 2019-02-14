package com.mongo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Zcl on 2019/2/1.
 */
@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public User findOne(Long id){

        return userRepository.findOne(id);
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public List<User> queryAll(){
        return userRepository.findAll();
    }
}
