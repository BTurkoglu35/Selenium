package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna 10 kez basinız
        WebElement addElement = driver.findElement(By.xpath("//*[text()='Add Element']"));
        for (int i = 0; i <10 ; i++) {
            addElement.click();
        }
        //3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement>deleteButonSayisi=driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        if(deleteButonSayisi.size()==10){
            System.out.println("10 kez Add element butonuna basılma test passed");
        }else System.out.println("10 kez Add element butonuna basılma test failed");


      //  4 - Delete butonuna görünmeyene kadar basınız

        for (int i = 0; i <deleteButonSayisi.size() ; i++) {
            deleteButonSayisi.get(i).click();
        }

            // 5- Delete butonunun görünmediğini test ediniz
        WebElement actualsonSayfa=driver.findElement(By.className("no-js"));
        String actualSonSayfaText=actualsonSayfa.getText();
        if(!actualSonSayfaText.contains("Delete")) {
            System.out.println("Test passed");
        }else System.out.println("Test failed");

        //6 Sayfayi kapatin
        driver.close();




        }





    }


