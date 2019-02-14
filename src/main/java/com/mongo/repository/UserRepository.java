package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by Zcl on 2019/2/1.
 */
@Repository
public interface UserRepository extends MongoRepository<User,Long>{
}
