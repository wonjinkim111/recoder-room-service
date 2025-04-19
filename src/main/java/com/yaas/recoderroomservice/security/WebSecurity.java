package com.yaas.recoderroomservice.security;

import com.yaas.recoderroomservice.service.IRoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
@EnableWebSecurity
@CrossOrigin
public class WebSecurity extends WebSecurityConfigurerAdapter {
    private Environment env;

    private IRoomsService roomService;

    @Autowired
    public WebSecurity(Environment env, IRoomsService roomService) {
        this.env = env;
        this.roomService = roomService;
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        ((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)http.authorizeRequests().antMatchers(new String[] { "/**" })).permitAll();
        http.headers().frameOptions().disable();
    }
}
