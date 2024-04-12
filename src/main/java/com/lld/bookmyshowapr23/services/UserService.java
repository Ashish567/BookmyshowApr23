package com.lld.bookmyshowapr23.services;

import com.lld.bookmyshowapr23.models.User;
import com.lld.bookmyshowapr23.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(
            String email,
            String password
    ){
        // 1. check if user already exist
        Optional<User> userOptional = userRepository.findByEmail(email);
        if(userOptional.isPresent()){
            throw new RuntimeException("User already exists");
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setBookings(new ArrayList<>());
        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
