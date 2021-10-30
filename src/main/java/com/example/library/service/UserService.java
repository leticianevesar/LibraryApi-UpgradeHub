package com.example.library.service;

import com.example.library.repository.UserRepository;
import com.example.library.model.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class UserService  {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {

        return userRepository.findAll();
    }

    public void deleteById(Long aLong) {

        userRepository.deleteById(aLong);
    }

    public <S extends User> S save(S newUser) {

        return userRepository.save(newUser);
    }

    public Optional<User> findById(Long id) {

        return userRepository.findById(id);
    }

}