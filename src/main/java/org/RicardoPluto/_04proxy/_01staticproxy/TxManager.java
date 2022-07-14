package org.RicardoPluto._04proxy._01staticproxy;

/**
 * 事务管理器
 */
public class TxManager {
    public void begin(){
        System.out.println("begin...");
    }
    public void commit(){
        System.out.println("commit...");
    }
    public void rollBack(){
        System.out.println("rollBack...");
    }
    public void close(){
        System.out.println("close...");
    }
}
