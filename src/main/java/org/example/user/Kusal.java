package org.example.user;

import jakarta.annotation.PostConstruct;
import org.example.contracts.GoodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kusal {
    //dependency injection
    @Autowired
     GoodGirl goodGirl;

     public Kusal(){

     }
     //post construct used for initialization
     @PostConstruct
     public void init(){
         goodGirl.love();
         System.out.println(goodGirl);
     }
}
