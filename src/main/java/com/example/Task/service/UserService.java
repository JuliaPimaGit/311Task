package com.example.Task.service;

import com.example.Task.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add (User user);
    void delete (Long id);
    User getUserById(Long id);
}
