package com.example.spring_boot_api_jwt_ad.service;

import com.example.spring_boot_api_jwt_ad.authen.UserPrincipal;
import com.example.spring_boot_api_jwt_ad.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
    public List<User> findAllUsers() ;
}
