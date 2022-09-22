package com.herter.workshop.config;

import com.herter.workshop.domain.User;
import com.herter.workshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Implementation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        User firstUser =  new User("123","Guilhermo","guilhermoh@gmail.com") ;
        User secondUser =  new User("456","Matheus","guilhermoh@gmail.com") ;
        userRepository.save(firstUser);
        userRepository.save(secondUser);
    }
}
