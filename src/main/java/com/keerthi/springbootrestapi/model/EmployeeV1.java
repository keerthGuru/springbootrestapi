package com.keerthi.springbootrestapi.model;

import com.keerthi.springbootrestapi.Request.EmployeeRequest;
import com.keerthi.springbootrestapi.repository.DepartmentV1;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
@Table(name = "tbl_employeeV1")
@NoArgsConstructor
public class EmployeeV1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JoinColumn(name = "department_id")
    @OneToOne
    private DepartmentV1 department;

    public EmployeeV1(EmployeeRequest req){
        this.name = req.getName();
    }
}


















