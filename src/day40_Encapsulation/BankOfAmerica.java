package day40_Encapsulation;


public class BankOfAmerica {

    public static void main(String[] args) {


        EmployeeInfo employee1 = new EmployeeInfo();
        employee1.setAddress("Virginia");
        employee1.setSalary(120000.50);

        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.CompanyName);

    }
}
