package org.example.obj;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/*@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)*/
public class MyObj {
    public MyObj() {
        System.out.println("Hello from MyObj");
    }
}
