package com.vikastadge.hibernate.dataload.dao;

import com.vikastadge.hibernate.dataload.dao.entity.PersonEntity;
import com.vikastadge.hibernate.dataload.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDAO {
    public void save(PersonEntity personEntity){
        System.out.println("in DAO");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(personEntity);
        transaction.commit();
        HibernateUtil.shutdown();
    }

    public PersonEntity fetchDataWithLoadMethod(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        PersonEntity personEntity = session.load(PersonEntity.class, id);
        return personEntity;
    }

    public PersonEntity fetchDataWithGetMethod(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        PersonEntity personEntity = session.get(PersonEntity.class, id);
        return personEntity;
    }
}
