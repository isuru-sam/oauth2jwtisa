package com.adamzareba.spring.security.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
/**
 * https://adamzareba.github.io/Secure-Spring-REST-With-Spring-Security-and-OAuth2/
 * https://github.com/spring-projects/spring-security-oauth/blob/master/spring-security-oauth2/src/test/resources/schema.sql
 * @author isuru
 *
 */
@SpringBootApplication(exclude = JmxAutoConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
