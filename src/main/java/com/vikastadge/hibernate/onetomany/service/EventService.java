package com.vikastadge.hibernate.onetomany.service;

import com.vikastadge.hibernate.onetomany.dao.EventDAO;
import com.vikastadge.hibernate.onetomany.dao.entity.EventEntity;

public class EventService {

    EventDAO eventDAO = new EventDAO();

    public void save(EventEntity eventEntity){
        eventDAO.save(eventEntity);
    }

    public EventEntity get(int id){
        return eventDAO.get(id);
    }
}
