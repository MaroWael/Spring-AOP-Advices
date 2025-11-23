package com.learn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.learn", "com.learn.aspects", "com.learn.services"})
@EnableAspectJAutoProxy
public class AppConfig {
}
