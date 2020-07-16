package practice.task1;

import practice.task1.Employee;

//inheritance
public class Manager extends Employee {

    private String adminPassword;
    private double managerBonus = 300;

    //constructor to initialize object arguments
    public Manager (String ID, String Name, String Department, String adminPassword){
        super (ID,Name,Department);
        this.adminPassword = adminPassword;

    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    //overriding the method from abstract class
    @Override
    public void addBonus (){
        setSalary(getSalary()+ 12*managerBonus);  // assigning new value to private variable
    }

    @Override
    public String toString() {
        return super.toString() + "salary: " + getSalary();
    }
}
