package com.mccoy.smalltalk.service;

import com.mccoy.smalltalk.model.User;
import com.mccoy.smalltalk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    @Autowired
    UserRepository userRepo;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(user -> {
            users.add(user);
        });
        return users;
    }

    public User create(User user) {
        return userRepo.save(user);
    }

}
