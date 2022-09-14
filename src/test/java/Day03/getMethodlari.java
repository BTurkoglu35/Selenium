package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class getMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon. com gidiniz
        driver.get("https://www.amazon.com");
        //arama kutusunu locate ediniz
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        //arama kutusunun tagname'nin input oldugunu test ediniz
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName="input";
        if(actualTagName.equals(expectedTagName)) {
            System.out.println("tagneme test passed : "+actualTagName);
        }else System.out.println("tagname test failed");

        //Arama kutusunun name Attribute'nun degerinin field-keyeords oldgunu test ediniz
        String expectedAttributeName="field-keywords";
        String actualAttributeName=aramaKutusu.getAttribute("name");
        if(actualAttributeName.equals(expectedAttributeName)) {
            System.out.println("Attribute testi passed");
        }else System.out.println("Attribute testi failed");

        //Arama kutusunun konumuu yazdirin

        System.out.println("Arama kutusu : "+aramaKutusu.getLocation());


        //sayfayi kapatiniz
        driver.close();



    }
}
