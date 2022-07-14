package org.RicardoPluto._01beanconfidetail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.applet.AppletContext;

/**
 * bean作用域，也就是这个Bean的作用范围，可以通过scope属性配置
 * =============以下常用，特别是单例============================
 * 1.singleton单例：在spring ioc 容器中仅存在一个，没有配置，默认单例
 * 2.prototype多例：每次获取都会创建一个Bean
 * =========以下用的少===============
 * 3.request请求：每次请求都会是新的bean
 * 4.session会话：每个会话都会产生新的bean
 * 5.globalSession 全局会话 没用
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BeanScopeTest {
    @Autowired
    private ApplicationContext context;
    @Test
    public void singletonTest() throws Exception{
        //不能直接注入ScopeBean,因为期望多次获取的Bean都是同一个bean，才能满足单例
        ScopeBean scopeBean01 = context.getBean(ScopeBean.class);
        System.out.println(scopeBean01);
        ScopeBean scopeBean02 = context.getBean(ScopeBean.class);
        System.out.println(scopeBean02);
        ScopeBean scopeBean03 = context.getBean(ScopeBean.class);
        System.out.println(scopeBean03);
        if(scopeBean01==scopeBean02&& scopeBean02==scopeBean03){
            System.out.println("三次获取为同一个bean，说明就是单例");
        }
    }
}
