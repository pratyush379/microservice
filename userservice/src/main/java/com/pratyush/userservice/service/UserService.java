package com.pratyush.userservice.service;

import java.util.List;

import com.pratyush.userservice.entity.User;

public interface UserService {
 public User getUser(Long id);
 public List<User> getAllUser();
}
