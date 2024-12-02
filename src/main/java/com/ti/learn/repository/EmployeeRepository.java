package com.ti.learn.repository;

import com.ti.learn.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public EmployeeEntity getEmployee(Integer id){
        //DB operation
        return new EmployeeEntity(23,"HR","Anil",507357);
    }
}
