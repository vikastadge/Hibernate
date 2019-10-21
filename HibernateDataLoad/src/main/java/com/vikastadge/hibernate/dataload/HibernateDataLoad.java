package com.vikastadge.hibernate.dataload;

import com.vikastadge.hibernate.dataload.dao.entity.PersonEntity;
import com.vikastadge.hibernate.dataload.service.PersonService;

/**
 * Hello world!
 *
 */
public class HibernateDataLoad {
    public static void main( String[] args ) {
        fetchDataWithLoadMethod(1);
        fetchDataWithGetMethod(4);
        differenceBetweenLoadAndGetMethod(6);
    }

    private static void fetchDataWithLoadMethod(int id){
        PersonService personService = new PersonService();
        PersonEntity personEntity = personService.fetchDataWithLoadMethod(id);
        System.out.println("Person is "+personEntity);
    }

    private static void fetchDataWithGetMethod(int id){
        PersonService personService = new PersonService();
        PersonEntity personEntity = personService.fetchDataWithGetMethod(id);
        System.out.println("Person is "+personEntity);
    }

    private static void differenceBetweenLoadAndGetMethod(int id){
        PersonService personService = new PersonService();

        PersonEntity personEntity = personService.fetchDataWithGetMethod(id);
        System.out.println("Fetch person with get method :"+personEntity);

        personEntity = personService.fetchDataWithLoadMethod(id);
        System.out.println("Fetch person with load method :"+personEntity);
    }
}
