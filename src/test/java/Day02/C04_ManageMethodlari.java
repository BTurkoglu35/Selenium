package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();;
         driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));;//sayfanin acilmasi icin sure belirler sayfa acilmazsa g=hata verir
         driver.get("http://techproeducation.com");
          driver.close();;
         /*
         ileride wait konusunu daha detayli ele alacagiz
         Bir sayfa acilirken ,ilk basta sayfanin icerisinde bulunan elementlere gore bir
         yukleme suresine ihtiyac vardir veya bir webelementin kullanilabilmesi icin zaman ihtiyaz olabilir
         implicitlyWaitbize sayfanin yuklenemsini ve sayfadaki elementlere ulasim icin beklenecek maximum sureyi belirleme olanagi tanir.
          */

    }
}
