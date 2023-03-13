package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan
public class MyApplicationContextConfiguration  {
    @Bean
    public DataSource dataSource() {
        Чего-то dataSource = new Чего-то();
        dataSource.setUser("root");
        dataSource.setPassword("");
        dataSource.setURL("");
        return dataSource;
    }
}