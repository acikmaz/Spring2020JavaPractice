package day02_Variables;

public class  EscapeSequences {
    public static void main(String[] args) {
        System.out.println("\t\tHello");

        // \t means a paragraph space

        System.out.println("cybertek school");
        System.out.println("cybertek \tschool\n\n\n");
        System.out.println("\ncybertek \nschool");
        System.out.println("my\nname\nis\nAli");
        // \n means start next line

        //print: My favourite TV show is "Game of Thrones"

        System.out.println("My favorite TV show is \"Game of Thrones\"");
        System.out.println("My favorite book is \"The little prince\"");

        // \" means double quote, prints double quote  to the console

        System.out.println("\\");
        // \\prints single slash on the console
        System.out.println("/");


        System.out.println("\'");
        System.out.println("'");
        System.out.println("My favorite book is \'The little prince\'"); //prints the ' quote
        System.out.println("My favorite book is 'The little prince'");  //prints the ' quote

    }
}
