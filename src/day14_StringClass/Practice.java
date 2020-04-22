package day14_StringClass;

public class Practice {
    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";

        String userInputGmail = "CyberTekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userInputGmail);

        if(result){
            System.out.println("Logged in");
        }

        System.out.println("=========================");

        /*
        valid password MUST contain a special character such as (!, _ , $)
        valid password should not contain spaces
         */


        String passWord = "mmasd1234";

        if (passWord.contains(" ")){
            System.out.println("Password cannot have space in it");
        } else{
            System.out.println("Valid password");
        }

        System.out.println("=========================");

        /*
        every websites has "www." at the beginning of the web address
         */

        String webAddress = "wwww.amazon.com";

        if (webAddress.contains("www.")){ // true
            System.out.println("valid");
        }

        System.out.println("=========================");

        /*
        every single gmail address ends with @gmail.com
         */

        String email = "CybertekSchool@Yahoo.com";

        if ( email.endsWith("@gmail.com")){
            System.out.println("Valid Gmail");

        } else {
            System.out.println("Invalid Gmail");
        }

        System.out.println("=========================");








    }
}
