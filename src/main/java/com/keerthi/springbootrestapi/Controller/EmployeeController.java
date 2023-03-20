package com.keerthi.springbootrestapi.Controller;

import com.keerthi.springbootrestapi.model.Employee;
import com.keerthi.springbootrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.lang.Integer;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    //    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployees(pageNumber, pageSize), HttpStatus.OK);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeId(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.getEmployeeId(id), HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Long> deleteEmployeeById(@PathVariable Long id) {
        /* Employee isRemoved = employeeService.getEmployeeId(id); */
        return new ResponseEntity<>(employeeService.deleteEmployee(id), HttpStatus.OK);


    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee), HttpStatus.OK);
    }

    @GetMapping("/employees/filterByName")
    public ResponseEntity<List<Employee>> getEmployeesByName(@RequestParam String name) {
        return new ResponseEntity<List<Employee>>(
                employeeService.getEmployeesByName(name), HttpStatus.OK);
    }

    @GetMapping("employees/filedByNameAndLocation")
    public ResponseEntity<List<Employee>> getEmployeesByNameAndLocation(@RequestParam String name, @RequestParam String location) {
        return new ResponseEntity<List<Employee>>(
                employeeService.getEmployeesByNameAndLocation(name, location),
                HttpStatus.OK);
    }

    @GetMapping("employees/filedByKeyword")
    public ResponseEntity<List<Employee>> getEmployeeByKeyword(@RequestParam String name) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployeesByKeyword(name), HttpStatus.OK);
    }

    @GetMapping("employees/{name}/{location}")
    public  ResponseEntity<List<Employee>> getEmployeesByNameOrLocation(@PathVariable String name, @PathVariable String location) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployeeByNameOrLocation(name, location), HttpStatus.OK);
     }

    @DeleteMapping("employees/delete/{name}")
    public  ResponseEntity<String> deleteEmployeesByName(@PathVariable String name) {
        return new ResponseEntity<String >(employeeService.deleteByEmployeeName(name)+ "No. of records deleted",HttpStatus.OK);
    }

  /*  @DeleteMapping("/employees")
    public List<Employee> deleteEmployeeByName(@RequestParam String name) {
        return employeeService.deleteEmployeeByName(name);


    }*/

}
