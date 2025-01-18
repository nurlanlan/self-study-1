package tech.coeus.selfstudyapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("laptop")
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Laptop chosen");
    }
}
