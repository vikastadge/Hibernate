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

    /*public StudentEntity updatePersonEntity(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StudentEntity studentEntity = session.load(StudentEntity.class, id);
        studentEntity.setName(studentEntity.getName() + " Updated");
        transaction.commit();
        return studentEntity;
    }

    public void deletePersonEntity(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StudentEntity studentEntity = session.load(StudentEntity.class, id);
        session.delete(studentEntity);
        transaction.commit();
    }

    public StudentEntity fetchDataWithGetMethod(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        StudentEntity studentEntity = session.get(StudentEntity.class, id);
        return studentEntity;
    }*/
}
