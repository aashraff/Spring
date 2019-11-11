package com.rides.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
/**
 *  This can be enabled when testing the H2 in memory db locally for development
 *  This can be externalised to dev property files
 */
public class DevelopmentOnlySecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests().antMatchers("/h2/**").permitAll();

        // This should not be diabled on production
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
    }

}
