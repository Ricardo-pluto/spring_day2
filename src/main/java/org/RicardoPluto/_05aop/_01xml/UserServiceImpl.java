package org.RicardoPluto._05aop._01xml;

public class UserServiceImpl implements IUserService {

    public void add(User user) {
        System.out.println(user+"haha");
    }

    public void delete(Long id) {
        System.out.println("delete"+id+"success");
    }
}
