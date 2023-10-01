package com.lichfl.departmentService.service;

import com.lichfl.departmentService.dto.DepartmentDto;

public interface DepartmentService {

	DepartmentDto saveDepartment(DepartmentDto departmentDto);
	DepartmentDto getDepartmentByCode(String code);

}
