package tech.coeus.selfstudyapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    private Computer desktop;



    public void build(){

        desktop.compile();

        System.out.println("Building Dev");
    }

}
