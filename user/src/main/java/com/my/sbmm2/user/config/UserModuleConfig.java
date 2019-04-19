package com.my.sbmm2.user.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.my.sbmm2.user"})
@EnableJpaRepositories(basePackages = {"com.my.sbmm2.user"})
@EntityScan(basePackages = {"com.my.sbmm2.user"})
public class UserModuleConfig {


}
