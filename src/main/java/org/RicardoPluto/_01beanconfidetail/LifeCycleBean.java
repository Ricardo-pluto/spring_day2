package org.RicardoPluto._01beanconfidetail;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@PostConstruct 创建之后，初始化
//@PreDestroy 销毁前，销毁
//@Scope("prototype")
public class LifeCycleBean {
    public LifeCycleBean(){
        System.out.println("LifeCycleBean created");
    }
    public void hello(){
        System.out.println("hello life");
    }
    //@PostConstruct
    public void init(){
        System.out.println("LifeCycle init!");
    }
    //@PreDestroy
    public void destroy(){
        System.out.println("LifeCycle destroy!");
    }
}
