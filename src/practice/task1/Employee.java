package practice.task1;

/*
Create a class named Employee that can be used to calculate the salaries of different employees.
The Employee class should keep a track of the employee ID, name, department,
salary, and designation with appropriate accessor and mutator methods.
Next, create two additional classes named Manager and Clerk that are derived from Employee.
Create an overridden method named addBonus that returns the salary of the employee
after adding up the bonus. There is a default bonus of $200/month.
Managers have a bonus of $300/month and clerks have a bonus of $100/month.
Finally create a display method to print the details of the employee.
You may assume the initial salary of an employee and other necessary values.
Test your classes from a main method.
---FROM Absolute JAVA---

 */


public class Employee {



    //declaring variables
    private String ID;
    private String Name;
    private String Department;
    private double Salary;
    private static double baseBonus =200;

    public Employee(){

    }

    public Employee (String ID, String Name, String Department){
        this.ID = ID;
        this.Name = Name;
        this.Department = Department;
    }

    //encapsulation -- getter method
    public double getSalary(){
        return Salary;
    }

    //encapsulation -- setter method
    public void setSalary(double Salary){
        this.Salary = Salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void addBonus(){
        setSalary(getSalary()+ 12*baseBonus);
    };


    //custom class return method
    public String toString(){
     return "Name: " + Name + ", ID: " + ID + ", Department: " + Department;
    }

}
