package com.redweber.backendserverAMEM.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allow all paths
                .allowedOrigins("*") // Allow only the Vite frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS"); // Allow the necessary HTTP methods
    }
}


