package com.ti.learn.dto;

import com.ti.learn.entity.EmployeeEntity;

public class EmployeeDTO {
    String name;
    String dept;
    Integer age;

    //getters needed to return response
    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDept(String dept){
        this.dept = dept;
    }

    public void setAge(Integer age){
        this.age = age;
    }



    public static EmployeeDTO employeeMapping(EmployeeEntity employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setName(employee.getName());
        dto.setDept(employee.getDept());
        dto.setAge(employee.getAge());
        return dto;
    }
}
