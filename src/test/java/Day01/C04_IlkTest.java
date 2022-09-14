package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        /*
        1-amazon sayfasina giriniz
        2-basligin Amazon icerdigini test ediniz
        3-url'nin amazon icerdigini test ediniz
        4-sayfayi kapatiniz
         */
        String str="Amazon";
        String baslik=driver.getTitle();
        if(baslik.contains(str)){
            System.out.println("test passed");
        }else
            System.out.println("test failed");

        String url=driver.getCurrentUrl();
        String str2="amazon";
        if(url.contains(str2)){
            System.out.println("test passed");
        }else System.out.println("test failed");

        driver.close();






    }
}
