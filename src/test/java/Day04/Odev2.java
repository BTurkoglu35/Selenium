package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  https://www.amazon.com/ adresine gidin
        driver.get("https://Amazon.com");
      //  Sayfayi “refresh” yapin
        driver.navigate().refresh();
      //  Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String baslik=driver.getTitle();
        if(baslik.contains("Spend less")){
            System.out.println("Baslik testi passed");
        }else System.out.println("Baslik testi failed");
      //  Gift Cards sekmesine basin
        WebElement giftCards=driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_3']"));
        giftCards.click();
      //  Birthday butonuna basin
       driver.findElement(By.xpath("//*[@alt='Birthday gift cards']")).click();
      //  Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> resimler=driver.findElements(By.xpath("//*[@alt='Amazon.com eGift Card']"));
        WebElement ilkResim=resimler.get(0);
        ilkResim.click();
        //  9- Gift card details’den 25 $’i secin
        driver.findElement(By.id("a-autoid-28")).click();
      //  10-Urun ucretinin 25$ oldugunu test edin
        Thread.sleep(3000);
        WebElement actualUrunFiyati=driver.findElement(By.xpath("//*[@id='gc-live-preview-amount']"));
       if (actualUrunFiyati.getText().equals("$25.00")){
           System.out.println("Urun fiyati testi passed");
       }else System.out.println("Urun fiyati testi failed ");
      //  10-Sayfayi kapatin
        driver.close();









    }
}
