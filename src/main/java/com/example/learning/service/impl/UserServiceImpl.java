package com.example.learning.service.impl;

import com.example.learning.model.User;
import com.example.learning.repository.UserRepository;
import com.example.learning.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User getUserById(Long id) {
        User foundedUser = userRepository.findById(id).get();
        return foundedUser;
    }
}
