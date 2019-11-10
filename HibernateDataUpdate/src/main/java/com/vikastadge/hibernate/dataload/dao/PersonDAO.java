package com.vikastadge.hibernate.dataload.dao;

import com.vikastadge.hibernate.dataload.dao.entity.PersonEntity;
import com.vikastadge.hibernate.dataload.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDAO {
    public PersonEntity updatePersonEntity(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        PersonEntity personEntity = session.load(PersonEntity.class, id);
        personEntity.setName(personEntity.getName() + " Updated");
        transaction.commit();
        return personEntity;
    }

    public void deletePersonEntity(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        PersonEntity personEntity = session.load(PersonEntity.class, id);
        session.delete(personEntity);
        transaction.commit();
    }

    public PersonEntity fetchDataWithGetMethod(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        PersonEntity personEntity = session.get(PersonEntity.class, id);
        return personEntity;
    }
}
