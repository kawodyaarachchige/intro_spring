package org.example.beans;

import org.example.contracts.GoodGirl;
import org.example.customAnnotation.Beauty;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Ugly")
@Beauty
public class Kitty implements GoodGirl {
    @Override
    public void love() {
        System.out.println("I love kusal lets go to eat ice cream with me");
    }
}
