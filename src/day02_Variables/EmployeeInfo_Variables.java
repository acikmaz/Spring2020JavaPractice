package day02_Variables;

public class EmployeeInfo_Variables {

    public static void main(String[] args) {
        String EmployeeName = "Ali";
        String CompanyName = "Oracle";
        int ID = 9;
        String Title = "SDET";
        double salary = 100000.5 ;
        long ssn = 123456789;

        // Employee Name:

        System.out.println("Employee Name: " + EmployeeName );
        System.out.println("Company Name: "+ CompanyName);
        System.out.println("Employee ID" + ID);
        System.out.println("Job Title: "+ Title);
        System.out.println("Salary: " + salary);
        System.out.println("SSN:" + ssn);

        System.out.println("===================================");

        System.out.println( "Employee Name: " + EmployeeName +
                            "\nCompany Name: "+ CompanyName +
                            "\nEmployee ID" + ID +
                            "\nJob Title: "+ Title +
                            "\nSalary: " + salary +
                            "\nSSN:" + ssn);

        System.out.println("===================================");

        String firstName = "Ali";
        String lastName = "Cikmaz";

        System.out.println("Full Name:" + firstName+" "+lastName);

    }

}
