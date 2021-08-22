package com.test.dev.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.test.dev.dao")
public class DatabaseConfiguration {
}
