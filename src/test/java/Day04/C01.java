package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
      // 1 ) Bir class oluşturun : Locators_css
      // 2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      //         a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
      // b. Locate email textboxhttp://a.testaddressbook.com
       WebElement email= driver.findElement(By.cssSelector("#session_email"));

      // c. Locate password textbox ve
        WebElement password= driver.findElement(By.cssSelector("#session_password"));
      // d. Locate signin button
        WebElement signinButton= driver.findElement(By.cssSelector("input[name='commit']"));
      // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signinButton.submit();
      // i. Username : testtechproed@gmail.com
      // ii. Password : Test1234!
    }
}
