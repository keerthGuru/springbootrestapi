package com.keerthi.springbootrestapi.service;

import com.keerthi.springbootrestapi.model.EmployeeV1;

import java.util.List;

public interface EmployeeServiceV1 {
    // List<EmployeeV1>  getEmployees( );

   // List<EmployeeV1> getEmployees(EmployeeV1 employee);

   EmployeeV1 saveEmployee(EmployeeV1 employee);

    EmployeeV1 getEmployeeId(Long id);

    Long deleteEmployee(Long id);

    EmployeeV1 updateEmployee(EmployeeV1 employee);

}
