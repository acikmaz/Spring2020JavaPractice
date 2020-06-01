package day44_Exceptions;

public class Browsers {
    protected void openBrowser(){
        System.out.println("opening the default browser");
    }

    protected void closeBrowser(){
        System.out.println("closing the default browser");
    }
}

class ChromeBrowser extends Browsers{
    protected void openBrowser(){
        System.out.println("opening the Chrome browser");
    }
    protected void closeBrowser(){
        System.out.println("closing the Chrome browser");
    }
}

class FireFoxBrowser extends Browsers{
    protected void openBrowser(){
        System.out.println("opening the FireFox browser");
    }
    protected void closeBrowser(){
        System.out.println("closing the FireFox browser");
    }
}

class EdgeBrowser extends Browsers{
    @Override
    protected void openBrowser(){
        System.out.println("opening the Edge browser");
    }

    @Override
    protected void closeBrowser(){
        System.out.println("closing the Edge browser");
    }
}

class Test{
    public static void main(String[]args){
        EdgeBrowser obj = new EdgeBrowser();

        obj.openBrowser();
        obj.closeBrowser();

        System.out.println("===================");
        ChromeBrowser obj2 = new ChromeBrowser();

        obj2.openBrowser();
        obj2.closeBrowser();

    }
}