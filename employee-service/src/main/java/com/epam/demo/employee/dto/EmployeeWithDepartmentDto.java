package com.epam.demo.employee.dto;

import com.epam.demo.employee.Entity.Employee;

public class EmployeeWithDepartmentDto {
    private Employee employee;
    private DepartmentDto department;

    public EmployeeWithDepartmentDto() {}

    public EmployeeWithDepartmentDto(Employee employee, DepartmentDto department) {
        this.employee = employee;
        this.department = department;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }
}
