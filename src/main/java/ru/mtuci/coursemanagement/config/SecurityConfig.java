package ru.mtuci.coursemanagement.config;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        http.csrf(csrf -> {})
         .headers(headers -> headers
            .contentSecurityPolicy(csp -> csp
                    .policyDirectives("default-src 'self'")
            )
                 .frameOptions(frame -> frame.deny())
    );
        return http.build();
    }
}



