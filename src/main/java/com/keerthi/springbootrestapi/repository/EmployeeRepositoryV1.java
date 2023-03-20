package com.keerthi.springbootrestapi.repository;

import com.keerthi.springbootrestapi.model.EmployeeV1;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoryV1 extends PagingAndSortingRepository<EmployeeV1, Long> {

}
