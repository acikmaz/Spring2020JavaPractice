package day47_abstraction;

public final class OperaDriver extends RemoteWebDriver{

    @Override
    public void get(String URL){
        System.out.println("Opening " + URL + " in the Opera browser.");
    }

    @Override
    public void quit(){
        System.out.println("Closing the Opera browser");
    }

}
