package com.ti.learn.service;

import com.ti.learn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public String getEmployee(Integer id){
        //Business Logic
        System.out.println("Entered Service");
        String employee = employeeRepository.getEmployee(id);
        System.out.println("Exiting Service");
        return employee;
    }
}
