package com.vikastadge.hibernate.onetomany;

import com.vikastadge.hibernate.onetomany.dao.entity.EventEntity;
import com.vikastadge.hibernate.onetomany.dao.entity.SpeakerEntity;
import com.vikastadge.hibernate.onetomany.service.EventService;

import java.util.HashSet;
import java.util.Set;

public class OneToMany {
    public static void main( String[] args ) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setEvent_id(1);
        eventEntity.setEvent_name("Java");
        SpeakerEntity speakerEntity1 = new SpeakerEntity(1,"Alice", 30);
        SpeakerEntity speakerEntity2 = new SpeakerEntity(2,"Alice2", 30);
        Set<SpeakerEntity> speakers = new HashSet<>();
        speakers.add(speakerEntity1);
        speakers.add(speakerEntity2);

        eventEntity.setSpeakers(speakers);
        EventService eventService = new EventService();
        eventService.save(eventEntity);
    }

    /*private static void fetchDataWithLoadMethod(int id){
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
    }*/
}
