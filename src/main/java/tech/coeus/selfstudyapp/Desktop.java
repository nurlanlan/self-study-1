package tech.coeus.selfstudyapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("desktop")
public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.println("Desktop Chosen");
    }
}
