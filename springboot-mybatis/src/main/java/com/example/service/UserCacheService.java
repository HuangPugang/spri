package com.example.service;

import com.example.domain.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by paul on 16/11/19.
 */
@Service
public class UserCacheService {

    @Cacheable(value = "usercache",keyGenerator = "wiselyKeyGenerator")
    public User findUser(Long id,String firstName,String lastName){
        System.out.println("无缓存的时候调用这里");
        return new User(Math.toIntExact(id),firstName,lastName,10);
    }
}
