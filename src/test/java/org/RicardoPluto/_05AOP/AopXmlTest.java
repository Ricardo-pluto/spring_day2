package org.RicardoPluto._05AOP;

import org.RicardoPluto.BaseTest;
import org.RicardoPluto._05aop._01xml.IUserService;
import org.RicardoPluto._05aop._01xml.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:applicationContext_04-aop-xml.xml")
public class AopXmlTest extends BaseTest {
    @Autowired
    private IUserService userService;

    @Test
    public void test() throws Exception{
        userService.add(new User(1L,"zs"));
    }
}
