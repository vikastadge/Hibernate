package com.vikastadge.hibernate.relation;

import com.vikastadge.hibernate.relation.dao.entity.StudentEntity;
import com.vikastadge.hibernate.relation.dao.entity.StudentLocationEntity;
import com.vikastadge.hibernate.relation.service.StudentService;

public class OneToOne {
    public static void main( String[] args ) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentId(1);
        studentEntity.setStudentName("Vikas");

        StudentLocationEntity studentLocationEntity = new StudentLocationEntity("walls street",
                "Navi Mumbai", "MH", "4001");
        studentLocationEntity.setStudentLocationId(11);
        studentEntity.setStudentLocationEntity(studentLocationEntity);

        studentLocationEntity.setStudentEntity(studentEntity);

        StudentService studentService = new StudentService();
        studentService.insert(studentEntity);
    }
}
