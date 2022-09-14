package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpath {
    /*
 https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
 2- Add Element butonuna basin
 Delete butonu’nun gorunur oldugunu test edin
 Delete tusuna basin
 “Add/Remove Elements” yazisinin gorunur oldugunu test edin

  */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        //driver.findElement(By.xpath("//*[text()='Add Element']"));//xpath'de text ile locate alma
        /*
        locate alirken sadece text kullanicaksak //*[text()='Add Element'] bu formatta kullanilir
        Attribute kullanacaksak //*[@onclick='addElement()'] bu format kullanilir.
         */

        // Delete butonu’nun gorunur oldugunu test edin
        Thread.sleep(3000);
        WebElement delete= driver.findElement(By.xpath("//*[@class='added-manually']"));
        if(delete.isDisplayed()){
            System.out.println("Delete gorunurlugu testi passed");
        }else System.out.println("Delete gorunurlugu testi failed");
        // Delete tusuna basin
        delete.click();
        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin d
        WebElement addRemove= driver.findElement(By.xpath("//h3"));
         if(addRemove.isDisplayed()){
             System.out.println("Add remove testi passed");
         }else System.out.println("Add remove testi failed ");

         //Sayfayi kapatiniz
         driver.close();
    }
}
