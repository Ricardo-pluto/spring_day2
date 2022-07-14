package org.RicardoPluto._01beanconfidetail;

import org.RicardoPluto.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 单例：
 * 创建：容器创建完成后使用前就完成创建
 * 初始化：bean创建完成使用之前完成初始化
 * 使用： 多次使用是同一个bean
 * 销毁：容器销毁销毁使用，要销毁掉所有的单例，所有的bean销毁方法都会被调用一次
 *
 * 多例：
 * 创建：每次使用之前创建
 * 初始化：创建完成立即初始化
 * 调用：每次创建一个Bean并且初始化，后调用
 * 销毁：没有销毁，在spring角度，创建完，初始化，交付使用，以后与spring无关
 */
public class LifeCycleTest extends BaseTest {
    @Autowired
    private LifeCycleBean lifeCycleBean;
    @Test
    public void lifeCycleTest() throws Exception{
        lifeCycleBean.hello();
    }
}
