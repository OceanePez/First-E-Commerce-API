package com.e_commerce.first.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {

            private static final long serialVersionUID = 1L;
            private static final String GET = "GET";
            private static final String POST = "POST";
            private static final String PUT = "PUT";
            private static final String DELETE = "DELETE";
            /**
             * @param registry
             */
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods();
                WebMvcConfigurer.super.addCorsMappings(registry);
            }
        };
    }
}
