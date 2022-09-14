package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev1 {
    public static void main(String[] args) throws InterruptedException {
          /*
        1.Yeni bir class olusturalim (Homework)
        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        yazdirin.
        4.https://www.walmart.com/ sayfasina gidin.
        5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        6. Tekrar "facebook" sayfasina donun
        7. Sayfayi yenileyin
        8. Sayfayi tam sayfa (maximize) yapin
        9.Browser'i kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


    //    2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
    //    oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle=driver.getTitle();
        String expectedTitle="facebook";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("baslik dogru");
        }else System.out.println("Actual title "+actualTitle);
    //    3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.
        String actualUrl=driver.getCurrentUrl();
        String arananKelime="facebook";
        if(actualUrl.contains(arananKelime)){
            System.out.println("test passed");
        }else
            System.out.println("test failed actual url "+actualUrl);
    //    4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com");
    //    5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String walmartTitle=driver.getTitle();
        String arananKelime2="Walmart.com";
        if (walmartTitle.contains(arananKelime2)){
            System.out.println("walmart baslik  test passed");
        }else
            System.out.println("walmart baslik test failed");
    //    6. Tekrar "facebook" sayfasina donun
        Thread.sleep(3000);
        driver.navigate().back();
    //    7. Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();
    //    8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
    //    9.Browser'i kapatin
        driver.quit();

    }
}
