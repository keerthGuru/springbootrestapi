package com.keerthi.springbootrestapi.Controller;

import com.keerthi.springbootrestapi.model.Employee;
import com.keerthi.springbootrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    // private EmployeeRepository employeeRepository;

    //    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeId(@PathVariable Long id) {
        return employeeService.getEmployeeId(id);
    }

    @PostMapping("/employees")
    public Employee saveEmployee( @RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/employees")
    public void deleteEmployee(@RequestParam Long id) {
        employeeService.deleteEmployee(id);
           }

  /*  @DeleteMapping("/employees")
    public List<Employee> deleteEmployeeByName(@RequestParam String name) {
        return employeeService.deleteEmployeeByName(name);

    }*/

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }
}
