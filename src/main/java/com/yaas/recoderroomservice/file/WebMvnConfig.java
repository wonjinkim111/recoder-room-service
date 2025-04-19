package com.yaas.recoderroomservice.file;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvnConfig implements WebMvcConfigurer {
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(new String[] {"/**"}).addResourceLocations(new String[] { "/usr/recoder-img" });
    }
}
