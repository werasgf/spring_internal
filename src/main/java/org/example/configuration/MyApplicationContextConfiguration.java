package org.example.configuration;

import org.example.service.FilmService;
import org.example.service.FilmServiceImpl;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApplicationContextConfiguration {

    @Bean
    FilmService filmService() {
        return new FilmServiceImpl();
    }

    @Bean
    UserService userService() {
        return new UserServiceImpl();
    }
}
