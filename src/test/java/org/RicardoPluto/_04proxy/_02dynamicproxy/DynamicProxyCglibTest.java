package org.RicardoPluto._04proxy._02dynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyCglibTest {
    @Test
    public void test(){
        final IUserService realObject = new UserServiceImpl();   //真实对象
        final TxManager txManager = new TxManager();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(realObject.getClass());  //把真实类作为代理类的父类，代理类就是子类，子类可以通过super调用父类的方法
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object result;
                try{
                    txManager.begin();
                    result =  method.invoke(realObject, objects);
                    txManager.commit();
                }catch (Exception e){
                    e.printStackTrace();
                    txManager.rollBack();
                }finally {
                    txManager.close();
                }
                return null;
            }
        });
        IUserService proxyObject = (IUserService) enhancer.create();
        proxyObject.add(new User(1L,"zs"));
    }
}
/*
class CglibProxy implements MethodInterceptor{

    private Object realObj;
    private TxManager txManager;
    public CglibProxy(Object realObj,TxManager txManager){
        this.realObj = realObj;
        this.txManager = txManager;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result;
        try{
            txManager.begin();
            result =  method.invoke(realObj, objects);
            txManager.commit();
        }catch (Exception e){
            e.printStackTrace();
            txManager.rollBack();
        }finally {
            txManager.close();
        }
        return null;
    }
}*/
