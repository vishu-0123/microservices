package com.epam.demo.department_service.dto;

public class OrganizationDto {
    private String organizationName;
    private String organizationCode;

    public OrganizationDto(String organizationName, String organizationCode) {
        this.organizationName = organizationName;
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }
}
