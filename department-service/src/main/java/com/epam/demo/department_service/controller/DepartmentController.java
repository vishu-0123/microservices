package com.epam.demo.department_service.controller;

import com.epam.demo.department_service.dto.DepartmentWithOrganizationDto;
import com.epam.demo.department_service.entity.Department;
import com.epam.demo.department_service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    @GetMapping("/with-organization/{code}")

    public ResponseEntity<DepartmentWithOrganizationDto> getDepartmentWithOrg(@PathVariable String code){
        return ResponseEntity.ok(departmentService.getDepartmentWithOrganization(code));
    }


}
