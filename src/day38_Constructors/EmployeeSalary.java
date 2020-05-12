package day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {

        SalaryCalculator Employee1 = new SalaryCalculator(55, 40, 0.06, 0.2);

        System.out.println(Employee1);

        System.out.println("======================");

        SalaryCalculator Employee2 = new SalaryCalculator(45, 40, 0.05, 0.2);

        System.out.println(Employee2);



    }

}
