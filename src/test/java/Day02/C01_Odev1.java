package Day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //    Yeni bir package olusturalim : day01
        //    Yeni bir class olusturalim : C03_GetMethods
        //    Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //    Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //    Sayfa basliginin "Amazon" icerdigini test edin
        String actualBaslik=driver.getTitle();
        String istenenKelime="Amazon";
        if (actualBaslik.contains(istenenKelime)) {
            System.out.println("test passed");
        }else
            System.out.println("test failed");

        //    Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //    Sayfa url'inin "amazon" icerdigini test edin.
        String  actualUrl=driver.getCurrentUrl();
        String istenenKelime2="amazon";
        if(actualUrl.contains(istenenKelime2))
            System.out.println("test passed");
        else
            System.out.println("test failed");
         //    Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //    Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String actualHtml=driver.getPageSource();
        String istenenKelime3="Gateway";
        if(actualHtml.contains(istenenKelime3))
            System.out.println("test passed");
        else System.out.println("test failed");
        //    Sayfayi kapatin.

       driver.close();
    }
}
