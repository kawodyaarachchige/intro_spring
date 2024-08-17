package org.example.config;

import org.example.obj.MyObj;
import org.example.obj.OtherObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example") main package or base package
@ComponentScan(basePackageClasses = {MyObj.class})
public class Config {
    @Bean
    OtherObj otherObj() {
        return new OtherObj();
    }
}
