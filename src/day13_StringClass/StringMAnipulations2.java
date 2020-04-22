package day13_StringClass;

public class StringMAnipulations2 {
    public static void main(String[] args) {

        String str = "Cybertek School is the best";
        //            012345678
        String schoolName = str.substring(0,8);

        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";

        String firstName = fullName.substring(0,6);

        String lastName = fullName.substring(7,11+1);

        System.out.println(firstName);
        System.out.println(lastName);

        String Murtaza = "Murtaza Nazeeri";

        String firstNameM = Murtaza.substring(0,6+1);

        String lastNameM = Murtaza.substring(8,14+1);

        System.out.println(firstNameM);
        System.out.println(lastNameM);


        String gmail = lastNameM.concat("_").concat(firstNameM).concat("@gmail.com");

        // String gmail = lastNameM + "_" + firstNameM + "@gmail.com"; // exactly the same as above

        System.out.println(gmail);

        String s1 = "I love Java Programming Language";
        //           01234567

        String className = s1.substring(7);

        System.out.println(className);

        String s2 = "I like C# Programming Language";

                s2 = s2.replace("C#", "Java");

        System.out.println(s2);

        String name = "COVID 18";
                name = name.replace("8", "9");

        System.out.println(name);

        String r1 = "I like C#, C# is fun, C# is cool";

            r1 = r1.replaceFirst("C#", "Java");

        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");

        System.out.println(r2);









    }
}
