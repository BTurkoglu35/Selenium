package Day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev3 {
    public static void main(String[] args) {
       //login test
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get(" http://a.testaddressbook.com");
       //b. Sign in butonuna basin
       driver.findElement(By.id("sign-in")).click();

        //c. email textbox,password textbox, and signin button elementlerini locate
        WebElement email=driver.findElement(By.id("session_email"));
        WebElement password=driver.findElement(By.id("session_password"));
        WebElement signin=driver.findElement(By.name("commit"));

        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();


      //i. Username :
      //testtechproed@gmail.com
     //ii. Password : Test1234!//        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
     WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@class='text-center']"));
     String expectedBulunacakKelime="Welcome to Address Book";
     String actualYaziStr=sonucYaziElementi.getText();
        System.out.println(actualYaziStr);
     if(actualYaziStr.equals(expectedBulunacakKelime)){
         System.out.println("test passed");
      }else System.out.println("test failed");
     //        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
     //3. Sayfada kac tane link oldugunu bulun.
       List<WebElement> list=driver.findElements(By.tagName("a"));
       System.out.println("link sayisi =  " + list.size());
   //  driver.close();

   }
}
