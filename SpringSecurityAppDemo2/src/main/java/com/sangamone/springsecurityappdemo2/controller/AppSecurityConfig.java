package com.sangamone.springsecurityappdemo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
			// TODO Auto-generated method stub
		
		List<UserDetails> users=new ArrayList<>();
		//List<UserDetails> users1=new ArrayList<>();

		users.add(User.withDefaultPasswordEncoder().username("asha").password("1234").roles("USER").build());
		users.add(User.withDefaultPasswordEncoder().username("lalu").password("12345").roles("ADMIN").build());
		return new InMemoryUserDetailsManager(users);
	}

	
}
