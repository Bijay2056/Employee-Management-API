package com.tsdotinc.employeemanagement.api.repository;

import com.tsdotinc.employeemanagement.api.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
