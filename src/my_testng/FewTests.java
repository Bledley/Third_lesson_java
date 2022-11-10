package my_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FewTests {
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/artem/IdeaProjects/Third_lesson_java/sources/chromedriver");
    }

    @Test
    public void googleTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(5_000);
        System.out.println("I'm a google test");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
        driver.quit();
    }

    @Test
    public void duckDuckGo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com");
        Thread.sleep(5_000);
        System.out.println("I'm a duckduckgo test");
        Assert.assertTrue(driver.getCurrentUrl().contains("duckduckgo"));
        driver.quit();
    }

    @AfterTest
    public void shutDown() {
//        driver.quit();
    }
}

