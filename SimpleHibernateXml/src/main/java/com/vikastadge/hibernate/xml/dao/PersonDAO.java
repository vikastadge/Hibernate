package com.vikastadge.hibernate.xml.dao;

import com.vikastadge.hibernate.xml.dao.entity.PersonEntity;
import com.vikastadge.hibernate.xml.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDAO {
    public void save(PersonEntity personEntity){
        System.out.println("in DAO");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(personEntity);

        transaction.commit();
        HibernateUtil.shutdown();
    }
}
