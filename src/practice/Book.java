package practice;
public class Book{

    String title;
    String author;
    private String tableOfContents;

    private int nextPage = 1;

    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    public void addChapter (String titleOfTheChapter, int PageNumber){
        tableOfContents += "\n" + titleOfTheChapter + "..." + nextPage;
        nextPage += PageNumber;
    }

    public int getPages (){
        return nextPage-1;
    }

    public String getTableOfContents (){
        return tableOfContents;
    }

    public String toString(){
        return title +"\n"+ author;
    }

    Car car = new Car("ali", "ali", 4, 45, 50);

}