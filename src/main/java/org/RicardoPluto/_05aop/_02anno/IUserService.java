package org.RicardoPluto._05aop._02anno;

import org.springframework.stereotype.Component;


public interface IUserService {
    void add(User user);
    void delete(Long id);
}
