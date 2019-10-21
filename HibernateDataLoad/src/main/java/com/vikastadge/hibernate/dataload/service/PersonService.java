package com.vikastadge.hibernate.dataload.service;

import com.vikastadge.hibernate.dataload.dao.PersonDAO;
import com.vikastadge.hibernate.dataload.dao.entity.PersonEntity;

public class PersonService {

    PersonDAO personDAO = new PersonDAO();

    public void save(PersonEntity personEntity){
        System.out.println("In Service");
        personDAO.save(personEntity);
    }

    public PersonEntity fetchDataWithLoadMethod(int id){
        return personDAO.fetchDataWithLoadMethod(id);
    }

    public PersonEntity fetchDataWithGetMethod(int id){
        return personDAO.fetchDataWithGetMethod(id);
    }

}
