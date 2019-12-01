package com.vikastadge.hibernate.relation.dao.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="student", catalog = "DBTest")
public class StudentEntity implements Serializable {
    @Id
    @Column(name="student_id")
    private Integer studentId;

    @Column(name="student_name")
    private String studentName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_location_id")
    private StudentLocationEntity studentLocationEntity;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public StudentLocationEntity getStudentLocationEntity() {
        return studentLocationEntity;
    }

    public void setStudentLocationEntity(StudentLocationEntity studentLocationEntity) {
        this.studentLocationEntity = studentLocationEntity;
    }
}
