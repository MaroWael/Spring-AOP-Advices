package com.learn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.learn", "com.learn.services", "com.learn.aspects"})
public class AppConfig {
}
