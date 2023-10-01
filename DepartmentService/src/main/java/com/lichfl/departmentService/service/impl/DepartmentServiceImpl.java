package com.lichfl.departmentService.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.lichfl.departmentService.dto.DepartmentDto;
import com.lichfl.departmentService.entity.Department;
import com.lichfl.departmentService.repository.DepartmentRepository;
import com.lichfl.departmentService.service.DepartmentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository departmentRepository;

	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

		Department department = new Department();
		BeanUtils.copyProperties(departmentDto, department);
		Department savedDepartment = departmentRepository.save(department);

		DepartmentDto savedDepartmentDto = new DepartmentDto();

		BeanUtils.copyProperties(savedDepartment, savedDepartmentDto);

		return savedDepartmentDto;
	}

	@Override
	public DepartmentDto getDepartmentByCode(String code) {

		Department department = departmentRepository.findByDepartmentCode(code);
		DepartmentDto departmentDto = new DepartmentDto();
		BeanUtils.copyProperties(department, departmentDto);
		return departmentDto;
	}

}
