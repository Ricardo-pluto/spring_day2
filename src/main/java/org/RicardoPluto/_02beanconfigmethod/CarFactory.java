package org.RicardoPluto._02beanconfigmethod;

public class CarFactory {
    //静态工厂，工厂中通过静态方法获取对象
    public static Car createCar(){
        return new Car();
    }
}
