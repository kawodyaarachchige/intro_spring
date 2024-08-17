package org.example;


import org.example.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        //application context
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        ctx.close();


    }
}