package com.epam.demo.department_service.service;

import com.epam.demo.department_service.dto.DepartmentWithOrganizationDto;
import com.epam.demo.department_service.entity.Department;

public interface DepartmentService {
//    Department getDepartmentByCode(String code);

    DepartmentWithOrganizationDto getDepartmentWithOrganization(String code);
}
