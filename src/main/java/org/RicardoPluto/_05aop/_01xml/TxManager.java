package org.RicardoPluto._05aop._01xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

/**
 * 事务管理器
 */
public class TxManager {
    public void begin(){
        System.out.println("begin");
    }
    //JoinPoint 切点
    public void commit(JoinPoint joinpoint, Object ret){
        System.out.println("commit");
    }
    public void rollBack(JoinPoint joinpoint,Throwable e){
        System.out.println("rollBack");
    }
    public void close(){
        System.out.println("close");
    }
    public Object around(ProceedingJoinPoint joinPoint){
        //调用的类
        //System.out.println(joinPoint.getTarget());
        //传递的参数
        //System.out.println(Arrays.asList(joinPoint.getArgs()));
        //方法签名
        //System.out.println(joinPoint.getSignature());
        Object object = null;
        try {
            begin();
            object = joinPoint.proceed();
            commit(joinPoint, object);
        }catch (Throwable e) {
            rollBack(joinPoint, e);
        }finally {
            close();
        }
        return object;
    }
}
