package practice.task1;

public class Clerk extends Employee {

    private double clerkBonus = 100;



    public Clerk (String ID, String Name, String Department){
        super(ID, Name, Department);
    }

    public double getClerkBonus() {
        return clerkBonus;
    }

    public void setClerkBonus(double clerkBonus) {
        this.clerkBonus = clerkBonus;
    }

    @Override
    public void addBonus (){
        setSalary(getSalary()+ 12*clerkBonus);
    }

    @Override
    public String toString() {
        return super.toString() + "salary: " + getSalary();
    }



}
