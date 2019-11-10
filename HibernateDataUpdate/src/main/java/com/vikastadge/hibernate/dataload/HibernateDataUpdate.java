package com.vikastadge.hibernate.dataload;

import com.vikastadge.hibernate.dataload.dao.entity.PersonEntity;
import com.vikastadge.hibernate.dataload.service.PersonService;

public class HibernateDataUpdate {
    public static void main( String[] args ) {
        updatePersonEntity(7);
        fetchDataWithGetMethod(7);
        deletePersonEntity(7);
        fetchDataWithGetMethod(7);
    }

    private static void updatePersonEntity(int id){
        PersonService personService = new PersonService();
        personService.updatePersonEntity(id);
    }

    private static void deletePersonEntity(int id){
        PersonService personService = new PersonService();
        personService.deletePersonEntity(id);
    }

    private static void fetchDataWithGetMethod(int id){
        PersonService personService = new PersonService();
        PersonEntity personEntity = personService.fetchDataWithGetMethod(id);
        System.out.println("Person is "+personEntity);
    }
}
