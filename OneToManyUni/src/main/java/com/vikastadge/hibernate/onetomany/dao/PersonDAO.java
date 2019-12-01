package com.vikastadge.hibernate.onetomany.dao;

public class PersonDAO {
    /*public void save(PersonEntity personEntity){
        System.out.println("in DAO");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(personEntity);
        transaction.commit();
        HibernateUtil.shutdown();
    }*/

    /*public PersonEntity fetchDataWithLoadMethod(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        PersonEntity personEntity = session.load(PersonEntity.class, id);
        return personEntity;
    }

    public PersonEntity fetchDataWithGetMethod(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        PersonEntity personEntity = session.get(PersonEntity.class, id);
        return personEntity;
    }*/
}
