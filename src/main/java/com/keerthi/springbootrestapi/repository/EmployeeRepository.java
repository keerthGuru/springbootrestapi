package com.keerthi.springbootrestapi.repository;

import com.keerthi.springbootrestapi.model.Employee;
import org.hibernate.sql.Delete;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

    List<Employee> findByName(String name);

    // select *from Employees where name = "" AND location = " ";

    List<Employee> findByNameAndLocation(String name, String location);

    /* Select *from employee where name LIKE “%ram%” */
    List<Employee> findByNameContaining(String keyword);


    List<Employee> findByNameContaining(String name, Sort sort);

    @Query("FROM Employee WHERE name = :name OR location = :location")
    List<Employee> getEmployeesByNameAndLocation(String name, String location);

    @Transactional
    @Modifying
    @Query("DELETE FROM Employee WHERE name = :name")
    Integer deleteEmployeeByName(String name); // no selected query return type should be int or void

    //  List<Employee> getEmployeesByNameAndLocation(@Param("name")String abc, String location);
}
