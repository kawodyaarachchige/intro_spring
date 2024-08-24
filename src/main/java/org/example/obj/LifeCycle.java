package org.example.obj;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import static org.springframework.aop.interceptor.ExposeBeanNameAdvisors.getBeanName;


public class LifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is : " +name);

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory is : " +beanFactory);


    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is initialized");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context is : " +applicationContext);

    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is destroyed");

    }
    //custom destroy annotation
    @PreDestroy
    public void getLost(){
        System.out.println("Bean is pre destroyed");
    }


}
