package com.example.learning.service;

import com.example.learning.model.User;

public interface UserService {

    User saveUser(User user);

    User getUserById(Long id);
}
