package day47_abstraction;

public final class FireFoxDriver extends RemoteWebDriver {
    @Override
    public void get(String URL){
        System.out.println("Opening " + URL + " in the FireFox browser.");
    }

    @Override
    public void quit(){
        System.out.println("Closing the FireFox browser");
    }
}
