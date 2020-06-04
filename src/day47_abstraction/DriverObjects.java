package day47_abstraction;

public class DriverObjects {

    public static void main(String[] args) {
        String URL = "https://www.google.com";
        ChromeDriver driver = new ChromeDriver();
                    driver.get(URL);
                    driver.quit();

        System.out.println("+++++++++++++++++++++++++++++++++");
        FireFoxDriver driver2 = new FireFoxDriver();
        driver2.get(URL);
        driver2.quit();

        System.out.println("+++++++++++++++++++++++++++++++++");
        OperaDriver driver3 = new OperaDriver();
        driver3.get(URL);
        driver3.quit();


    }

}
