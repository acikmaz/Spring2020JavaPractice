package day47_abstraction;

public final class ChromeDriver extends RemoteWebDriver{

    @Override
    public void get(String URL){
        System.out.println("Opening " + URL + " in the Chrome browser.");
    }

    @Override
    public void quit(){
        System.out.println("Closing the chrome browser");
    }

}
