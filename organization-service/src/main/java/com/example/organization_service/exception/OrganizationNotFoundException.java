package com.example.organization_service.exception;

public class OrganizationNotFoundException extends RuntimeException {

    public OrganizationNotFoundException(String message){
        super(message);
    }
}
