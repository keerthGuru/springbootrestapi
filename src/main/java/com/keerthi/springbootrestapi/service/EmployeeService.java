package com.keerthi.springbootrestapi.service;

import com.keerthi.springbootrestapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    // List<Employee>  getEmployees( );

    List<Employee> getEmployees(int pageNumber, int pageSize);

    Employee saveEmployee(Employee employee);

    Employee getEmployeeId(Long id);

    Long deleteEmployee(Long id);

    Employee updateEmployee(Employee employee);

    List<Employee> getEmployeesByName(String name);
    // List<Employee> deleteEmployeeByName(String name);

    List<Employee> getEmployeesByNameAndLocation(String name, String location);

    List<Employee> getEmployeesByKeyword(String name);

    List<Employee> getEmployeeByNameOrLocation(String name, String location);
    Integer deleteByEmployeeName(String name);
}
