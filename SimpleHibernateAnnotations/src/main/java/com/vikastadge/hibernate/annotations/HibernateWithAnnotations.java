package com.vikastadge.hibernate.annotations;

import com.vikastadge.hibernate.annotations.dao.entity.PersonEntity;
import com.vikastadge.hibernate.annotations.service.PersonService;

/**
 * Hello world!
 *
 */
public class HibernateWithAnnotations {
    public static void main( String[] args ) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(7);
        personEntity.setName("Vikas Tadge");
        PersonService personService = new PersonService();
        personService.save(personEntity);

    }
}
