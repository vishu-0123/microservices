package com.epam.demo.employee.controller;

import com.epam.demo.employee.dto.EmployeeWithDepartmentDto;
import com.epam.demo.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public EmployeeWithDepartmentDto getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeWithDepartment(id);
    }
}
