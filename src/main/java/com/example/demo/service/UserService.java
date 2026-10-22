package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    public final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }
    public User saveUser(User user){
        return this.userRepository.save(user);

    }
    public User getUser(Integer id){

        return this.userRepository.findById(id).get();
    }
    public List<User> getAllUsers(){
        return this.userRepository.findAll();

    }
    public void deleteUser(Integer id){
        this.userRepository.deleteById(id);
    }
    public User updateUser(Integer id, String email){
        User save = null;
        Optional<User> byId = this.userRepository.findById(id);
        if(!byId.isEmpty()){
            User user = byId.get();
            user.setEmail(email);
            save = this.userRepository.save(user);
        }
        return save;
    }
}

