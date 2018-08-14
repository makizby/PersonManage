package com.zby.controller;

import com.zby.entity.Person;
import com.zby.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
@RequestMapping
@ResponseBody
@Controller
public class PersonController {
    @Resource
    private PersonService personService;

    @GetMapping(value = "/persons/{id}")
    public String findPersonByCode(@PathVariable("id") int id ){
        return personService.selectUser(id).getUsername();
    }
}
