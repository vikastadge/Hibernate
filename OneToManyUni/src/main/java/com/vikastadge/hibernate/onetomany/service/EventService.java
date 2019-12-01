package com.vikastadge.hibernate.onetomany.service;

import com.vikastadge.hibernate.onetomany.dao.EventDAO;
import com.vikastadge.hibernate.onetomany.dao.entity.EventEntity;

public class EventService {

    EventDAO eventDAO = new EventDAO();

    public void save(EventEntity eventEntity){
        System.out.println("In Service");
        eventDAO.save(eventEntity);
    }

    /*public PersonEntity fetchDataWithLoadMethod(int id){
        return personDAO.fetchDataWithLoadMethod(id);
    }

    public PersonEntity fetchDataWithGetMethod(int id){
        return personDAO.fetchDataWithGetMethod(id);
    }
*/
}
