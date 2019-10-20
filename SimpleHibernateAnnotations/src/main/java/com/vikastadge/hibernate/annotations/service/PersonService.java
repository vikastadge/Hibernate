package com.vikastadge.hibernate.annotations.service;

import com.vikastadge.hibernate.annotations.dao.PersonDAO;
import com.vikastadge.hibernate.annotations.dao.entity.PersonEntity;

public class PersonService {

    public void save(PersonEntity personEntity){
        System.out.println("In Service");
        PersonDAO personDAO = new PersonDAO();
        personDAO.save(personEntity);
    }
}
