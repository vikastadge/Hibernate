package com.vikastadge.hibernate.onetomany.dao;

import com.vikastadge.hibernate.onetomany.dao.entity.EventEntity;
import com.vikastadge.hibernate.onetomany.dao.entity.SpeakerEntity;
import com.vikastadge.hibernate.onetomany.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SpeakerDAO {

    public SpeakerEntity get(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        SpeakerEntity speakerEntity = session.get(SpeakerEntity.class, id);
        return speakerEntity;
    }

}
