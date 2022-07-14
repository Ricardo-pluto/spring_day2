package org.RicardoPluto._04proxy._01staticproxy;

public class UserServiceImpl implements IUserService{

    public void add(User user) {
        /*TxManager txManager = new TxManager();
        try {
            txManager.begin();
            System.out.println(user);
            txManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            txManager.rollBack();
        }finally {
            txManager.close();
        }*/
        System.out.println(user);
    }
}
