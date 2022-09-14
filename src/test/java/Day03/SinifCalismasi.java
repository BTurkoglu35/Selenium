package Day03;

import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SinifCalismasi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //  a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //  b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        //  c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement email = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signinButton = driver.findElement(By.name("commit"));
        //  d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //  i. Username : testtechproed@gmail.com
        //  ii. Password : Test1234!
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signinButton.submit();

        //  e. Actual user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualUserId=driver.findElement(By.className("navbar-text"));
        String expectedUserId="testtechproed@gmail.com";
        String actualUserIdStr=actualUserId.getText();
        if (actualUserIdStr.equals(expectedUserId)) {
            System.out.println("Actual user id testi passed : "+actualUserIdStr);
        }else
            System.out.println("Actual user id testi failed ");

        //  f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify)
           WebElement adress=driver.findElement(By.linkText("Addresses"));
           if(adress.isDisplayed()){
               System.out.println("Addresses testi passed");
           }else System.out.println("Addresses testi failed");

           WebElement signOut=driver.findElement(By.xpath("//div/a[3]"));
           if(signOut.isDisplayed()){
               System.out.println("Sign Out testi passed");
           }else System.out.println("Sign Out failed");
        //  3. Sayfada kac tane link oldugunu bulun.
         List<WebElement> linkListesi=driver.findElements(By.tagName("a"));
        System.out.println("tag sayisi = "+linkListesi.size());
     //   //4-linkleri yazdirin
        for (WebElement link : linkListesi) {
            System.out.println(link.getText());
        }

     //   //5-linkleri lambda ile yazdiriniz
     //   linkListesi.stream().forEach(t-> System.out.println(t.getText()));

     //   //6 sayfayi kapatiniz
          driver.close();
     }
}