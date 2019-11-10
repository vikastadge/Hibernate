package com.vikastadge.hibernate.annotations.dao;

import com.vikastadge.hibernate.annotations.dao.entity.PersonEntity;
import com.vikastadge.hibernate.annotations.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDAO {
    public void save(PersonEntity personEntity){
        System.out.println("in DAO");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(personEntity);
        transaction.commit();
        System.out.println("Identifier :-"+session.getIdentifier(personEntity));
        HibernateUtil.shutdown();

    }
}
