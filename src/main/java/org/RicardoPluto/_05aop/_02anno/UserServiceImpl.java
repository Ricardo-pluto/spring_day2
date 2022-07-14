package org.RicardoPluto._05aop._02anno;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    public void add(User user) {
        System.out.println(user);
    }

    public void delete(Long id) {
        System.out.println("delete"+id+"success");
    }
}
