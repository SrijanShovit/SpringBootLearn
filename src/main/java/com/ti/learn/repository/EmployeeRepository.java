package com.ti.learn.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public String getEmployee(Integer id){
        //DB operation
        System.out.println("Entered Repo");
        String employee;
        if (id == 1) employee = "Pinki";
        else employee = "Srijan";
        System.out.println("Exiting Repo");
        return employee;
    }
}
