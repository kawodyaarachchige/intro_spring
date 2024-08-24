package org.example.user;

import jakarta.annotation.PostConstruct;
import org.example.contracts.GoodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kusal {
    //dependency injection - setter  Injection

    private  GoodGirl goodGirl;
   /* @Autowired
    public Kusal(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;

    }*/

    @Autowired
    public void setGoodGirl(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }

     //post construct used for initialization
     @PostConstruct
     public void init(){
         goodGirl.love();
         System.out.println(goodGirl);
     }
}
