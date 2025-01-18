package tech.coeus.selfstudyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SelfStudyAppApplication {
    ;

    public static void main(String[] args) {
        SpringApplication.run(SelfStudyAppApplication.class, args);
        Dev dev = new Dev();
        dev.build();
    }
}

