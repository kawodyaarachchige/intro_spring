package org.example.beans;

import org.example.contracts.GoodGirl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Anoja implements GoodGirl {
    @Override
    public void love() {
        System.out.println("I love kusal putha");
    }
}
