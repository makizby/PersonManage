package com.zby.dao;

import com.zby.entity.Person;
import org.springframework.stereotype.Component;

@Component
public interface PersonDAO {
    public Person selectUser(int id);
}
