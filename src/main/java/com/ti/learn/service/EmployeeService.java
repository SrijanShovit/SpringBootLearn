package com.ti.learn.service;

import com.ti.learn.dto.EmployeeDTO;
import com.ti.learn.entity.EmployeeEntity;
import com.ti.learn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeDTO getEmployee(Integer id){
        //Business Logic

        //Service accepts Entity and returns DTO
        EmployeeEntity employee = employeeRepository.getEmployee(id);
        return EmployeeDTO.employeeMapping(employee);

    }
}
