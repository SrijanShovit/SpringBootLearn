package com.ti.learn.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public String getEmployee(Integer id){
        //DB operation
        return "emp";
    }
}
