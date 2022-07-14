package org.RicardoPluto._02beanconfigmethod;

import org.RicardoPluto.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BeanConfigMethodOfStaticFactoryTest extends BaseTest {
    @Autowired
    private Car car;
    @Test
    public void test() throws Exception{
        car.run();
    }
    @Autowired
    private Bus bus;
    @Test
    public void testBus() throws Exception{
        bus.run();
        fly.hit();
    }
    @Autowired
    private Fly fly;

}
