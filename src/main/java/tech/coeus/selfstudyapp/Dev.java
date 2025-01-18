package tech.coeus.selfstudyapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    @Autowired
    private Laptop laptop;

    public Dev(Laptop laptop){
        this.laptop = laptop;
    }


    public void build(){

        laptop.compile();

        System.out.println("Building Dev");
    }

}
