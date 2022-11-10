import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstUiDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver" , "/Users/artem/IdeaProjects/Third_lesson_java/sources/geckodriver");

        WebDriver driver = new FirefoxDriver();

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

