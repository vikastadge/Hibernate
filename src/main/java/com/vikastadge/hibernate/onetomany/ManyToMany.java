package com.vikastadge.hibernate.onetomany;

import com.vikastadge.hibernate.onetomany.dao.entity.EventEntity;
import com.vikastadge.hibernate.onetomany.dao.entity.SpeakerEntity;
import com.vikastadge.hibernate.onetomany.service.EventService;

import java.util.HashSet;
import java.util.Set;

public class ManyToMany {
    public static void main( String[] args ) {

        SpeakerEntity speakerEntity1 = new SpeakerEntity(1,"Alice", 30);
        SpeakerEntity speakerEntity2 = new SpeakerEntity(2,"Bob", 30);


        SpeakerEntity speakerEntity3 = new SpeakerEntity(2,"Bob", 30);
        SpeakerEntity speakerEntity4 = new SpeakerEntity(3,"Martin", 30);


        EventEntity eventOne = new EventEntity();
        eventOne.setEvent_id(1);
        eventOne.setEvent_name("Java");
        eventOne.getSpeakers().add(speakerEntity1);
        eventOne.getSpeakers().add(speakerEntity2);

        EventEntity eventTwo = new EventEntity();
        eventTwo.setEvent_id(2);
        eventTwo.setEvent_name("Spring");
        eventTwo.getSpeakers().add(speakerEntity3);
        eventTwo.getSpeakers().add(speakerEntity4);


        EventService eventService = new EventService();
        eventService.save(eventOne);
        eventService.save(eventTwo);
    }
}
