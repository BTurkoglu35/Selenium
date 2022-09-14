package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.navigate().to("https://facebook.com");//navigate to sayfada ileri geri yapacaksak kullanilir
                                        //driver.get() methodu gibi bizi istedgimiz url'ye goturur.
         Thread.sleep(3000);
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);
        driver.navigate().back();//bir onceki sayfaya geri gitmek icin kullanilir
        Thread.sleep(3000);
        driver.navigate().forward();//bir snraki sayfaya gitmek icin kullanilir
        Thread.sleep(3000);
        driver.navigate().refresh();//sayfayi yenilemek icin kullanilir
       driver.quit();



    }
}
