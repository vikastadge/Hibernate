package com.vikastadge.hibernate.onetomany.dao;

import com.vikastadge.hibernate.onetomany.dao.entity.EventEntity;
import com.vikastadge.hibernate.onetomany.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EventDAO {
    public void save(EventEntity eventEntity){
        System.out.println("in DAO");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(eventEntity);
        transaction.commit();
    }
    public EventEntity get(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        EventEntity eventEntity = session.get(EventEntity.class, id);
        return eventEntity;
    }

}
