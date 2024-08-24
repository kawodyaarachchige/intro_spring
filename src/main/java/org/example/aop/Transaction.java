package org.example.aop;

import org.springframework.stereotype.Component;

@Component("transaction")
public class Transaction {
    public void startTrans(){
        System.out.println("start trans");
    }

    public  void endTrans(){
        System.out.println("end trans");
    }
}
