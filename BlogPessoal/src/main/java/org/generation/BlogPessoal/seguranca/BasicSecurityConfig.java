package org.generation.BlogPessoal.seguranca;

import org.springframework.beans.factory.annotation.Autowired;

@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired 
	private UserDetailsService userDetailsService;
	
	@Override 
	protected void configure(authenticationManagerBuilder auth) {
		auth.userDetailsService()
	}
}

