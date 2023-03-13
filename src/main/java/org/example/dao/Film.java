package org.example.dao;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class Film {
    private DataSource dataSource;
    private Film(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
