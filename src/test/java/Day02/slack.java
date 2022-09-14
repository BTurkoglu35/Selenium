package Day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class slack {
    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //  a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        // b. Sign in butonuna basin
        driver.findElement(By.xpath("//a[@id='sign-in']")).click();
        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement email = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signButton.click();
//  WebElement sonucYaziElementi=driver.findElement(By.xpath("//h1[text()='Welcome to Address Book']"));
//  String expectedBulunacakKelime="Welcome to Address Book";
//  String actualYaziStr= sonucYaziElementi.getText();
//             Assert.assertTrue(actualYaziStr.contains(sonucYaziElementi.getText()));
//             driver.findElement(By.xpath("//a[@data-test='addresses']")).isDisplayed();
//             driver.findElement(By.xpath("//a[@data-test='sign-out']")).isDisplayed();
//  List<WebElement> list=driver.findElements(By.tagName("a"));
//              System.out.println("link sayisi =  " + list.size());
//              driver.close();

    }}