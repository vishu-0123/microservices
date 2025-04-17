package com.epam.demo.employee.service;

import com.epam.demo.employee.Entity.Employee;
import com.epam.demo.employee.client.DepartmentClient;
import com.epam.demo.employee.dto.DepartmentDto;
import com.epam.demo.employee.dto.EmployeeWithDepartmentDto;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final DepartmentClient departmentClient;

    public EmployeeService(DepartmentClient departmentClient) {
        this.departmentClient = departmentClient;
    }

    public EmployeeWithDepartmentDto getEmployeeWithDepartment(Long employeeId) {

        Employee emp = new Employee(employeeId, "IT-001", "john.doe@epam.com", "Doe", "John");

        DepartmentDto department = departmentClient.getDepartmentByCode(emp.getDepartmentCode());

        return new EmployeeWithDepartmentDto(emp, department);
    }
}
