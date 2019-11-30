package com.vikastadge.hibernate.relation.dao.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
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

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentLocationEntity=" + studentLocationEntity +
                '}';
    }
}
