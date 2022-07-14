package org.RicardoPluto._05AOP;

import org.RicardoPluto.BaseTest;
import org.RicardoPluto._05aop._02anno.IUserService;
import org.RicardoPluto._05aop._02anno.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AopAnnoTest extends BaseTest {
    @Autowired
    private IUserService userService;

    @Test
    public void test() throws Exception{
        userService.add(new User(1L,"zs"));
        userService.delete(2l);
    }
}
