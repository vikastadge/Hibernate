package com.vikastadge.hibernate.relation.service;

import com.vikastadge.hibernate.relation.dao.StudentDAO;
import com.vikastadge.hibernate.relation.dao.entity.StudentEntity;

public class StudentService {

    StudentDAO studentDAO = new StudentDAO();

    public void insert(StudentEntity studentEntity){
        studentDAO.insert(studentEntity);
    }

    /*public StudentEntity updatePersonEntity(int id){
        return studentDAO.updatePersonEntity(id);
    }

    public void deletePersonEntity(int id){
        studentDAO.deletePersonEntity(id);
    }

    public StudentEntity fetchDataWithGetMethod(int id){
        return studentDAO.fetchDataWithGetMethod(id);
    }*/
}
