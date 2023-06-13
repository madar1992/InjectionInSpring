package com.bitlabs.InjectionInSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

        System.out.println("All Employees:");
        employeeService.displayEmployeeDetails();

        System.out.println("\nEmployees with designation 'Developer':");
        employeeService.displayEmployeesByDesignation("Developer");
    }
}
