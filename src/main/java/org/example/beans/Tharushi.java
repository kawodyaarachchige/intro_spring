package org.example.beans;

import org.example.contracts.GoodGirl;
import org.springframework.stereotype.Component;

@Component
public class Tharushi implements GoodGirl {
    @Override
    public void love() {
        System.out.println("I love kusal");
    }
}
