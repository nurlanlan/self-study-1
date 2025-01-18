package tech.coeus.selfstudyapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SelfStudyAppApplication {

    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(SelfStudyAppApplication.class, args);
        Dev dev = null;
        dev.build();
        
    }
}

