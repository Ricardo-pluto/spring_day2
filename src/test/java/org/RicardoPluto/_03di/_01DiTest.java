package org.RicardoPluto._03di;

import org.RicardoPluto.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
public class _01DiTest extends BaseTest {
    @Autowired
    private MyBean myBean;
    @Test
    public void test() throws Exception{
        System.out.println(myBean);
    }
}
