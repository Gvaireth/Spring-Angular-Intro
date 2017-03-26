package org.gvaireth.springangularintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// http.authorizeRequests().anyRequest().permitAll();

		http.authorizeRequests().antMatchers("/start").permitAll();
		http.authorizeRequests().antMatchers("/admin").authenticated();// hasRole("ADMIN");
		http.httpBasic();

		// admin:admin1@localhost:8080/SpringAngularIntro/admin
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("admin1").roles("ADMIN");
	}
}
