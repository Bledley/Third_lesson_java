import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ChromeTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/artem/IdeaProjects/Third_lesson_java/sources/chromedriver");
        //WebDriver driver = new ChromeDriver();
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Nexus 5");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://google.com");

        /*WebElement btnAccept = driver.findElement(By.xpath("//*[@id='L2AGLb']"));
        btnAccept.click();*/

        WebElement element = driver.findElement(By.xpath("//*[@name='q']"));
        element.sendKeys("Selenium");
        Thread.sleep(3000);
        element.submit();
        Thread.sleep(3000);
        System.out.println("Page title is " + driver.getTitle());
        driver.quit();
    }
}



