package com.vikastadge.hibernate.xml.service;

import com.vikastadge.hibernate.xml.dao.PersonDAO;
import com.vikastadge.hibernate.xml.dao.entity.PersonEntity;

public class PersonService {

    public void save(PersonEntity personEntity){
        System.out.println("In Service");
        PersonDAO personDAO = new PersonDAO();
        personDAO.save(personEntity);
    }
}
