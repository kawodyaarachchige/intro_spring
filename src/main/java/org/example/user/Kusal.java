package org.example.user;

import jakarta.annotation.PostConstruct;
import org.example.contracts.GoodGirl;
import org.example.customAnnotation.Beauty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Kusal {

    private  GoodGirl goodGirl;


   /* public Kusal(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;

    }*/

    @Autowired
    @Qualifier("Ugly")
    @Beauty
    public void setGoodGirl  (GoodGirl goodGirl) {
        this.goodGirl = goodGirl;

    }
    @PostConstruct
    public void init(){
         goodGirl.love();
    }
}
