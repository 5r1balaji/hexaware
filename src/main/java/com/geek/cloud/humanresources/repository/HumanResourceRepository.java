package com.geek.cloud.humanresources.repository;

import com.geek.cloud.humanresources.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface HumanResourceRepository extends JpaRepository<Employee,Long>{
}
