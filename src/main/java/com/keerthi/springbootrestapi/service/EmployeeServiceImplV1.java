package com.keerthi.springbootrestapi.service;

import com.keerthi.springbootrestapi.model.EmployeeV1;
import com.keerthi.springbootrestapi.repository.EmployeeRepositoryV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplV1 implements EmployeeServiceV1 {
    @Autowired
    private EmployeeRepositoryV1 employeeRepositoryV1;

  /*  @Override
    public List<EmployeeV1> getEmployees(EmployeeV1 employee) {
        return new employeeRepositoryV1.findAll(employee);
    }*/

    @Override
    public EmployeeV1 saveEmployee(EmployeeV1 employee) {
        return employeeRepositoryV1.save(employee);
    }

    @Override
    public EmployeeV1 getEmployeeId(Long id) {
        Optional<EmployeeV1> employee = employeeRepositoryV1.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        }
        throw new RuntimeException("EmployeeV1 is not found for id" + id);
    }

    @Override
    public Long deleteEmployee(Long id) {
        employeeRepositoryV1.deleteById(id);
        return id;
    }

    @Override
    public EmployeeV1 updateEmployee(EmployeeV1 employee) {
        return employeeRepositoryV1.save(employee);
    }

}



