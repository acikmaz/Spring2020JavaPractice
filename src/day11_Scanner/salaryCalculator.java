package day11_Scanner;

/*
 write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
 */

import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your salary: ");
            int salary = input.nextInt();

        System.out.println("Enter state tax rate: ");
            byte stateTax = input.nextByte();
            double stateTaxPercentage = stateTax / 100.0;

        System.out.println("Enter federal tax rate: ");
            byte federalTax = input.nextByte();
            double federalTaxPercentage = federalTax / 100.0;

        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your Salary after tax is $" + salaryAfterTax);

        System.out.println("Total tax is $" + totalTax);






    }

}
