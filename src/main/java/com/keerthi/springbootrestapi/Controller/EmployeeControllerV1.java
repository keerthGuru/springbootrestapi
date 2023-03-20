package com.keerthi.springbootrestapi.Controller;

import com.keerthi.springbootrestapi.Request.EmployeeRequest;
import com.keerthi.springbootrestapi.model.EmployeeV1;
import com.keerthi.springbootrestapi.repository.DepartmentRepositoryV1;
import com.keerthi.springbootrestapi.repository.DepartmentV1;
import com.keerthi.springbootrestapi.repository.EmployeeRepositoryV1;
import com.keerthi.springbootrestapi.service.EmployeeServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/V1")
public class EmployeeControllerV1 {
    @Autowired
    private EmployeeServiceV1 employeeServiceV1;

    private DepartmentRepositoryV1 dRepoV1;

    private EmployeeRepositoryV1 eRepoV1;


   /* @GetMapping("/employees")
    public ResponseEntity<List<EmployeeV1>> getEmployees(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
        return new ResponseEntity<List<EmployeeV1>>(employeeServiceV1.getEmployees(pageNumber, pageSize), HttpStatus.OK);
    }*/

    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeV1> getEmployeeId(@PathVariable Long id) {
        return new ResponseEntity<>(employeeServiceV1.getEmployeeId(id), HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity<EmployeeV1> saveEmployee(@Valid @RequestBody EmployeeRequest eRequest) {
        DepartmentV1 dept = new DepartmentV1();
        dept.setName(eRequest.getDepartment());
     dept = dRepoV1.save(dept);

     EmployeeV1 employeeV1= new EmployeeV1(eRequest);
     employeeV1.setDepartment(dept);
     return new ResponseEntity<EmployeeV1>(eRepoV1.save(employeeV1), HttpStatus.CREATED);

    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<EmployeeV1> updateEmployee(@PathVariable Long id, @RequestBody EmployeeV1 employee) {
        employee.setId(id);
        return new ResponseEntity<EmployeeV1>(employeeServiceV1.updateEmployee(employee), HttpStatus.OK);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Long> deleteEmployeeById(@PathVariable Long id) {
        /* EmployeeV1 isRemoved = employeeServiceV1.getEmployeeId(id); */
        return new ResponseEntity<>(employeeServiceV1.deleteEmployee(id), HttpStatus.OK);
    }
}
