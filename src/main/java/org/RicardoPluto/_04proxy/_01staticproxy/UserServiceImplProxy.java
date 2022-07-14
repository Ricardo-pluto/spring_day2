package org.RicardoPluto._04proxy._01staticproxy;

public class UserServiceImplProxy implements IUserService{

    private IUserService realObject;
    public UserServiceImplProxy(IUserService realObj){
        this.realObject = realObj;
    }
    public void add(User user) {
        TxManager txManager = new TxManager();
        try {
            txManager.begin();
            realObject.add(user);
            txManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            txManager.rollBack();
        }finally {
            txManager.close();
        }
    }
}
