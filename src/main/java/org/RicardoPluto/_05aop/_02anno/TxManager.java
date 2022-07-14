package org.RicardoPluto._05aop._02anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 事务管理器
 */
@Component
@Aspect     //定义切面
public class TxManager {
    @Pointcut("execution(* org.RicardoPluto._05aop._02anno.I*Service.*(..))\"")
    public void pointCut(){

    }
    public void begin() {
        System.out.println("开启事务....");
    }

    /*JoinPoint:切点*/
    public void commit(JoinPoint joinPoint, Object ret) {
        System.out.println("提交事务....");
    }

    public void rollback(JoinPoint joinPoint, Throwable e) {
        System.out.println("回滚事务....");
    }

    public void close() {
        System.out.println("关闭事务....");
    }
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint){
        //System.out.println(joinPoint.getTarget());
        //调用的类
        //System.out.println(Arrays.asList(joinPoint.getArgs()));
        //参递的参数
        //System.out.println(joinPoint.getSignature());
        //方法签名
        Object object = null;
        try {
            begin();
            object = joinPoint.proceed();
            //执行相应的代码
            commit(joinPoint,object);
        } catch (Throwable e) {
            rollback(joinPoint,e);
        }finally{
            close();
        }
        return object;
    }
}
