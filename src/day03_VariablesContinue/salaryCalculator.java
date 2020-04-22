package day03_VariablesContinue;

public class salaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 65;
        double stateTaxRate = 0.04 ;
        double federalTaxRate = 0.22 ;
        byte weeklyHours = 40 ;
        byte totalWeeks = 52 ;
        double salary = hourlyRate * weeklyHours * totalWeeks ; // gross income
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double netIncome = salary - (stateTax + federalTax);

        System.out.println("your income: $" + salary);
        System.out.println("your tax: $" + (stateTax + federalTax));
        System.out.println("net income: $" + netIncome );





    }
}
