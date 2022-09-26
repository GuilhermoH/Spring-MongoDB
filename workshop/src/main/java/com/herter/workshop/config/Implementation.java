package com.herter.workshop.config;

import com.herter.workshop.domain.Post;
import com.herter.workshop.domain.User;
import com.herter.workshop.dto.AuthorDTO;
import com.herter.workshop.repository.PostRepository;
import com.herter.workshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Implementation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;
    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        User guilhermo = new User("123", "Guilhermo", "guilhermoh@gmail.com");
        User matheus = new User("456", "Matheus", "guilhermoh@gmail.com");

        userRepository.save(guilhermo);
        userRepository.save(matheus);


        Post post1 = new Post(null, new AuthorDTO(guilhermo),sdf.parse("21/03/2022"),"Partiu Viagem","Viva Rio!");
        Post post2 = new Post(null, new AuthorDTO(guilhermo),sdf.parse("12/01/2022"),"Ferias","La rocas!");

        guilhermo.getPost().addAll(Arrays.asList(post1,post1));

        postRepository.save(post1);
        postRepository.save(post2);

        userRepository.save(guilhermo);
        userRepository.save(matheus);
    }
}
