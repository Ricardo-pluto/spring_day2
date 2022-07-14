package org.RicardoPluto._01beanconfidetail;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class ScopeBean {
    public void hello(){
        System.out.println("hello scope");
    }
}
