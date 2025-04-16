package com.epam.demo.department_service.client;

import com.epam.demo.department_service.dto.DepartmentWithOrganizationDto;
import com.epam.demo.department_service.dto.OrganizationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ORGANIZATION-SERVICE")
public interface OrganizationClient {

    @GetMapping("/api/organizations/code/{code}")
    OrganizationDto getOrganizationByCode(@PathVariable("code") String organizationCode);

}







