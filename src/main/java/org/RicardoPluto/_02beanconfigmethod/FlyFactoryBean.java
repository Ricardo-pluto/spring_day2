package org.RicardoPluto._02beanconfigmethod;

import org.springframework.beans.factory.FactoryBean;

public class FlyFactoryBean implements FactoryBean<Fly> {

    public Fly getObject() throws Exception {
        return new Fly();
    }

    public Class<?> getObjectType() {
        return Fly.class;
    }
}
