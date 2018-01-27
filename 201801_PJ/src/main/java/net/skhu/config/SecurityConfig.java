package net.skhu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import net.skhu.service.MyAuthenticationProvider;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    @Autowired MyAuthenticationProvider myAuthenticationProvider;

    @Override
    public void configure(WebSecurity web) throws Exception
    {
        web.ignoring().antMatchers("/res/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.authorizeRequests()
            .antMatchers("/admin/**").access("ROLE_ADMIN")		//관리자만 접근가능한 URL 형태
            .antMatchers("/memb/**").authenticated()  	//회원만 접근가능한 URL 형태
            .antMatchers("/guest/**").permitAll()				//permitAll():  아무나 접근가능함
            .antMatchers("/").permitAll()
            .antMatchers("/**").authenticated();				//로그인된 사용자만 접근 가능한 url 형태


        http.csrf().disable();

        http.formLogin()
            .loginPage("/guest/index")							//처음 index 페이지를 여기 url 로 바꾸네
            .loginProcessingUrl("/guest/login_processing")
            .failureUrl("/guest/login?error")
            .defaultSuccessUrl("/memb/index", true)
            .usernameParameter("loginId")
            .passwordParameter("passwd");

        http.logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/memb/logout_processing"))
            .logoutSuccessUrl("/guest/index")
            .invalidateHttpSession(true);

        http.authenticationProvider(myAuthenticationProvider);
    }
}