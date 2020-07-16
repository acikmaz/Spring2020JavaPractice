package practice.task2;

public class Cube extends ThreeDimensionalShape{

    public double side;

    public Cube (double side){
        this.side = side;
    }

    public void getArea () {
        area = side * side * 6;
    }

    public void getVolume (){
        volume = side * side * side;
    }


}
