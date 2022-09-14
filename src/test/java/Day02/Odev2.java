package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev2 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

     //  2. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
     //          (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("http://www.youtube.com");
        String actualTitle=driver.getTitle();
        String expectedTitle="youtube";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("youtube baslik test passed");
        }else
            System.out.println("dogru baslik"+ actualTitle);
     //  3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualUrl =driver.getCurrentUrl();
        String arananKelime="youtube";
        if (actualUrl.contains(arananKelime)){
            System.out.println("youtube url test passed");
        }else System.out.println("youtube url test failed actual url "+actualUrl);
     //  4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
     //  5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);
     //  6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);
     //  7. Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);
     //  8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
     //  9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
     //  doğru başlığı(Actual Title) yazdırın.
        String actualTitleAmazon=driver.getTitle();
        String arananKelime2="Amazon";
        if (actualTitleAmazon.contains(arananKelime2)) {
            System.out.println("amazon baslik test passed");
        }else
            System.out.println("amazon baslik test failed actual title "+actualTitleAmazon);
     //  10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru  URL'yi yazdırın
        String actualUrlAmazon= driver.getCurrentUrl();
        String expectedUrlAmazon= "https://www.amazon.com/";
        if(actualUrlAmazon.equals(expectedUrlAmazon)){
            System.out.println("amazon url test passed");
        }else System.out.println("amazon url test failed "+actualUrlAmazon);


     //  11.Sayfayi kapatin

        driver.quit();

    }
}
