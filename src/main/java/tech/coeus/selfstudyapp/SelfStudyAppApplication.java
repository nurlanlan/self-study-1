package tech.coeus.selfstudyapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SelfStudyAppApplication {

    @Autowired
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SelfStudyAppApplication.class, args);
        Dev dev = context.getBean(Dev.class);
        dev.build();
        
    }
}

