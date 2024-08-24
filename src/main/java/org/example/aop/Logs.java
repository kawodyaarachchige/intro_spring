package org.example.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logs {
    @After("execution(public void  startTrans())")
    public static void startTransLog(){
        System.out.println("start trans log");
    }
    @After("execution(public void  endTrans())")
    public static void endTransLog(){
        System.out.println("end trans log");
    }
}
