package com.vikastadge.hibernate.dataload.service;

import com.vikastadge.hibernate.dataload.dao.PersonDAO;
import com.vikastadge.hibernate.dataload.dao.entity.PersonEntity;

public class PersonService {

    PersonDAO personDAO = new PersonDAO();

    public PersonEntity updatePersonEntity(int id){
        return personDAO.updatePersonEntity(id);
    }

    public void deletePersonEntity(int id){
        personDAO.deletePersonEntity(id);
    }

    public PersonEntity fetchDataWithGetMethod(int id){
        return personDAO.fetchDataWithGetMethod(id);
    }
}
