package org.example.beans;

import org.example.contracts.GoodGirl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Ugly")
public class Sameera implements GoodGirl {
    @Override
    public void love() {
        System.out.println("I love kusal so much");

    }
}
