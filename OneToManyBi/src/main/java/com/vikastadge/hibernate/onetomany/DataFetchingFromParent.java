package com.vikastadge.hibernate.onetomany;

import com.vikastadge.hibernate.onetomany.dao.entity.EventEntity;
import com.vikastadge.hibernate.onetomany.dao.entity.SpeakerEntity;
import com.vikastadge.hibernate.onetomany.service.EventService;

import java.util.HashSet;
import java.util.Set;

public class DataFetchingFromParent {
    public static void main( String[] args ) {
        EventService eventService = new EventService();
        EventEntity eventEntity = eventService.get(1);
        eventEntity.printEventDetails();
        eventEntity.printSpeakerDetails();
    }
}
