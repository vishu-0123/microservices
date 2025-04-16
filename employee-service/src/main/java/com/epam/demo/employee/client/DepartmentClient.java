package com.epam.demo.employee.client;

import com.epam.demo.employee.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DEPARTMENT-SERVICE")
public interface DepartmentClient {

    @GetMapping("/api/departments/code/{code}")
    DepartmentDto getDepartmentByCode(@PathVariable("code") String departmentCode);
}

