package practice.task2;

public class Circle extends TwoDimensionalShape{

    public double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public void getArea () {
        area = radius * radius * PI;
    }




}
