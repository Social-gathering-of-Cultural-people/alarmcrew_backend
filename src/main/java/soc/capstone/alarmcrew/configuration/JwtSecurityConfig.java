//package soc.capstone.alarmcrew.configuration;
//
//
//import soc.capstone.alarmcrew.jwt.JwtFilter;
//import soc.capstone.alarmcrew.jwt.TokenProvider;
//import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
///**
// * <pre>
// * Class : JwtSecurityConfig
// * Comment:
// * History
// * ================================================================
// * DATE             AUTHOR           NOTE
// * ----------------------------------------------------------------
// * 2023-04-04         손준형           최초 생성
// * </pre>
// *
// * @author 손준형
// * @version 1(클래스 버전)
// * @see
// */
//public class JwtSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
//
//    private final TokenProvider tokenProvider;
//
//    public JwtSecurityConfig(TokenProvider tokenProvider) {
//        this.tokenProvider = tokenProvider;
//    }
//
//    @Override
//    public void configure(HttpSecurity httpSecurity){
//        JwtFilter customFilter = new JwtFilter(tokenProvider);
//        httpSecurity.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
//    }
//}
//
