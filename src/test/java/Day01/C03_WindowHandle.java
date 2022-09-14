package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle());//girilen sayfanin hash kodunu getirir
        //farkli pencereler arasinda gezinebilmek icin bu methodu kullaniriz.
    }
}
