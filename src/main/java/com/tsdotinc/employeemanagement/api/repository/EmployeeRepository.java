package com.tsdotinc.employeemanagement.api.repository;

import com.tsdotinc.employeemanagement.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
