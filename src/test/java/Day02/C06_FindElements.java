package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //amazon sayfasina gidiniz
        driver.get("https://amazon.com");
        //Amazon sayfasindaki ismi input olan taglarin sayisini yazdirin
        List<WebElement> tag = driver.findElements(By.tagName("input"));
        System.out.println("tag sayisi " + tag.size());

    }
}
