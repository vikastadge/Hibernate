package com.vikastadge.hibernate.relation.dao.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="student_location", catalog = "DBTest")
public class StudentLocationEntity implements Serializable {
    @Id
    @Column(name="student_location_id")
    private Integer studentLocationId;
    @OneToOne(mappedBy = "studentLocationEntity", cascade = CascadeType.ALL)
    private StudentEntity studentEntity;
    @Column(name="street")
    private String street;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zipcode")
    private String zipcode;

    public StudentLocationEntity(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Integer getStudentLocationId() {
        return studentLocationId;
    }

    public void setStudentLocationId(Integer studentLocationId) {
        this.studentLocationId = studentLocationId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="STUDENT_ID")
    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    @Column(name="street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    @Column(name="city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Column(name="state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
