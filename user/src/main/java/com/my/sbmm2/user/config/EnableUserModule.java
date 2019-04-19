package com.my.sbmm2.user.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(value = {UserModuleConfig.class})
public @interface EnableUserModule {
}
