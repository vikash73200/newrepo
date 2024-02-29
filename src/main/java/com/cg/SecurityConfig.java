package com.cg;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
            .withUser("user") // Set username
            .password("{noop}password") // Set password (using {noop} for plain text, not recommended for production)
            .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/public/**").permitAll() // Allow access to /public/**
                .antMatchers("/home").authenticated() // Require authentication for /home
                .anyRequest().authenticated()
                .and()
            .formLogin() // Use default Spring Security login form
                .and()
            .logout()
                .permitAll()
                .and()
            .exceptionHandling().accessDeniedPage("/403"); // Customizing access denied page
    }
}
