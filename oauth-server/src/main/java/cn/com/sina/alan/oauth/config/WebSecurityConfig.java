package cn.com.sina.alan.oauth.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by on 2017.03.08.
 */
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    Logger log = LoggerFactory.getLogger(WebSecurityConfig.class);

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //        http.csrf().disable().exceptionHandling().authenticationEntryPoint(
        //                (request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED)).and()
        //                .authorizeRequests().antMatchers("/**").authenticated().and().httpBasic();
        super.configure(http);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("reader").password("reader").authorities("FOO_READ").and()
                .withUser("writer").password("writer").authorities("FOO_READ", "FOO_WRITE");

        //        auth.jdbcAuthentication();
    }
}
