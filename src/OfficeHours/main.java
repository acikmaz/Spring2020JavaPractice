package OfficeHours;

import java.util.*;

public class main {
    public static void main(String[] args) {
        //WRITE YOUR CODES HERE
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 7; i++){
            System.out.println("Enter score for judge " + i+ ":");
            Integer a = input.nextInt();
            list.add(a);
        }

        System.out.println("Enter difficulty:");
        Integer b = input.nextInt();
        list.remove(Collections.min(list));
        list.remove(Collections.max(list));

        int sum = 0;
        for(Integer each : list){
            sum += each;
        }

        double total = sum*b*0.6;

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}

class Pizza {

    private String size;
    private int cheeseTop;
    private int pepperoniTop;
    private int hamTop;


    public Pizza(String size, int cheeseTop, int pepperoniTop, int hamTop) {
        this.size = size;
        this.cheeseTop = cheeseTop;
        this.pepperoniTop = pepperoniTop;
        this.hamTop = hamTop;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseTop() {
        return cheeseTop;
    }

    public void setCheeseTop(int cheeseTop) {
        this.cheeseTop = cheeseTop;
    }

    public int getPepperoniTop() {
        return pepperoniTop;
    }

    public void setPepperoniTop(int pepperoniTop) {
        this.pepperoniTop = pepperoniTop;
    }

    public int getHamTop() {
        return hamTop;
    }

    public void setHamTop(int hamTop) {
        this.hamTop = hamTop;
    }


    public double calcCost() {

        int toppingsCost = (cheeseTop * 2) + (pepperoniTop * 2) + (hamTop * 2);

        if (size.equalsIgnoreCase("Small")) {
            return 10 + toppingsCost;
        } else if (size.equalsIgnoreCase("Medium")) {
            return 12 + toppingsCost;
        } else if (size.equalsIgnoreCase("Large")) {
            return 14 + toppingsCost;
        } else {
            return 0;
        }

    }

    public String getDescription() {
        return size + " Pizza with " + cheeseTop + " Cheese toppings, " + pepperoniTop + " Pepperoni toppings, and " + hamTop + " Ham toppings." + "\nTotal Price: " + calcCost();
    }

}

