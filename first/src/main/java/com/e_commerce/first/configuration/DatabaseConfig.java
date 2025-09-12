package com.e_commerce.first.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/first_e_commerce")
                .username("ocepez")
                .password("DCMarvel+2001=love")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }
}