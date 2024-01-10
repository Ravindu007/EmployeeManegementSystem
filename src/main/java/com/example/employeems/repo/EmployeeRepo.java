package com.example.employeems.repo;

import com.example.employeems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e WHERE e.empName = :empName")
    List<Employee> findByEmpName(String empName);
}
