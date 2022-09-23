package com.herter.workshop.services;

import com.herter.workshop.domain.User;
import com.herter.workshop.dto.UserDTO;
import com.herter.workshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        return this.repo.findById(id).orElse(null);
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public User fromDto(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
