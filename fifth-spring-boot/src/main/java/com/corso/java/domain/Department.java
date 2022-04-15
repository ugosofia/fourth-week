package com.corso.java.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name = "department")
public class Department {

    @Id
    private String id;
    private String name;
    private String city;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Department(String id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;

    }

    public Department() {
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
}
