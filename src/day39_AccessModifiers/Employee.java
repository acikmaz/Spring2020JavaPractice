package day39_AccessModifiers;
/*
create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
 */

public class Employee {

    String name;
    String jobTitle;
    long id;
    double salary;
    char gender;
    static String companyName = "CapitalBank";

    public Employee(String name){
        this.name = name;

    }

    public Employee(String name, String jobTitle){
        //this.name = name;
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, long id){
        // this.name = name;
        // this.jobTitle = jobTitle;
        this(name, jobTitle);
        this.id = id;
    }

    public Employee(String name, String jobTitle, long id, double salary){
        // this.name = name;
        // this.jobTitle = jobTitle;
        // this.id = id;
        this(name, jobTitle, id);
        this.salary = salary;
    }

    public Employee(String name, String jobTitle, long id, double salary, char gender){
        // this.name = name;
        // this.jobTitle = jobTitle;
        // this.id = id;
        // this.salary = salary;
        this(name, jobTitle, id, salary);
        this.gender = gender;
    }

    public String toString() {
        return "Employee name: " + name +
                ", jobTitle: " + jobTitle +
                ", id: " + id +
                ", salary: " + salary +
                ", gender: " + gender +
                ", Company name: " + companyName;
    }
}
