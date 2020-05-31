/*
 * package com.test.springboot.security;
 * 
 * import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * 
 * public class SecurityConfig {
 * 
 * // Authentication : User --> Roles protected void
 * configure(AuthenticationManagerBuilder auth) throws Exception {
 * auth.inMemoryAuthentication().passwordEncoder(org.springframework.security.
 * crypto.password.NoOpPasswordEncoder.getInstance()).withUser("user1").password
 * ("secret1") .roles("USER").and().withUser("admin1").password("secret1")
 * .roles("USER", "ADMIN"); }
 * 
 * // Authorization : Role -> Access protected void configure(HttpSecurity http)
 * throws Exception {
 * http.httpBasic().and().authorizeRequests().antMatchers("/students/**")
 * .hasRole("USER").antMatchers("/users/**").hasRole("USER")
 * .antMatchers("/**").hasRole("ADMIN").and().csrf().disable()
 * .headers().frameOptions().disable(); }
 * 
 * }
 */