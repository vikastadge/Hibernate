package com.vikastadge.hibernate.onetomany;

import com.vikastadge.hibernate.onetomany.dao.entity.EventEntity;
import com.vikastadge.hibernate.onetomany.dao.entity.SpeakerEntity;
import com.vikastadge.hibernate.onetomany.service.EventService;
import com.vikastadge.hibernate.onetomany.service.SpeakerService;

public class DataFetchingFromChild {
    public static void main( String[] args ) {
        SpeakerService speakerService = new SpeakerService();
        SpeakerEntity speakerEntity = speakerService.get(1);
        speakerEntity.printSpeakerDetails();
        speakerEntity.printEventDetails();
    }
}
