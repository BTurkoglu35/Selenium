package Day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

      //  Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //  Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(1000,600));
      //  Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Thread.sleep(3000);
        System.out.println("yeni konumu" +driver.manage().window().getPosition());
        System.out.println("yeni olculeri"+driver.manage().window().getSize());
      //  8. Sayfayi kapatin
        driver.close();

    }
}
