package org.example.user;

import jakarta.annotation.PostConstruct;
import org.example.contracts.GoodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kusal {

    private  final GoodGirl goodGirl;

    @Autowired
    public Kusal(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;

    }
    @PostConstruct
    public void init(){
         goodGirl.love();
    }
}
