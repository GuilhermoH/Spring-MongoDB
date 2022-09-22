package com.herter.workshop.services;

import com.herter.workshop.domain.User;
import com.herter.workshop.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRespository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
