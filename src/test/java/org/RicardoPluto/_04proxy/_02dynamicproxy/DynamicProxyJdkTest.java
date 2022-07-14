package org.RicardoPluto._04proxy._02dynamicproxy;

import org.RicardoPluto._04proxy._01staticproxy.UserServiceImplProxy;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyJdkTest {
    @Test
    public void test(){
        final IUserService realObj = new UserServiceImpl();
        final TxManager txManager = new TxManager();

        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = realObj.getClass().getInterfaces();
        IUserService proxyObject = (IUserService) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //相当于调用了真实对象的方法
                Object result = null;
                try {
                    txManager.begin();
                   result = method.invoke(realObj, args);
                    txManager.commit();
                }catch (Exception e){
                    e.printStackTrace();
                    txManager.rollBack();
                }finally {
                    txManager.close();
                }

                return result;
            }
        });

        proxyObject.add(new User(1L,"zs"));
    }
}
