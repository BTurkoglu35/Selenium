package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon.com'a gidiniz
        driver.get("http://www.amazon.com");
         //Amazonda nutella aratiniz
         WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
         aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
         //linkText ile locator olusturma
         driver.findElement(By.linkText("Sell products on Amazon")).click();



    }
}
