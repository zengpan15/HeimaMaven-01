package com.itheima.security_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration  //配置类
@EnableWebSecurity  //开启web安全控制
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)//开启方法注解的权限控制
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()  //开启http的安全控制
                //.antMatchers("/index.html").permitAll()
                .antMatchers("/login.html").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated() //
                .and()
                .formLogin() //设置登录页相关选项
                .loginPage("/login.html")
                .loginProcessingUrl("/login") //登录请求的url地址
                //.usernameParameter("username")
                //.passwordParameter("password")
                .successHandler(new MyAuthenticationSuccessHandler())//
                .failureHandler(new MyAuthenticationFailureHandler())//
                .and().csrf().disable()
                .sessionManagement()
                .maximumSessions(1)
                .expiredUrl("/login.html");
    }

    @Autowired
    private MyUserDetailsServiceImpl myUserDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                // .userDetailsService(new MyUserDetailsServiceImpl());  找个对象不能直接new！ 脱离了spring的管理！ @Autowire就会失效
                .userDetailsService(myUserDetailsService)
                .passwordEncoder(new BCryptPasswordEncoder());
        ;
    }
    @Bean
    public MyUserDetailsServiceImpl myUserDetailsService(){
        return new MyUserDetailsServiceImpl();
    }
    @Bean

    public static void main(String[] args) {
        String encode = new BCryptPasswordEncoder().encode("1234");
        System.out.println(encode);
    }

}
