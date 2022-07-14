package org.RicardoPluto._04proxy._01staticproxy;

import org.junit.Test;

public class StaticProxyTest {
    @Test
    public void test(){
        //不加事务的调用
        IUserService realObject = new UserServiceImpl();
        IUserService proxyObject = new UserServiceImplProxy(realObject);
        proxyObject.add(new User(1L,"zs"));
    }
}
