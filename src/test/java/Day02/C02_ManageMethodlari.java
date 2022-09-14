package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //    Yeni bir Class olusturalim.C06_ManageWindow
        //    Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //    Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("pencere konumu= "+driver.manage().window().getPosition());//Acilan browser'in konumunu verir
        System.out.println("pencere olculeri= "+driver.manage().window().getSize());//Acilan pencerenin olculerini verir

        //    Sayfayi simge durumuna getirin
        driver.manage().window().minimize();//sayfayi simge durumuna getirir

        //    simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        //    Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("yeni pencere konumu= "+driver.manage().window().getPosition());//Acilan pencerenin konumunu verir
        System.out.println("yeni pencere olculeri= "+driver.manage().window().getSize());//Acilan pencerenin olculerini verir

        //    Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        //    Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("fullscreen pencere konumu= "+driver.manage().window().getPosition());//Acilan pencerenin konumunu verir
        System.out.println("fullscreen pencere olculeri= "+driver.manage().window().getSize());//Acilan pencerenin olculerini verir
        //    Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
