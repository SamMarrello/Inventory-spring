package com.example.payroll.errors;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("Could not find Employee " + id);
    }

}
