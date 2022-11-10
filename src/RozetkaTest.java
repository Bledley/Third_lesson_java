import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RozetkaTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/artem/IdeaProjects/Third_lesson_java/sources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/mobile-phones/c80003/");
        Thread.sleep(3000);
        WebElement firstTopSeller = driver.findElement(By.xpath("(//*[@class=\"goods-tile__label promo-label promo-label_type_popularity ng-star-inserted\"])[1]/../a[1]/*"));
        String firstTopSellerName = firstTopSeller.getAttribute("alt");
        System.out.println(firstTopSellerName);
        WebElement secondTopSeller = driver.findElement(By.xpath("(//*[@class=\"goods-tile__label promo-label promo-label_type_popularity ng-star-inserted\"])[2]/../a[1]/*"));
        String secondTopSellerName = secondTopSeller.getAttribute("alt");
        System.out.println(secondTopSellerName);
        WebElement thirdTopSeller = driver.findElement(By.xpath("(//*[@class=\"goods-tile__label promo-label promo-label_type_popularity ng-star-inserted\"])[3]/../a[1]/*"));
        String thirdTopSellerName = thirdTopSeller.getAttribute("alt");
        System.out.println(thirdTopSellerName);
        driver.quit();
}
}

