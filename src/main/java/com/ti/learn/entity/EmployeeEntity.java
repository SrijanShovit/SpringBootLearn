package com.ti.learn.entity;

import com.ti.learn.dto.EmployeeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //DB table item to Java object
public class EmployeeEntity {
    @Id //PK
    Integer id;
    String name;
    String dept;
    Integer age;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Integer age, String dept, String name, Integer id) {
        this.age = age;
        this.dept = dept;
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public String getDept(){
        return this.dept;
    }

    public Integer getAge(){
        return this.age;
    }
}
