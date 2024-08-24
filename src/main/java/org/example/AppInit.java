package org.example;


import org.example.aop.Transaction;
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

        Transaction transaction = (Transaction) ctx.getBean("transaction");
        transaction.startTrans();
        transaction.endTrans();

        ctx.registerShutdownHook();


    }
}