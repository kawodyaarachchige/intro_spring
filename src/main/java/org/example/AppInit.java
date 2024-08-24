package org.example;


import org.example.config.Config;
import org.example.obj.MyObj;
import org.example.obj.OtherObj;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        //application context
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        //
       /* var otherObj = ctx.getBean(OtherObj.class);
        System.out.println(otherObj.getClass().getName());*/
        //
        /*var myObj = ctx.getBean(MyObj.class);
        System.out.println(myObj);*/
        //
       /* ConfigurableListableBeanFactory beanFactory = ctx.getBeanFactory();
        System.out.println("is bean singleton: " + beanFactory.isSingleton("myObj"));*/

        ctx.registerShutdownHook();


    }
}