package com.corso.java.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private String id;
    private String name;
    private String passport;

    public Student(String id, String name, String passport) {
        this.id = id;
        this.name = name;
        this.passport = passport;
    }

    public Student(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
