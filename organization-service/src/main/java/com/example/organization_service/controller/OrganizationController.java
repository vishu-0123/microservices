package com.example.organization_service.controller;

import com.example.organization_service.entity.Organization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    @GetMapping("/code/{code}")
    public Organization getOrgByCode(@PathVariable String code){
        return new Organization("EPM101","EPAM Systems");
    }

}
