package com.vikastadge.hibernate.annotations;

import com.vikastadge.hibernate.annotations.dao.entity.PersonEntity;
import com.vikastadge.hibernate.annotations.service.PersonService;

public class HibernatePrimaryKeyGenerationStrategy {
    public static void main( String[] args ) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setName("Bob");
        PersonService personService = new PersonService();
        personService.save(personEntity);
    }
}
