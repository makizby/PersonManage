package com.zby.service.impl;

import com.zby.dao.PersonDAO;
import com.zby.entity.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("PersonService")
public class PersonServiceImpl {
    @Resource
    private PersonDAO personDAO;

    public Person selectUser(int id){
        return this.personDAO.selectUser(id);
    }

}
