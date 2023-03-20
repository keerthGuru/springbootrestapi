package com.keerthi.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoryV1 extends JpaRepository<DepartmentV1, Long> {


}
