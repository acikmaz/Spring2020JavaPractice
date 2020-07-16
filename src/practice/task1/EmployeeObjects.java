package practice.task1;

import java.util.ArrayList;

public class EmployeeObjects {

    public static void main(String[] args) {

        //polymorphism & upcasting (implicit)
        Employee manager = new Manager("445566", "Mehmet", "A&B", "123444");
//        manager.Name = "Ali";
//        manager.Department = "T&L";
//        manager.ID = "12345";
        System.out.println(manager);

        //encapsulation & setter method use
        manager.setSalary(150000);

        System.out.println("initial salary: " + manager.getSalary());
        manager.addBonus();

        // we are getting object info because of return method "toString" in Employee custom class
        System.out.println(manager);

        System.out.println("==================================================================");

        Employee clerk = new Clerk("125463", "Ahmet", "T&L");

        System.out.println(clerk);

        clerk.setSalary(89000);
        System.out.println("initial salary: " + clerk.getSalary());

        clerk.addBonus();
        System.out.println(clerk);

        Clerk clerk1 = new Clerk("326589", "Veli", "ABC");
        System.out.println(clerk1);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(manager);
        employees.add(clerk);
        employees.add(clerk1);

        for (Employee each : employees){
            System.out.println(each.getName()+ ": " + each.getSalary());
        }



    }




}
