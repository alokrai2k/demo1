package com.crunchify.springboot;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Crunchify.com
 * 1st Spring Hello World Application in Intellij IDEA by Crunchify.com
 * Version: 1.0
 */

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        System.out.println("\n Hello. This is 1st Spring Hello World Application in Intellij IDEA by Crunchify.com");
    }
}