package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("actual title "+        driver.getTitle()); //gidilen sayfanin basligini getirir.
        System.out.println("actual url "+          driver.getCurrentUrl()); //gidilen sayfanin url'sini getirir.

        System.out.println(driver.getPageSource()); //gidilen sayfanin kaynak kodlarini getirir.

    }
}
