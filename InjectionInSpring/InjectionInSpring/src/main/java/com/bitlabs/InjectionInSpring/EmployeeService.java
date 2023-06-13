package com.bitlabs.InjectionInSpring;

import java.util.List;

public class EmployeeService {
    private List<Employee> employees;

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void displayEmployeeDetails() {
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Designation: " + employee.getDesignation());
            System.out.println("---------------------------");
        }
    }

    public void displayEmployeesByDesignation(String designation) {
        for (Employee employee : employees) {
            if (employee.getDesignation().equals(designation)) {
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Designation: " + employee.getDesignation());
                System.out.println("---------------------------");
            }
        }
    }
}

