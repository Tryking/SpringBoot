package com.tryking.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * @author tryking
 */
@SpringBootApplication
public class ConfigurationApplication {
    private final ConfigProperties configProperties;

    @Autowired
    public ConfigurationApplication(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationApplication.class, args);
    }


    @Component
    class StartupRunner implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            System.out.println("Application running");
            System.out.println(configProperties.toString());
        }
    }
}


