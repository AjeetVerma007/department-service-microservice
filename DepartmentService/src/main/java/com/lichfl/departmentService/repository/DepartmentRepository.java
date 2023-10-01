package com.lichfl.departmentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lichfl.departmentService.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentCode(String code);
}
