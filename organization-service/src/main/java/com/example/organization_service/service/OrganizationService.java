package com.example.organization_service.service;

import com.example.organization_service.entity.Organization;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class OrganizationService {


    private static final Map<String, Organization> organizations = new HashMap<>();

    static {
        organizations.put("ORG-EPM", new Organization("EPM101", "EPAM Systems"));
        organizations.put("ORG-TCS", new Organization("TCS202", "Tata Consultancy Services"));
        organizations.put("ORG-INFY", new Organization("INF303", "Infosys Ltd."));
    }

    public Optional<Organization> getOrgByCode(String code) {
        return Optional.ofNullable(organizations.get(code));
    }
}
