package com.senlainc.configuration;

import com.senlainc.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.senlainc")
//@EnableTransactionManagement
public class MyConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/internal");
        dataSource.setUsername("postgres");
        dataSource.setPassword("0000");
        return dataSource;
    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean factory() {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource());
        factory.setPackagesToScan("com.senlainc");
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return factory;
    }

    @Bean
    public Actor actor() {
        return new Actor("");
    }

    @Bean
    public Comment comment() {
        return new Comment("");
    }

    @Bean
    public Film film() {
        return new Film("", 1);
    }

    @Bean
    public FilmCompany filmCompany() {
        return new FilmCompany("");
    }

    @Bean
    public Genre genre() {
        return new Genre("");
    }

    @Bean
    public Review reviews() {
        return new Review(1);
    }

    @Bean
    public User user() {
        return new User("", "");
    }

}
