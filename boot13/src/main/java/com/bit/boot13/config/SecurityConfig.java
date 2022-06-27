package com.bit.boot13.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailService userDetailService;
	
//	@Autowired
//	DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/", "/login", "/logout").permitAll();
//		http.authorizeHttpRequests().antMatchers("/hello").authenticated();
//		http.authorizeHttpRequests().antMatchers("/api/emp/**").authenticated();
		http.authorizeHttpRequests().anyRequest().authenticated();
//		http.authorizeHttpRequests().anyRequest().hasAnyRole("ADMIN", "USER");
		http.formLogin().loginPage("/login");
		http.userDetailsService(userDetailService);
	}
	
//	@Override
//	public void configure(AuthenticationManagerBuilder builder) throws Exception {
//		builder.jdbcAuthentication().dataSource(dataSource).withUser("user01")
//			.password(getPasswordEncoder().encode("1234")).roles("USER");
//	}
	
	@Bean
	BCryptPasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//			.jdbcAuthentication()
//			.dataSource(dataSource)
//			.usersByUsernameQuery("select username, password, enabled from users where username=?")
//			.authoritiesByUsernameQuery("select username, authority from authorities where username=?");
//	}

}
