package com.demospring.bankapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  // Tells Spring Boot this is a configuration class
public class WebConfig implements WebMvcConfigurer {
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Applies CORS to all API endpoints
                .allowedOrigins("http://localhost:3000")  // Allows requests from React frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Permits these HTTP methods
                .allowCredentials(true);  // Allows authentication and cookies
    }
}
