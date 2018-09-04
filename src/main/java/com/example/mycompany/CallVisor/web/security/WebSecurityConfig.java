package com.example.mycompany.CallVisor.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    public enum Role {
        ADMIN, USER;

        public static Role getRole(int accessId) {
            switch (accessId) {
                case 7:
                    return ADMIN;
                default:
                    return USER;
            }
        }
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .addFilterAfter(
                        new LoginSecurityFilter(), BasicAuthenticationFilter.class)
                .addFilterAfter(
                        new RoleSecurityFilter(), LoginSecurityFilter.class
                );
    }
}