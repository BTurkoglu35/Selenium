package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        //AMAZON.COM' A GIDINIZ
        //Kaynak kodlari icin Getway kelimesinin olup olmadigini test ediniz
        driver.get("https://www.amazon.com");
        String kaynakKodu=driver.getPageSource();
        String str="Gateway";
        if(kaynakKodu.contains(str)){
            System.out.println("test passed");
        }else System.out.println("test failed");
       driver.close();
       driver.quit();//birden fazla pencere varsa hepsini kapatir.


    }
}
