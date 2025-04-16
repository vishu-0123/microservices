package com.epam.demo.employee.Entity;

public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentCode;

    public Employee() {
    }

    public Employee(Long id, String departmentCode, String email, String lastName, String firstName) {
        this.id = id;
        this.departmentCode = departmentCode;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
