package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class TekrarTesti {
    public static void main(String[] args) {
        //  1. Bir class oluşturun : AmazonSearchTest
        //  2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      //          a. web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");
      //  b. Search(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
      //  c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırı
        List<WebElement> aramaSonucu=driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi=aramaSonucu.get(0).getText();
        System.out.println(sonucYazisi);
        //d sadece sonuc yazisini yazdirin
        String[] sonucYazisiElementi=sonucYazisi.split(" ");
        System.out.println("City bike sonucu : "+sonucYazisiElementi[2]);

        //sonuc yazisini lambda ile yazdiriniz
        Arrays.stream((sonucYazisi.split(" "))).limit(3).skip(2).forEach(System.out::println);

      //  e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> resimler=driver.findElements(By.className("s-image"));

        WebElement ilkResim=resimler.get(0);
        ilkResim.click();
        //Sayfayi kapatiniz
        driver.close();












    }
}
