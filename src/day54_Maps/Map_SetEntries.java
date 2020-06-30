package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {
        LinkedHashMap<String, String> fb = new LinkedHashMap<>();
        fb.put("Tester01", "password1");
        fb.put("Tester02", "password1");
        fb.put("Tester02", "password2");
        fb.put("Tester03", "password3");
        fb.put("Tester04", "password4");
        fb.put("Tester05", "password5");

        System.out.println(fb);

        System.out.println("======================================");

        for( String  eachKey   :  fb.keySet() ){
            //  System.out.println(eachKey +"  " +fb.get(eachKey));
            System.out.println(eachKey);
        }
        List<String> usernames = new ArrayList<>(fb.keySet());
        System.out.println(usernames);

        System.out.println("=======================================");

        for(String eachValue : fb.values()){
            System.out.println(eachValue);
        }

        List<String> passwords = new ArrayList<>(fb.values());
        System.out.println(passwords);

        System.out.println("=======================================");

        // now we will go to an advanced level of iteration
        // create a map that contains student names and student score: String and Integer
        // put 5 students names and their scores
        // write a program to print student names that scored less than 90
        // if score is less than 90 put in a list

        LinkedHashMap <String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> below90students = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> above90students = new LinkedHashMap<>();

        for( String eachKey : students.keySet()){
            // I can call get method from the map to get values of keys
            // then print only scores less than 90
            int eachValue = students.get(eachKey);
            if (eachValue < 90){
                below90students.put(eachKey, eachValue);

            }else {
                above90students.put(eachKey,eachValue);
            }

        }
        System.out.println(below90students); //{Hunar=89, Barzy=75, Hardi=80}

        System.out.println(above90students); //  {Adil=92, Rahman=93}




    }
}