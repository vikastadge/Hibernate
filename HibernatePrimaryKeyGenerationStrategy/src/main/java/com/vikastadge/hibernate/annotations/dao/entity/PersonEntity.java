package com.vikastadge.hibernate.annotations.dao.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "table-generator")
    @TableGenerator(name = "table-generator",
            table = "person_sequences",
            pkColumnName = "sequence_name",
            valueColumnName = "next_val",
            allocationSize = 1,
            initialValue = 0
            )
    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/

    /*@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_id_generator")
    @GenericGenerator(
            name = "person_id_generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "person_id_seq", value = "person_id_seq"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )*/

    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
