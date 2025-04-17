package com.epam.demo.department_service.service.impl;

import com.epam.demo.department_service.client.OrganizationClient;
import com.epam.demo.department_service.dto.DepartmentWithOrganizationDto;
import com.epam.demo.department_service.dto.OrganizationDto;
import com.epam.demo.department_service.entity.Department;
import com.epam.demo.department_service.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final OrganizationClient organizationClient;

    private static final Map<String,Department> departments = new HashMap<>();

    static {
    departments.put("IT-001",new Department(659977L,"Department of Developer",
            "IT-Department","IT-001","ORG_EPM"));
        departments.put("HR-002", new Department(659978L, "Department of HR",
                "HR Department", "HR-002", "ORG-TCS"));

    }

    public DepartmentServiceImpl(OrganizationClient organizationClient) {
        this.organizationClient = organizationClient;
    }

    @Override
    public DepartmentWithOrganizationDto getDepartmentWithOrganization(String code) {
        Department department = departments.get(code);

        if (department == null) {
            throw new RuntimeException("Department not found for code: " + code);
        }

        OrganizationDto organizationDto = organizationClient.getOrganizationByCode(department.getOrganizationCode());
        return new DepartmentWithOrganizationDto(department,organizationDto);
    }
}
