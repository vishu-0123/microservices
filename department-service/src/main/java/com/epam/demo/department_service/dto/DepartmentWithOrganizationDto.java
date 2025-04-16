package com.epam.demo.department_service.dto;

import com.epam.demo.department_service.entity.Department;

public class DepartmentWithOrganizationDto {
    private Department department;
    private OrganizationDto organization;

    public DepartmentWithOrganizationDto(Department department, OrganizationDto organization) {
        this.department = department;
        this.organization = organization;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public OrganizationDto getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationDto organization) {
        this.organization = organization;
    }
}
