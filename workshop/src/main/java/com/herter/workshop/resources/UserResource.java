package com.herter.workshop.resources;

import com.herter.workshop.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/users" )
public class UserResource {

    @RequestMapping(method = GET)
    public ResponseEntity <List<User> >findAll(){
    User guilhermo = new User("1","guilhermo","guilhermoh@gmail.com");
    User marcella = new User("2","marcella","marcella@gmail.com");
    List<User> list = new ArrayList<>();
    list.add(guilhermo);
    list.add(marcella);
    return ResponseEntity.ok().body(list);

    }
}
