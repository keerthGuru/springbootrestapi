package com.keerthi.springbootrestapi.service;

import com.keerthi.springbootrestapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>  getEmployees();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeId(Long id);

    void  deleteEmployee(Long id);

    Employee updateEmployee( Employee employee);

   // List<Employee> deleteEmployeeByName(String name);
}
