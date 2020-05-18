package day41_Inheritance;

public class EBook extends Book{
    /*
    title (inherited)
    author (inherited)
    price (inherited)
    size (declared)
    pages (declared)
    readbook() (declared)
    toString()(inherited)
     */

    public String size;
    public int pages;

    public void readBook(){
        System.out.println("reading "+title);
    }



}