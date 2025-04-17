package com.example.organization_service.controller;

import com.example.organization_service.entity.Organization;
import com.example.organization_service.exception.OrganizationNotFoundException;
import com.example.organization_service.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    @GetMapping("/code/{code}")
    public Organization getOrgByCode(@PathVariable String code) {
        if (!code.equals("ORG-TCS") && !code.equals("ORG-EPM")) {
            throw new OrganizationNotFoundException("Organization with code '" + code + "' not found.");
        }

        if (code.equals("ORG-EPM")) {
            return new Organization("EPM101", "EPAM Systems");
        } else {
            return new Organization("TCS202", "Tata Consultancy Services");
        }
    }

}
