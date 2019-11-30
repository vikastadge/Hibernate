package com.vikastadge.hibernate.relation.dao;

import com.vikastadge.hibernate.relation.dao.entity.StudentEntity;
import com.vikastadge.hibernate.relation.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAO {

    public void insert(StudentEntity studentEntity){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(studentEntity);
        transaction.commit();
    }
}
