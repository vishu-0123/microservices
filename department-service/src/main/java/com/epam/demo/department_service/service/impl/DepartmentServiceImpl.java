package com.epam.demo.department_service.service.impl;

import com.epam.demo.department_service.client.OrganizationClient;
import com.epam.demo.department_service.dto.DepartmentWithOrganizationDto;
import com.epam.demo.department_service.dto.OrganizationDto;
import com.epam.demo.department_service.entity.Department;
import com.epam.demo.department_service.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final OrganizationClient organizationClient;

    public DepartmentServiceImpl(OrganizationClient organizationClient) {
        this.organizationClient = organizationClient;
    }

    @Override
    public DepartmentWithOrganizationDto getDepartmentWithOrganization(String code) {
        Department department = new Department(659977L,"Department of Developer",
                "IT-Department","IT-001","ORG-EPM");
        OrganizationDto organizationDto = organizationClient.getOrganizationByCode(department.getOrganizationCode());
        return new DepartmentWithOrganizationDto(department,organizationDto);
    }
}
