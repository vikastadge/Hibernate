package com.vikastadge.hibernate.onetomany;

import com.vikastadge.hibernate.onetomany.dao.entity.EventEntity;
import com.vikastadge.hibernate.onetomany.dao.entity.SpeakerEntity;
import com.vikastadge.hibernate.onetomany.service.EventService;

import java.util.HashSet;
import java.util.Set;

public class OneToManyBi {
    public static void main( String[] args ) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setEvent_id(2);
        eventEntity.setEvent_name("Spring");
        SpeakerEntity speakerEntity1 = new SpeakerEntity(3,"Alice", 30);
        SpeakerEntity speakerEntity2 = new SpeakerEntity(4,"Alice2", 30);
        speakerEntity1.setEventEntity(eventEntity);
        speakerEntity2.setEventEntity(eventEntity);
        Set<SpeakerEntity> speakers = new HashSet<>();
        speakers.add(speakerEntity1);
        speakers.add(speakerEntity2);

        eventEntity.setSpeakers(speakers);
        EventService eventService = new EventService();
        eventService.save(eventEntity);
    }
}
