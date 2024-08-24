package org.example.config;


import org.example.aop.Logs;
import org.example.aop.Transaction;
import org.example.obj.MyObj;
import org.example.obj.OtherObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackageClasses = {Logs.class, Transaction.class})
public class Config {
   /* @Bean
    OtherObj otherObj() {
        return new OtherObj();
    }*/
}
