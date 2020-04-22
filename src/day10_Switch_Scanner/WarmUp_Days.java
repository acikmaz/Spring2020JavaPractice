package day10_Switch_Scanner;

/*
write a program that can display the days based on the numbers 1 ~ 7
 */

public class WarmUp_Days {
    public static void main(String[] args) {
        byte days = 5;
        String dayNames = "";
        String dayNames2 = "";

        if (days <=7 && days > 0){

            if (days == 1) {
                dayNames = "Monday";
            } else if (days == 2){
                dayNames = "Tuesday";
            }else if (days == 3){
                dayNames = "Wednesday";
            }else if (days == 4){
                dayNames = "Thursday";
            }else if (days == 5){
                dayNames = "Friday";
            }else if (days == 6){
                dayNames = "Saturday";
            }else{
                dayNames = "Sunday";
            }

        } else {
            dayNames = "invalid Entry";
        }

        System.out.println(dayNames);

        // Ternary nested in IF

        if (days <=7 && days > 0){

            dayNames2 = (days == 1) ? "Monday" : (days == 2) ? "Tuesday" : (days == 3) ? "Wednesday"
                    : (days == 4) ? "Thursday" : (days == 5) ? "Friday" : (days == 6) ? "Saturday" : "Sunday";
        } else {
            dayNames2 = "invalid Entry";
        }

        System.out.println(dayNames2);

        String dayNames3 = "";
        dayNames3 = (days == 1) ? "Monday" : (days == 2) ? "Tuesday" : (days == 3) ? "Wednesday"
                : (days == 4) ? "Thursday" : (days == 5) ? "Friday" : (days == 6) ? "Saturday"
                : (days ==7) ? "Sunday" : "Invalid Entry";
        System.out.println(dayNames3);



    }
}
