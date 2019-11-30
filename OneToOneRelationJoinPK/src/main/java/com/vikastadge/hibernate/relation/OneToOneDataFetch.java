package com.vikastadge.hibernate.relation;

import com.vikastadge.hibernate.relation.dao.entity.StudentEntity;
import com.vikastadge.hibernate.relation.dao.entity.StudentLocationEntity;
import com.vikastadge.hibernate.relation.service.StudentService;

public class OneToOneDataFetch {
    public static void main( String[] args ) {
        StudentService studentService = new StudentService();
        StudentEntity studentEntity=  studentService.fetchDataWithGetMethod(2);
        System.out.println("Student id :-"+studentEntity.getStudentId());
        System.out.println("Student location details :-"+studentEntity.getStudentLocationEntity());
    }
}
