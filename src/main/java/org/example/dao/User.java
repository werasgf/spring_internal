package org.example.dao;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class User {
    private DataSource dataSource;

    private User(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
