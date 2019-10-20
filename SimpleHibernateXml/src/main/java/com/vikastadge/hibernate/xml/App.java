package com.vikastadge.hibernate.xml;

import com.vikastadge.hibernate.xml.dao.entity.PersonEntity;
import com.vikastadge.hibernate.xml.service.PersonService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setName("Vikas Tadge....");
        PersonService personService = new PersonService();
        personService.save(personEntity);

    }
}
